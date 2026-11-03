package com.fdimo.gossipingvillagers;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleProviderRegistry;
import net.minecraft.client.particle.HeartParticle;

public class GossipingVillagersClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleProviderRegistry.getInstance().register(GossipingVillagersMod.CHATTING_PARTICLE, HeartParticle.Provider::new);
    }
}
