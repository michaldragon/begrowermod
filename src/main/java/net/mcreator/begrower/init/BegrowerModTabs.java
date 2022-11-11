
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.begrower.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BegrowerModTabs {
	public static CreativeModeTab TAB_BE_GROWER;

	public static void load() {
		TAB_BE_GROWER = new CreativeModeTab("tabbe_grower") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.GRASS);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
