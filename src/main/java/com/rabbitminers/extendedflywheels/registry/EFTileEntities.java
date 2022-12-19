package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.rabbitminers.extendedflywheels.wheel.CustomFlywheelInstance;
import com.rabbitminers.extendedflywheels.wheel.CustomFlywheelRenderer;
import com.rabbitminers.extendedflywheels.wheel.CustomFlywheelTileEntity;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.components.flywheel.FlyWheelInstance;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelRenderer;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelTileEntity;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class EFTileEntities {
	// private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate();
	public static final BlockEntityEntry<CustomFlywheelTileEntity> CUSTOM_FLYWHEEL_BLOCK_ENTITY = ExtendedFlywheels.registrate()
			.tileEntity("custom_flywheel", CustomFlywheelTileEntity::new)
			.instance(() -> CustomFlywheelInstance::new)
			.validBlocks(EFBlocks.IRON_FLYWHEEL, EFBlocks.BLACK_IRON_FLYWHEEL, EFBlocks.GRAY_IRON_FLYWHEEL, EFBlocks.LIGHT_GRAY_IRON_FLYWHEEL, EFBlocks.WHITE_IRON_FLYWHEEL, EFBlocks.RED_IRON_FLYWHEEL, EFBlocks.ORANGE_IRON_FLYWHEEL, EFBlocks.YELLOW_IRON_FLYWHEEL, EFBlocks.LIME_IRON_FLYWHEEL, EFBlocks.GREEN_IRON_FLYWHEEL, EFBlocks.CYAN_IRON_FLYWHEEL, EFBlocks.LIGHT_BLUE_IRON_FLYWHEEL, EFBlocks.BLUE_IRON_FLYWHEEL, EFBlocks.MAGENTA_IRON_FLYWHEEL, EFBlocks.PURPLE_IRON_FLYWHEEL, EFBlocks.PINK_IRON_FLYWHEEL, EFBlocks.STEEL_FLYWHEEL, EFBlocks.BLACK_STEEL_FLYWHEEL, EFBlocks.GRAY_STEEL_FLYWHEEL, EFBlocks.LIGHT_GRAY_STEEL_FLYWHEEL, EFBlocks.WHITE_STEEL_FLYWHEEL, EFBlocks.RED_STEEL_FLYWHEEL, EFBlocks.ORANGE_STEEL_FLYWHEEL, EFBlocks.YELLOW_STEEL_FLYWHEEL, EFBlocks.LIME_STEEL_FLYWHEEL, EFBlocks.GREEN_STEEL_FLYWHEEL, EFBlocks.CYAN_STEEL_FLYWHEEL, EFBlocks.LIGHT_BLUE_STEEL_FLYWHEEL, EFBlocks.BLUE_STEEL_FLYWHEEL, EFBlocks.MAGENTA_STEEL_FLYWHEEL, EFBlocks.PURPLE_STEEL_FLYWHEEL, EFBlocks.PINK_STEEL_FLYWHEEL, EFBlocks.BRASS_FLYWHEEL, EFBlocks.BLACK_BRASS_FLYWHEEL, EFBlocks.GRAY_BRASS_FLYWHEEL, EFBlocks.LIGHT_GRAY_BRASS_FLYWHEEL, EFBlocks.WHITE_BRASS_FLYWHEEL, EFBlocks.RED_BRASS_FLYWHEEL, EFBlocks.ORANGE_BRASS_FLYWHEEL, EFBlocks.YELLOW_BRASS_FLYWHEEL, EFBlocks.LIME_BRASS_FLYWHEEL, EFBlocks.GREEN_BRASS_FLYWHEEL, EFBlocks.CYAN_BRASS_FLYWHEEL, EFBlocks.LIGHT_BLUE_BRASS_FLYWHEEL, EFBlocks.BLUE_BRASS_FLYWHEEL, EFBlocks.MAGENTA_BRASS_FLYWHEEL, EFBlocks.PURPLE_BRASS_FLYWHEEL, EFBlocks.PINK_BRASS_FLYWHEEL, EFBlocks.BIRCH_FLYWHEEL, EFBlocks.BIRCH_PLATED_FLYWHEEL, EFBlocks.LARGE_BIRCH_FLYWHEEL, EFBlocks.OAK_FLYWHEEL, EFBlocks.OAK_PLATED_FLYWHEEL, EFBlocks.LARGE_OAK_FLYWHEEL, EFBlocks.SPRUCE_FLYWHEEL, EFBlocks.SPRUCE_PLATED_FLYWHEEL, EFBlocks.LARGE_SPRUCE_FLYWHEEL, EFBlocks.DARK_OAK_FLYWHEEL, EFBlocks.DARK_OAK_PLATED_FLYWHEEL, EFBlocks.LARGE_DARK_OAK_FLYWHEEL, EFBlocks.ACACIA_FLYWHEEL, EFBlocks.ACACIA_PLATED_FLYWHEEL, EFBlocks.LARGE_ACACIA_FLYWHEEL, EFBlocks.JUNGLE_FLYWHEEL, EFBlocks.JUNGLE_PLATED_FLYWHEEL, EFBlocks.LARGE_JUNGLE_FLYWHEEL, EFBlocks.WARPED_FLYWHEEL, EFBlocks.WARPED_PLATED_FLYWHEEL, EFBlocks.LARGE_WARPED_FLYWHEEL, EFBlocks.CRIMSON_FLYWHEEL, EFBlocks.CRIMSON_PLATED_FLYWHEEL, EFBlocks.LARGE_CRIMSON_FLYWHEEL)
			.renderer(() -> CustomFlywheelRenderer::new)
			.register();

	public static void 	register() {}
}
