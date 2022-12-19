package com.rabbitminers.extendedflywheels.registry;

import com.rabbitminers.extendedflywheels.ExtendedFlywheels;
import com.rabbitminers.extendedflywheels.wheel.CarriageVisualRotationMovementBehaviour;
import com.rabbitminers.extendedflywheels.wheel.CustomFlywheelBlock;
import com.simibubi.create.content.contraptions.components.flywheel.FlywheelBlock;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import com.tterrag.registrate.util.entry.BlockEntry;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MaterialColor;

import static com.simibubi.create.AllMovementBehaviours.movementBehaviour;
import static com.simibubi.create.foundation.data.ModelGen.customItemModel;
import static com.simibubi.create.foundation.data.TagGen.axeOrPickaxe;

public class EFBlocks {
	private static final CreateRegistrate REGISTRATE = ExtendedFlywheels.registrate()
			.creativeModeTab(() -> ExtendedFlywheels.ItemGroup);

	private static BlockEntry<CustomFlywheelBlock> flywheelBlockEntryFactory(String name) {
		return REGISTRATE.block(name, CustomFlywheelBlock::new)
				.initialProperties(SharedProperties::softMetal)
				.properties(BlockBehaviour.Properties::noOcclusion)
				.blockstate(BlockStateGen.axisBlockProvider(true))
				.transform(BlockStressDefaults.setNoImpact())
				.onRegister(movementBehaviour(new CarriageVisualRotationMovementBehaviour()))
				.item()
				.transform(customItemModel())
				.register();
	}

	public static final BlockEntry<CustomFlywheelBlock>
			IRON_FLYWHEEL = flywheelBlockEntryFactory("ironflywheel"),
			BLACK_IRON_FLYWHEEL = flywheelBlockEntryFactory("black_iron_flywheel"),
			GRAY_IRON_FLYWHEEL = flywheelBlockEntryFactory("gray_iron_flywheel"),
			LIGHT_GRAY_IRON_FLYWHEEL = flywheelBlockEntryFactory("light_gray_iron_flywheel"),
			WHITE_IRON_FLYWHEEL = flywheelBlockEntryFactory("white_iron_flywheel"),
			RED_IRON_FLYWHEEL = flywheelBlockEntryFactory("red_iron_flywheel"),
			ORANGE_IRON_FLYWHEEL = flywheelBlockEntryFactory("orange_iron_flywheel"),
			YELLOW_IRON_FLYWHEEL = flywheelBlockEntryFactory("yellow_iron_flywheel"),
			LIME_IRON_FLYWHEEL = flywheelBlockEntryFactory("lime_iron_flywheel"),
			GREEN_IRON_FLYWHEEL = flywheelBlockEntryFactory("green_iron_flywheel"),
			CYAN_IRON_FLYWHEEL = flywheelBlockEntryFactory("cyan_iron_flywheel"),
			LIGHT_BLUE_IRON_FLYWHEEL = flywheelBlockEntryFactory("light_blue_iron_flywheel"),
			BLUE_IRON_FLYWHEEL = flywheelBlockEntryFactory("blue_iron_flywheel"),
			MAGENTA_IRON_FLYWHEEL = flywheelBlockEntryFactory("magenta_iron_flywheel"),
			PURPLE_IRON_FLYWHEEL = flywheelBlockEntryFactory("purple_iron_flywheel"),
			PINK_IRON_FLYWHEEL = flywheelBlockEntryFactory("pink_iron_flywheel"),
			STEEL_FLYWHEEL = flywheelBlockEntryFactory("steelflywheel"),
			BLACK_STEEL_FLYWHEEL = flywheelBlockEntryFactory("black_steel_flywheel"),
			GRAY_STEEL_FLYWHEEL = flywheelBlockEntryFactory("gray_steel_flywheel"),
			LIGHT_GRAY_STEEL_FLYWHEEL = flywheelBlockEntryFactory("light_gray_steel_flywheel"),
			WHITE_STEEL_FLYWHEEL = flywheelBlockEntryFactory("white_steel_flywheel"),
			RED_STEEL_FLYWHEEL = flywheelBlockEntryFactory("red_steel_flywheel"),
			ORANGE_STEEL_FLYWHEEL = flywheelBlockEntryFactory("orange_steel_flywheel"),
			YELLOW_STEEL_FLYWHEEL = flywheelBlockEntryFactory("yellow_steel_flywheel"),
			LIME_STEEL_FLYWHEEL = flywheelBlockEntryFactory("lime_steel_flywheel"),
			GREEN_STEEL_FLYWHEEL = flywheelBlockEntryFactory("green_steel_flywheel"),
			CYAN_STEEL_FLYWHEEL = flywheelBlockEntryFactory("cyan_steel_flywheel"),
			LIGHT_BLUE_STEEL_FLYWHEEL = flywheelBlockEntryFactory("light_blue_steel_flywheel"),
			BLUE_STEEL_FLYWHEEL = flywheelBlockEntryFactory("blue_steel_flywheel"),
			MAGENTA_STEEL_FLYWHEEL = flywheelBlockEntryFactory("magenta_steel_flywheel"),
			PURPLE_STEEL_FLYWHEEL = flywheelBlockEntryFactory("purple_steel_flywheel"),
			PINK_STEEL_FLYWHEEL = flywheelBlockEntryFactory("pink_steel_flywheel"),
			BRASS_FLYWHEEL = flywheelBlockEntryFactory("flywheel"),
			BLACK_BRASS_FLYWHEEL = flywheelBlockEntryFactory("black_brass_flywheel"),
			GRAY_BRASS_FLYWHEEL = flywheelBlockEntryFactory("gray_brass_flywheel"),
			LIGHT_GRAY_BRASS_FLYWHEEL = flywheelBlockEntryFactory("light_gray_brass_flywheel"),
			WHITE_BRASS_FLYWHEEL = flywheelBlockEntryFactory("white_brass_flywheel"),
			RED_BRASS_FLYWHEEL = flywheelBlockEntryFactory("red_brass_flywheel"),
			ORANGE_BRASS_FLYWHEEL = flywheelBlockEntryFactory("orange_brass_flywheel"),
			YELLOW_BRASS_FLYWHEEL = flywheelBlockEntryFactory("yellow_brass_flywheel"),
			LIME_BRASS_FLYWHEEL = flywheelBlockEntryFactory("lime_brass_flywheel"),
			GREEN_BRASS_FLYWHEEL = flywheelBlockEntryFactory("green_brass_flywheel"),
			CYAN_BRASS_FLYWHEEL = flywheelBlockEntryFactory("cyan_brass_flywheel"),
			LIGHT_BLUE_BRASS_FLYWHEEL = flywheelBlockEntryFactory("light_blue_brass_flywheel"),
			BLUE_BRASS_FLYWHEEL = flywheelBlockEntryFactory("blue_brass_flywheel"),
			MAGENTA_BRASS_FLYWHEEL = flywheelBlockEntryFactory("magenta_brass_flywheel"),
			PURPLE_BRASS_FLYWHEEL = flywheelBlockEntryFactory("purple_brass_flywheel"),
			PINK_BRASS_FLYWHEEL = flywheelBlockEntryFactory("pink_brass_flywheel"),
			BIRCH_FLYWHEEL = flywheelBlockEntryFactory("birch_flywheel"),
			BIRCH_PLATED_FLYWHEEL = flywheelBlockEntryFactory("birch_plated_flywheel"),
			LARGE_BIRCH_FLYWHEEL = flywheelBlockEntryFactory("large_birch_flywheel"),
			OAK_FLYWHEEL = flywheelBlockEntryFactory("oak_flywheel"),
			OAK_PLATED_FLYWHEEL = flywheelBlockEntryFactory("oak_plated_flywheel"),
			LARGE_OAK_FLYWHEEL = flywheelBlockEntryFactory("large_oak_flywheel"),
			SPRUCE_FLYWHEEL = flywheelBlockEntryFactory("spruce_flywheel"),
			SPRUCE_PLATED_FLYWHEEL = flywheelBlockEntryFactory("spruce_plated_flywheel"),
			LARGE_SPRUCE_FLYWHEEL = flywheelBlockEntryFactory("large_spruce_flywheel"),
			DARK_OAK_FLYWHEEL = flywheelBlockEntryFactory("dark_oak_flywheel"),
			DARK_OAK_PLATED_FLYWHEEL = flywheelBlockEntryFactory("dark_oak_plated_flywheel"),
			LARGE_DARK_OAK_FLYWHEEL = flywheelBlockEntryFactory("large_dark_oak_flywheel"),
			ACACIA_FLYWHEEL = flywheelBlockEntryFactory("acacia_flywheel"),
			ACACIA_PLATED_FLYWHEEL = flywheelBlockEntryFactory("acacia_plated_flywheel"),
			LARGE_ACACIA_FLYWHEEL = flywheelBlockEntryFactory("large_acacia_flywheel"),
			JUNGLE_FLYWHEEL = flywheelBlockEntryFactory("jungle_flywheel"),
			JUNGLE_PLATED_FLYWHEEL = flywheelBlockEntryFactory("jungle_plated_flywheel"),
			LARGE_JUNGLE_FLYWHEEL = flywheelBlockEntryFactory("large_jungle_flywheel"),
			WARPED_FLYWHEEL = flywheelBlockEntryFactory("warped_flywheel"),
			WARPED_PLATED_FLYWHEEL = flywheelBlockEntryFactory("warped_plated_flywheel"),
			LARGE_WARPED_FLYWHEEL = flywheelBlockEntryFactory("large_warped_flywheel"),
			CRIMSON_FLYWHEEL = flywheelBlockEntryFactory("crimson_flywheel"),
			CRIMSON_PLATED_FLYWHEEL = flywheelBlockEntryFactory("crimson_plated_flywheel"),
			LARGE_CRIMSON_FLYWHEEL = flywheelBlockEntryFactory("large_crimson_flywheel")
	;

	public static void register() {}
}
