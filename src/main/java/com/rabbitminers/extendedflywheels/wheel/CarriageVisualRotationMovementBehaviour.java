package com.rabbitminers.extendedflywheels.wheel;

import com.jozufozu.flywheel.core.virtual.VirtualRenderWorld;
import com.simibubi.create.content.contraptions.components.structureMovement.MovementBehaviour;
import com.simibubi.create.content.contraptions.components.structureMovement.MovementContext;
import com.simibubi.create.content.contraptions.components.structureMovement.render.ContraptionMatrices;
import com.simibubi.create.content.logistics.trains.entity.CarriageContraption;

import com.simibubi.create.content.logistics.trains.entity.CarriageContraptionEntity;

import com.simibubi.create.foundation.utility.VecHelper;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.phys.Vec3;

import java.util.Map;

public class CarriageVisualRotationMovementBehaviour implements MovementBehaviour {
	@Override
	public boolean isActive(MovementContext context) {
		return context.contraption instanceof CarriageContraption;
	}

	@Override
	public boolean renderAsNormalTileEntity() {
		return true;
	}

	private IVisualRotationWheel getTE(MovementContext context) {
		Map<BlockPos, BlockEntity> tes = context.contraption.presentTileEntities;
		if (!(tes.get(context.localPos) instanceof IVisualRotationWheel speedForcibleTE))
			return null;
		return speedForcibleTE;
	}
	@Override
	public void renderInContraption(MovementContext context, VirtualRenderWorld renderWorld, ContraptionMatrices matrices, MultiBufferSource buffer) {
		if (context.contraption.entity instanceof CarriageContraptionEntity cce) {
			if (!context.world.isClientSide)
				return;

			Map<BlockPos, BlockEntity> tes = context.contraption.presentTileEntities;
			if (!(tes.get(context.localPos) instanceof IVisualRotationWheel speedForcible))
				return;

			if (!(context.contraption instanceof CarriageContraption carriageContraption))
				return;

			if (Minecraft.getInstance().isPaused())
				return;

			Direction direction = carriageContraption.getAssemblyDirection();

			double distanceTo = 0;
			if (!cce.firstPositionUpdate) {
				Vec3 diff = context.motion;
				Vec3 relativeDiff = VecHelper.rotate(diff, cce.yaw, Direction.Axis.Y);
				double signum = Math.signum(-relativeDiff.x);
				distanceTo = diff.length() * signum/3f;
			}

			double wheelRadius = speedForcible.getWheelRadius();

			//Update angles
			double angleDiff = 360 * distanceTo / (Math.PI * 2 * wheelRadius);

			//Now figure out speed to achieve this
			float speed = (float) (angleDiff * 10 / 3f);
			// speedForcible.setForcedSpeed(speed);
			//speedForcible.setForcedSpeed((float) angleDiff * 3 / 10f);
			switch (direction) {
				case NORTH, EAST -> speedForcible.setAngle((float) ((speedForcible.getAngle() + (angleDiff * 3 / 10f)) % 360));
				case SOUTH, WEST -> speedForcible.setAngle((float) ((speedForcible.getAngle() - (angleDiff * 3 / 10f)) % 360));
			}
		}
	}

	@Override
	public void stopMoving(MovementContext context) {
		if (!context.world.isClientSide || !isActive(context))
			return;
		IVisualRotationWheel speedForcible = getTE(context);
		if (speedForcible != null) {
			speedForcible.unsetForcedSpeed();
		}
	}
}
