package com.github.isaevisa05.chunkoptimizer;

import org.bukkit.plugin.Plugin;

import java.io.File;
import java.nio.file.Path;

public class ChunkConfig {

    private static Path pluginPath;
    private static File configFile;

    public static void load() {
        pluginPath = ChunkOptimizer.instance.getDataPath();
        configFile = new File(pluginPath.toFile(), "config.yml");
    }

    public static int view_distance = 10;
    public static int fake_view_distance = 32;
    public static int simulation_distance = 10;
    public static int fake_simulation_distance = 10;

    private static void update() {

    }

}
