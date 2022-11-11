
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.begrower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.begrower.block.entity.PlantDryierBlockEntity;
import net.mcreator.begrower.BegrowerMod;

public class BegrowerModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, BegrowerMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> PLANT_DRYIER = register("plant_dryier", BegrowerModBlocks.PLANT_DRYIER,
			PlantDryierBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
