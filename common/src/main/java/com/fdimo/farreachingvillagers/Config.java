package com.fdimo.farreachingvillagers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Config {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File CONFIG_FILE = new File("config/far_reaching_villagers.json");

    public static ConfigData DATA = new ConfigData();

    public static class ConfigData {
        public int pathfindingRadius = 96;
        public int maxPathfindingNodes = 5000;
        public int asyncQueueCapacity = 1000;
        public double gossipRadius = 5.0;
        public boolean enableDebugBeams = false;
        public boolean enableDebugLogs = false;
        public boolean enableQueueDebug = false;
        public boolean enableRightClickDebug = false;
        public boolean enableStuckParticles = false;
        public double pathfindingStuckDistance = 3.0;
        public int pathfindingStuckTimeSeconds = 5;
        public int occupancyCacheDurationSeconds = 30;
        public int gossipCooldownSeconds = 10;
        public int passiveLearningFrequencySeconds = 40;
        public int blacklistDurationSeconds = 20;
    }

    public static void load() {
        if (CONFIG_FILE.exists()) {
            try (FileReader reader = new FileReader(CONFIG_FILE)) {
                DATA = GSON.fromJson(reader, ConfigData.class);
                if (DATA == null) {
                    DATA = new ConfigData();
                }
                if (DATA.asyncQueueCapacity <= 0) {
                    DATA.asyncQueueCapacity = 1000;
                }
            } catch (Exception e) {
                Constants.LOG.error("Failed to read config file", e);
            }
        }
        save();
        Constants.initThreadPool();
    }

    public static void save() {
        CONFIG_FILE.getParentFile().mkdirs();
        try (FileWriter writer = new FileWriter(CONFIG_FILE)) {
            GSON.toJson(DATA, writer);
        } catch (IOException e) {
            Constants.LOG.error("Failed to save config file", e);
        }
    }
}
