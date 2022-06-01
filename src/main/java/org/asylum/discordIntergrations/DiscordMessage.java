package org.asylum.discordIntergrations;

import java.io.IOException;

import static org.bukkit.Bukkit.getLogger;

public class DiscordMessage {

    public static void startMessage() {
        DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/975098606858145852/5XgYmv1jFLUEYI3A4-4OaJvQZnzAVShg6Lp7x4XkeFosRUZzDlKz5Kk9T9nopIucH7fF");
        webhook.addEmbed(new DiscordWebhook.EmbedObject().setDescription("Server is starting..."));
        try {
            webhook.execute();
        } catch (IOException e) {
            getLogger().severe(e.getStackTrace().toString());
        }
    }
    public static void endMessage() {
        DiscordWebhook webhook = new DiscordWebhook("https://discord.com/api/webhooks/975098606858145852/5XgYmv1jFLUEYI3A4-4OaJvQZnzAVShg6Lp7x4XkeFosRUZzDlKz5Kk9T9nopIucH7fF");
        webhook.addEmbed(new DiscordWebhook.EmbedObject().setDescription("Server is stopping..."));
        try {
            webhook.execute();
        } catch (IOException e) {
            getLogger().severe(e.getStackTrace().toString());
        }
    }
}
