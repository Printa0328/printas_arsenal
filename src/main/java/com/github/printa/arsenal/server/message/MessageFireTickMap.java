package com.github.printa.arsenal.server.message;

import com.github.printa.arsenal.CommonProxy;
import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.network.NetworkEvent;

import java.util.UUID;

public class MessageFireTickMap {

    private final UUID playerUUID;
    private final int fireTick;

    public MessageFireTickMap(UUID playerUUID, int fireTick) {
        this.playerUUID = playerUUID;
        this.fireTick = fireTick;
    }

    public static MessageFireTickMap read(FriendlyByteBuf buf) {
        return new MessageFireTickMap(buf.readUUID(), buf.readInt());
    }

    public static void write(MessageFireTickMap message, FriendlyByteBuf buf) {
        buf.writeUUID(message.playerUUID);
        buf.writeInt(message.fireTick);
    }

    public static class Handler {
        public Handler() {
        }

        public static void handle(MessageFireTickMap message, MessagePassingQueue.Supplier<NetworkEvent.Context> contextSupplier) {
            NetworkEvent.Context context = contextSupplier.get();
            context.enqueueWork(() -> {
                CommonProxy.ClientFireTickCache.FIRE_TICK_MAP.put(message.playerUUID, message.fireTick);
            });
            context.setPacketHandled(true);
        }
    }
}