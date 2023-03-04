package com.github.katorly.exampleproject;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleProject extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getLogger().info("[ExampleProject] Author: Katorly");
        Bukkit.getLogger().info("[ExampleProject] ExampleProject enabled!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("[ExampleProject] ExampleProject disabled!");
    }
}