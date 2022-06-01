package org.asylum;

import org.asylum.core.files.RegionData;
import org.asylum.discordIntergration.DiscordWebhook;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Asylum extends JavaPlugin implements Listener {

	private String webHookURL = "https://discord.com/api/webhooks/975098606858145852/5XgYmv1jFLUEYI3A4-4OaJvQZnzAVShg6Lp7x4XkeFosRUZzDlKz5Kk9T9nopIucH7fF";
	private static Asylum instance;
	private RegionData regionData;
	@Override
	public void onEnable() {
		//Startup Logic
		instance = this;
		
		//Load Local Data
		regionData = new RegionData(this, "regions");
		regionData.loadData();

		DiscordWebhook webhook = new DiscordWebhook(webHookURL);
		webhook.addEmbed(new DiscordWebhook.EmbedObject().setDescription("Server is starting"));

		try {
			webhook.execute();
		} catch (IOException e) {
			getLogger().severe(e.getStackTrace().toString());
		}


	}
	
	public void onDisable() {
		regionData.saveData();
	}

	public Asylum getInstance() {
		return instance;
	}
}
