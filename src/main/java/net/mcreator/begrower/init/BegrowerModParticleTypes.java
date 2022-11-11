
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.begrower.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.begrower.BegrowerMod;

public class BegrowerModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BegrowerMod.MODID);
	public static final RegistryObject<ParticleType<?>> DRYING_IN_PROGRESS = REGISTRY.register("drying_in_progress",
			() -> new SimpleParticleType(false));
}
