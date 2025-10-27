package com.github.printa.arsenal.api;

import com.github.printa.arsenal.Arsenal;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class Messages {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;

    private static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel net = NetworkRegistry.ChannelBuilder
                .named(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "messages"))
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
