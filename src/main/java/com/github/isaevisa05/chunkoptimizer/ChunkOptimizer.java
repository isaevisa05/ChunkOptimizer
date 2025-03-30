package com.github.isaevisa05.chunkoptimizer;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChunkOptimizer extends JavaPlugin {

    public static ChunkOptimizer instance;

    @Override
    public void onEnable() {
        instance = this;
        ChunkConfig.load();
        new Test();
    }

    @Override
    public void onDisable() {

    }
}
