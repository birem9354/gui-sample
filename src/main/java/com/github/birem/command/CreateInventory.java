package com.github.birem.command;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CreateInventory implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("gui")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;

                Inventory inv = Bukkit.createInventory(null, 27, p.getDisplayName() + "님의 GUI");
                p.openInventory(inv);

                sender.sendMessage(p.getDisplayName() + "님의 GUI을 열었습니다.");
            } else {
                sender.sendMessage(ChatColor.RED + "플레이어만 사용가능한 명령어입니다.");
            }
        }
        return true;
    }
}
