package com.fdimo.farreachingvillagers;

import net.fabricmc.api.ModInitializer;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;

public class FarReachingVillagersMod implements ModInitializer {
    public static final SimpleParticleType CHATTING_PARTICLE = FabricParticleTypes.simple();

    @Override
    public void onInitialize() {
        Registry.register(BuiltInRegistries.PARTICLE_TYPE, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "chatting"), CHATTING_PARTICLE);
        Constants.LOG.info("Hello Fabric world!");
        CommonClass.init();
    }
}
