package org.asylum.fun;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FunCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("uniquejoins")) {
            uniqueJoins(player);
        }
        return true;
    }



    private void uniqueJoins(Player player) {
        player.sendMessage(ChatColor.GREEN + "AsylumRPG has " + ChatColor.WHITE + Bukkit.getOfflinePlayers().length + ChatColor.GREEN + " unique joins!");
    }
}
