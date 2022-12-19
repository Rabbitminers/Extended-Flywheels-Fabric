package com.rabbitminers.extendedflywheels.wheel;

import com.rabbitminers.extendedflywheels.registry.EFTileEntities;
import com.simibubi.create.AllShapes;
import com.simibubi.create.content.contraptions.base.RotatedPillarKineticBlock;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelBlock;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelTileEntity;

import com.simibubi.create.foundation.block.ITE;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import org.jetbrains.annotations.NotNull;

public class CustomFlywheelBlock extends RotatedPillarKineticBlock implements ITE<CustomFlywheelTileEntity> {
	public CustomFlywheelBlock(Properties properties) {
		super(properties);
	}


	@Override
	public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
		return face.getAxis() == getRotationAxis(state);
	}

	@Override
	public Direction.Axis getRotationAxis(BlockState state) {
		return state.getValue(AXIS);
	}

	@Override
	public float getParticleTargetRadius() {
		return 2f;
	}

	@Override
	public float getParticleInitialRadius() {
		return 1.75f;
	}

	@Override
	public Class<CustomFlywheelTileEntity> getTileEntityClass() {
		return CustomFlywheelTileEntity.class;
	}
	@Override
	public @NotNull RenderShape getRenderShape(BlockState pState) {
		return RenderShape.ENTITYBLOCK_ANIMATED;
	}

	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		return AllShapes.LARGE_GEAR.get(pState.getValue(AXIS));
	}


	@Override
	public BlockEntityType<? extends CustomFlywheelTileEntity> getTileEntityType() {
		return EFTileEntities.CUSTOM_FLYWHEEL_BLOCK_ENTITY.get();
	}
}
