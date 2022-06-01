package org.asylum.staff;

import org.asylum.Asylum;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ModerationCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;

        if ((cmd.getName().equalsIgnoreCase("clearchat")) && player.hasPermission("chat.clear")) {
            clearChat(player);
        }
        if ((cmd.getName().equalsIgnoreCase("wakeplayer")) && player.hasPermission("player.wake")) {
            Player wakeplayer = Bukkit.getPlayer(args[0]);
            wakePlayer(wakeplayer, player);
        }
        if ((cmd.getName().equalsIgnoreCase("kick")) && player.hasPermission("player.kick")) {
            Player kicked = Bukkit.getPlayer(args[0]);
            String message = "";
            if (args.length > 1) {
                for (int i = 1; i < args.length + 1; i++) {
                    message = message + args[i] + " ";
                }
            }
            playerKick(kicked, player, message.trim());
        }
        return true;
    }
    
    private void playerKick(Player victim, Player kicker, String reason) {
        victim.kickPlayer("You where kicked for " + reason.trim() + " by " + kicker.getDisplayName());    
        Bukkit.broadcastMessage(ChatColor.RED + victim.getDisplayName() + ChatColor.GREEN + " was kicked for " + reason.trim());
    
    }

    private void wakePlayer(Player player, Player player2) {
        for (int i = 0; i < 10; i++) {
            Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                Bukkit.getPlayer(player.getUniqueId()).playSound(player, Sound.BLOCK_ANVIL_USE, 100, 100);
                Bukkit.getPlayer(player.getUniqueId()).playSound(player, Sound.BLOCK_ANVIL_BREAK, 100, 100);
            }, 2L);
        }

        player.sendMessage(ChatColor.RED + "You have been woken by " + player2.getDisplayName());
        player2.sendMessage(ChatColor.GREEN + "You have woken " + player.getDisplayName());
    }



    private void clearChat(Player player) {
        for (int i = 0; i < 100; i++) {
            Bukkit.broadcastMessage(" ");
        }
        Bukkit.broadcastMessage(ChatColor.GREEN + "Chat cleared by " + player.getDisplayName());
    }

}
