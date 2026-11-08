package com.fdimo.farreachingvillagers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.HeartParticle;

public class FarReachingVillagersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(FarReachingVillagersMod.CHATTING_PARTICLE, HeartParticle.Provider::new);
    }
}
