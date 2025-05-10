package com.github.printa.arsenal.server.message;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class MessageFireTick {

    private int fireTick;

    public MessageFireTick(int fireTick) {
        this.fireTick = fireTick;
    }

    public static MessageFireTick read(FriendlyByteBuf buf) {
        return new MessageFireTick(buf.readInt());
    }

    public static void write(MessageFireTick message, FriendlyByteBuf buf) {
        buf.writeInt(message.fireTick);
    }

    public static class Handler {
        public Handler() {
        }

        public static void handle(MessageFireTick message, Supplier<NetworkEvent.Context> contextSupplier) {
            NetworkEvent.Context context = contextSupplier.get();
            context.enqueueWork(() -> {
                ItemStack stack = context.getSender().getMainHandItem();
                stack.getOrCreateTag().putInt("fireTick", message.fireTick);
            });
            context.setPacketHandled(true);
        }
    }
}
