package com.fdimo.farreachingvillagers;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;

@Mod(Constants.MOD_ID)
public class FarReachingVillagersMod {
    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES = DeferredRegister.create(BuiltInRegistries.PARTICLE_TYPE, Constants.MOD_ID);
    
    // In NeoForge 1.21, we can pass true for the boolean parameter
    public static final java.util.function.Supplier<SimpleParticleType> CHATTING_PARTICLE = PARTICLE_TYPES.register("chatting", () -> new SimpleParticleType(false) {});

    public FarReachingVillagersMod(IEventBus eventBus) {
        PARTICLE_TYPES.register(eventBus);
        Constants.LOG.info("Hello NeoForge world!");
        CommonClass.init();
    }
}
