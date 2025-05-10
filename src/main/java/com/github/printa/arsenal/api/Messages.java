package com.github.printa.arsenal.api;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.api.player.ClientSpellCastHelper;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

import java.util.function.Supplier;

public class Messages {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;

    private static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(Arsenal.MODID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = net;

    //    net.messageBuilder(ClientSpellCastHelper.class, id(), NetworkDirection.PLAY_TO_CLIENT)
    //            .decoder(ClientSpellCastHelper::fromBytes)
    //            .encoder(ClientSpellCastHelper::toBytes)
    //            .consumerMainThread(ClientSpellCastHelper::handle)
    //            .add();
    }
}
