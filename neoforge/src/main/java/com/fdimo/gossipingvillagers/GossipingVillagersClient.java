package com.fdimo.gossipingvillagers;

import net.minecraft.client.particle.HeartParticle;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, value = Dist.CLIENT)
public class GossipingVillagersClient {
    @SubscribeEvent
    public static void registerParticleProviders(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(GossipingVillagersMod.CHATTING_PARTICLE.get(), HeartParticle.Provider::new);
    }
}
