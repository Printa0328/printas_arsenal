package com.github.printa.arsenal.api.client;

import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;

import java.util.HashMap;
import java.util.UUID;

public class ClientMagicData {
    public static HashMap<UUID, KeyframeAnimationPlayer> castingAnimationPlayerLookup = new HashMap<>();
}
