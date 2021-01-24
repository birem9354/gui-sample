package com.github.birem;

import com.github.birem.command.CreateInventory;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        Objects.requireNonNull(Bukkit.getPluginCommand("gui")).setExecutor(new CreateInventory());
    }
}
