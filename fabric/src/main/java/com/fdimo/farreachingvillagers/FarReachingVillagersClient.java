package com.fdimo.farreachingvillagers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.minecraft.client.particle.HeartParticle;

public class FarReachingVillagersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleProviderRegistry.getInstance().register(FarReachingVillagersMod.CHATTING_PARTICLE, HeartParticle.Provider::new);
    }
}
