package com.github.printa.arsenal.server.message;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.item.util.UpdatesStackTags;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class UpdateItemTagMessage {

    private final int entityId;
    private final ItemStack itemStackFrom;

    public UpdateItemTagMessage(int entityId, ItemStack itemStackFrom) {
        this.entityId = entityId;
        this.itemStackFrom = itemStackFrom;
    }

    public static UpdateItemTagMessage read(FriendlyByteBuf buf) {
        int entityId = buf.readInt();
        ItemStack itemStackFrom = buf.readItem();
        return new UpdateItemTagMessage(entityId, itemStackFrom);
    }

    public static void write(UpdateItemTagMessage message, FriendlyByteBuf buf) {
        buf.writeInt(message.entityId);
        buf.writeItem(message.itemStackFrom);
    }

    public static void handle(UpdateItemTagMessage message, Supplier<NetworkEvent.Context> context) {
        context.get().setPacketHandled(true);
        Player playerSided = context.get().getSender();
        if (context.get().getDirection().getReceptionSide() == LogicalSide.CLIENT) {
            playerSided = Arsenal.PROXY.getClientSidePlayer();
        }
        if (playerSided != null) {

            Entity holder = playerSided.level().getEntity(message.entityId);

            if (holder instanceof LivingEntity living) {
                ItemStack stackFrom = message.itemStackFrom;
                ItemStack to = null;
                if (living.getItemInHand(InteractionHand.MAIN_HAND).is(stackFrom.getItem())) {
                    to = living.getItemInHand(InteractionHand.MAIN_HAND);
                } else if (living.getItemInHand(InteractionHand.OFF_HAND).is(stackFrom.getItem())) {
                    to = living.getItemInHand(InteractionHand.OFF_HAND);
                }
                if (to != null && to.getItem() instanceof UpdatesStackTags updatesStackTags && stackFrom.getTag() != null) {
                    updatesStackTags.updateTagFromServer(holder, to, stackFrom.getTag());
                }
            }
        }
    }
}
