package com.github.printa.arsenal.server.message;

import com.github.printa.arsenal.Arsenal;
import io.netty.buffer.ByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class MessageUpdateblockentity {

    public long blockPos;
    public ItemStack heldStack;

    public MessageUpdateblockentity(long blockPos, ItemStack heldStack) {
        this.blockPos = blockPos;
        this.heldStack = heldStack;

    }

    public MessageUpdateblockentity() {
    }

    public static MessageUpdateblockentity read(FriendlyByteBuf buf) {
        return new MessageUpdateblockentity(buf.readLong(), readItemStack(buf));
    }

    public static void write(MessageUpdateblockentity message, FriendlyByteBuf buf) {
        buf.writeLong(message.blockPos);
        writeItemStack(buf, message.heldStack);
    }

    public static void writeItemStack(ByteBuf to, ItemStack stack) {
        FriendlyByteBuf pb = new FriendlyByteBuf(to);
        pb.writeItem(stack);
    }

    /**
     * Read an {@link ItemStack} from the byte buffer provided. It uses the minecraft encoding.
     *
     * @param from The buffer to read from
     * @return The itemstack read
     */
    public static ItemStack readItemStack(ByteBuf from) {
        FriendlyByteBuf pb = new FriendlyByteBuf(from);
        try {
            return pb.readItem();
        } catch (Exception e) {
            // Unpossible?
            throw new RuntimeException(e);
        }
    }

    public static class Handler {
        public Handler() {
        }

        public static void handle(MessageUpdateblockentity message, Supplier<NetworkEvent.Context> context) {
            context.get().setPacketHandled(true);
            Player player = context.get().getSender();
            if(context.get().getDirection().getReceptionSide() == LogicalSide.CLIENT){
                player = Arsenal.PROXY.getClientSidePlayer();
            }
            if (player != null) {
                if (player.level() != null) {
                    BlockPos pos = BlockPos.of(message.blockPos);
                    if (player.level().getBlockEntity(pos) != null) {
                    }
                }
            }
        }
    }

}