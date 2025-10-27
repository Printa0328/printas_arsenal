package com.github.printa.arsenal.server.block;

import com.github.printa.arsenal.server.entity.blockentity.WeaponWorkbenchBlock_Entity;
import com.github.printa.arsenal.server.inventory.WeaponWorkbench_Menu;
import com.github.printa.arsenal.server.registries.BlockEntityRegistry;
import com.github.printa.arsenal.server.registries.ItemRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class WeaponWorkbenchBlock extends BaseEntityBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("container.arsenal.weapon_workbench");
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final VoxelShape BASE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public WeaponWorkbenchBlock() {
        super(Properties.of()
                .mapColor(MapColor.WOOD)
                .noOcclusion()
                .strength(2.5F)
                .sound(SoundType.WOOD));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return new SimpleMenuProvider((p_277304_, p_277305_, p_277306_) -> {
            return new WeaponWorkbench_Menu(p_277304_, p_277305_);
        }, CONTAINER_TITLE);
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (itemstack.getItem() == ItemRegistry.IGNITION_CHARGE.get()) {
            BlockEntity blockEntity = level.getBlockEntity(pos);
            if (blockEntity instanceof WeaponWorkbenchBlock_Entity weaponWorkbenchEntity) {
                if (!weaponWorkbenchEntity.fire) {
                    if (!player.isCreative()) {
                        itemstack.shrink(1);
                    }
                    level.playSound((Player)null, pos, SoundEvents.NETHERITE_BLOCK_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);
                    weaponWorkbenchEntity.fire = true;
                    weaponWorkbenchEntity.setChanged();
                    level.sendBlockUpdated(pos, state, state, 3);
                    return InteractionResult.SUCCESS;
                }
            }
        }

        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(level, pos));
            return InteractionResult.CONSUME;
        }
    }

    public BlockState getStateForPlacement(BlockPlaceContext p_48781_) {
        return this.defaultBlockState().setValue(FACING, p_48781_.getHorizontalDirection().getCounterClockWise());
    }

    @Override
    public RenderShape getRenderShape(BlockState p51567) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    public BlockState rotate(BlockState p_48811_, Rotation p_48812_) {
        return p_48811_.setValue(FACING, p_48812_.rotate(p_48811_.getValue(FACING)));
    }

    public VoxelShape getShape(BlockState p48816, BlockGetter p48817, BlockPos p48818, CollisionContext p48819) {
        return BASE;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_48814_) {
        p_48814_.add(FACING);
    }

    public boolean isPathfindable(BlockState p_48799_, BlockGetter p_48800_, BlockPos p_48801_, PathComputationType p_48802_) {
        return false;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WeaponWorkbenchBlock_Entity(pos, state);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_152180_, BlockState p_152181_, BlockEntityType<T> p_152182_) {
        return createTickerHelper(p_152182_, BlockEntityRegistry.WEAPON_WORKBENCH.get(), WeaponWorkbenchBlock_Entity::commonTick);
    }
}
