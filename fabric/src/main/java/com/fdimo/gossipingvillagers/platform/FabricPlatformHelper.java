package com.fdimo.gossipingvillagers.platform;

import com.fdimo.gossipingvillagers.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public net.minecraft.core.particles.SimpleParticleType getChattingParticle() {
        return com.fdimo.gossipingvillagers.GossipingVillagersMod.CHATTING_PARTICLE;
    }
}
