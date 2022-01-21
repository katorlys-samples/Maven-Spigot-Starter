package com.github.katorly.name;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class NAME extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[NAME] Author: Katorly");
        Bukkit.getLogger().info("[NAME] NAME enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[NAME] NAME disabled!");
    }
}