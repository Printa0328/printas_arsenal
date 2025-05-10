package com.github.printa.arsenal.server.item.util;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.registry.EnchantmentRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Arsenal.MODID)
@Mod.EventBusSubscriber(modid = Arsenal.MODID)
public class ItemEvent {

    private int tick = 0;

    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public void onServerTick(TickEvent.ServerTickEvent event) {
        if (event.phase != TickEvent.Phase.START) return;

        tick++;
        LOGGER.info("Tick: " + tick);  // LOGGER 사용
        MinecraftServer server = event.getServer();

        for (ServerLevel level : server.getAllLevels()) {
            for (Entity entity : level.getAllEntities()) {
                if (!(entity instanceof ItemEntity item)) continue;

                BlockPos pos = item.blockPosition();
                BlockState state = level.getBlockState(pos);

                if (state.is(Blocks.FIRE) || state.is(Blocks.LAVA)) {
                    ItemStack stack = item.getItem();
                    if (stack.isDamageableItem() && stack.getDamageValue() > 0 && (tick % 10 == 0) && EnchantmentHelper.getItemEnchantmentLevel(EnchantmentRegistry.THERMAL_REPAIR.get(), stack) > 0) {
                        stack.setDamageValue(stack.getDamageValue() - 1);
                        System.out.println("Is item damageable: " + stack.isDamageableItem());
                        System.out.println("Item damage value: " + stack.getDamageValue());
                        System.out.println("Enchantment level: " + EnchantmentHelper.getItemEnchantmentLevel(EnchantmentRegistry.THERMAL_REPAIR.get(), stack));
                    }
                }
            }
        }
    }
}