package com.github.isaevisa05.chunkoptimizer;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import io.papermc.paper.event.packet.PlayerChunkLoadEvent;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.jetbrains.annotations.NotNull;

public class Test implements Listener, CommandExecutor {

    public int view_distance = 12;
    public int max_view_distance = 32;

    public Test() {
        Bukkit.getPluginManager().registerEvents(this, ChunkOptimizer.instance);
        ChunkOptimizer.instance.getCommand("cc").setExecutor(this);
    }


    int cd = 0;
    @EventHandler
    private void playerLoadChunk(PlayerJumpEvent event) {
        event.getPlayer().sendMessage(event.getPlayer().getViewDistance() + ":" + event.getPlayer().getSimulationDistance());
        //event.getPlayer().sendMessage(event.getPlayer().getWorld().getLoadedChunks().length + "");
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        sender.sendMessage(Bukkit.getWorld("world").getLoadedChunks().length + "");
        return true;
    }
}
