package com.rabbitminers.extendedflywheels;

import com.rabbitminers.extendedflywheels.registry.EFBlocks;
import com.rabbitminers.extendedflywheels.registry.EFTileEntities;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;

import com.tterrag.registrate.util.nullness.NonNullSupplier;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.ItemStack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtendedFlywheels implements ModInitializer {
	public static final String ID = "extendedflywheels";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);
	private static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ExtendedFlywheels.ID);

	public static CreativeModeTab ItemGroup = FabricItemGroupBuilder
			.build(new ResourceLocation(ExtendedFlywheels.ID, "main"),
					() -> new ItemStack(AllBlocks.FLYWHEEL.get()));
	@Override
	public void onInitialize() {
		EFBlocks.register();
		EFTileEntities.register();
		REGISTRATE.register();
	}

	public static CreateRegistrate registrate() {
		return REGISTRATE;
	}

	public static ResourceLocation id(String path) {
		return new ResourceLocation(ID, path);
	}
}
