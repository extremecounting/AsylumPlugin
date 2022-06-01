package org.asylum.discordIntergrations;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.io.IOException;

import static org.bukkit.Bukkit.getLogger;

public class ChatConversion implements Listener {
    public static boolean chatOn = true;


    @EventHandler
    public void chatConvert(AsyncPlayerChatEvent event) {
        Player sender = event.getPlayer();
        String message = event.getMessage();
        if (chatOn) {
            DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/975911308828483614/fYEhUTneK8bLy7yPvWPguvV-en_GE073JV01XEHaI_iVmvF4MJIgnmSdeEa6yx5Kiwf9");
            webhook.addEmbed(new DiscordWebhook.EmbedObject().setDescription(sender.getDisplayName() + ": " + message));

            try {
                webhook.execute();
            } catch (IOException e) {
                getLogger().severe(e.getStackTrace().toString());
            }
        }

    }

}
