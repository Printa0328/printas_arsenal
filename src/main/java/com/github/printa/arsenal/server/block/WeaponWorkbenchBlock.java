package com.github.printa.arsenal.server.block;

import com.github.printa.arsenal.server.entity.blockentity.WeaponWorkbenchBlock_Entity;
import com.github.printa.arsenal.server.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.SmithingMenu;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.pathfinder.PathComputationType;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class WeaponWorkbenchBlock extends BaseEntityBlock {
    private static final Component CONTAINER_TITLE = Component.translatable("arsenal.container.weapon_workbench");
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    private static final VoxelShape BASE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);

    public WeaponWorkbenchBlock() {
        super(BlockBehaviour.Properties.of()
                .emissiveRendering((block, world, pos) -> true)
                .mapColor(MapColor.WOOD)
                .strength(2.5F)
                .sound(SoundType.WOOD));
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public MenuProvider getMenuProvider(BlockState blocksate, Level level, BlockPos blockpos) {
        return new SimpleMenuProvider((p_277304_, p_277305_, p_277306_) -> {
            return new SmithingMenu(p_277304_, p_277305_, ContainerLevelAccess.create(level, blockpos));
        }, CONTAINER_TITLE);
    }

    public InteractionResult use(BlockState p_56428_, Level p_56429_, BlockPos p_56430_, Player p_56431_, InteractionHand p_56432_, BlockHitResult p_56433_) {
        if (p_56429_.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            p_56431_.openMenu(p_56428_.getMenuProvider(p_56429_, p_56430_));
            p_56431_.awardStat(Stats.INTERACT_WITH_SMITHING_TABLE);
            return InteractionResult.CONSUME;
        }
    }

    public BlockState getStateForPlacement(BlockPlaceContext placecontext) {
        return this.defaultBlockState().setValue(FACING, placecontext.getHorizontalDirection());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WeaponWorkbenchBlock_Entity(pos, state);
    }

    public BlockState rotate(BlockState blockstate, Rotation rotation) {
        return blockstate.setValue(FACING, rotation.rotate(blockstate.getValue(FACING)));
    }

    public BlockState mirror(BlockState blockstate, Mirror mirror) {
        return blockstate.rotate(mirror.getRotation(blockstate.getValue(FACING)));
    }


    public boolean isPathfindable(BlockState p_48799_, BlockGetter p_48800_, BlockPos p_48801_, PathComputationType p_48802_) {
        return false;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_48814_) {
        p_48814_.add(FACING);
    }

    @Nullable
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level p_152180_, BlockState p_152181_, BlockEntityType<T> p_152182_) {
        return createTickerHelper(p_152182_, ModBlockEntities.WEAPON_WORKBENCH.get(), WeaponWorkbenchBlock_Entity::commonTick);
    }
}
