package com.fdimo.farreachingvillagers.platform;

import com.fdimo.farreachingvillagers.platform.services.IPlatformHelper;
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
        return com.fdimo.farreachingvillagers.FarReachingVillagersMod.CHATTING_PARTICLE;
    }
}
