
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.begrower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.begrower.item.FixingGadgetItem;
import net.mcreator.begrower.BegrowerMod;

public class BegrowerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BegrowerMod.MODID);
	public static final RegistryObject<Item> FIXING_GADGET = REGISTRY.register("fixing_gadget", () -> new FixingGadgetItem());
	public static final RegistryObject<Item> PLANT_DRYIER = block(BegrowerModBlocks.PLANT_DRYIER, BegrowerModTabs.TAB_BE_GROWER);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
