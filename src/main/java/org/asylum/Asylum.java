package org.asylum;

import org.asylum.blocks.BlockBreak;
import org.asylum.blocks.BlockEvents;
import org.asylum.core.files.RegionData;
import org.asylum.crafting.AnvilInventoryEvent;
import org.asylum.crafting.AnvilRecipes;
import org.asylum.discordIntergrations.ChatConversion;
import org.asylum.discordIntergrations.DiscordMessage;
import org.asylum.fun.FunCommands;
import org.asylum.gui.ItemGuiEvents;
import org.asylum.itemManager.*;
import org.asylum.player.Damage;
import org.asylum.player.PlayerMove;
import org.asylum.rightClick.RightClickItem;
import org.asylum.staff.ModerationCommands;
import org.asylum.staff.StaffCommands;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class Asylum extends JavaPlugin {

	private static Asylum instance;
	private RegionData regionData;
	@Override
	public void onEnable() {
		MeleeWeaponItemManager.init();
		DiscordMessage.startMessage();

		ModerationCommands moderationCommands = new ModerationCommands();
		getCommand("kick").setExecutor(moderationCommands);
		getCommand("clearchat").setExecutor(moderationCommands);
		getCommand("wakeplayer").setExecutor(moderationCommands);

		FunCommands funCommands = new FunCommands();
		getCommand("uniquejoins").setExecutor(funCommands);

		StaffCommands staffCommands = new StaffCommands();
		getCommand("hammer").setExecutor(staffCommands);
		getCommand("pebble").setExecutor(staffCommands);
		getCommand("crystal").setExecutor(staffCommands);
		getCommand("tinpick").setExecutor(staffCommands);
		getCommand("stonepick").setExecutor(staffCommands);
		getCommand("tinarmors").setExecutor(staffCommands);
		getCommand("ironarmors").setExecutor(staffCommands);
		getCommand("armorplates").setExecutor(staffCommands);
		getCommand("magmabucket").setExecutor(staffCommands);
		getCommand("bashshields").setExecutor(staffCommands);
		getCommand("copperarmors").setExecutor(staffCommands);
		getCommand("bronzearmors").setExecutor(staffCommands);
		getCommand("tinbashshield").setExecutor(staffCommands);
		getCommand("titaniumarmors").setExecutor(staffCommands);
		getCommand("tungstenarmors").setExecutor(staffCommands);
		getCommand("togglechatdisc").setExecutor(staffCommands);

		ToolItemManager.init();
		ExtraItemManager.init();
		ArmorItemManager.init();
		BashersItemManager.init();
		ResourceItemManager.init();
		UpgradesItemManager.init();
		MaterialsItemManager.init();

		Bukkit.getPluginManager().registerEvents(new Damage(), this);
		Bukkit.getPluginManager().registerEvents(new PlayerMove(), this);
		Bukkit.getPluginManager().registerEvents(new BlockBreak(), this);
		Bukkit.getPluginManager().registerEvents(new BlockEvents(), this);
		Bukkit.getPluginManager().registerEvents(new AnvilRecipes(), this);
		Bukkit.getPluginManager().registerEvents(new ItemGuiEvents(), this);
		Bukkit.getPluginManager().registerEvents(new RightClickItem(), this);
		Bukkit.getPluginManager().registerEvents(new ChatConversion(), this);
		Bukkit.getPluginManager().registerEvents(new AnvilInventoryEvent(), this);

		//Startup Logic
		instance = this;

		//Load Local Data
		//regionData = new RegionData(this, "regions");
		//regionData.loadData();

		//new MongoTest();
	}

	public void onDisable() {

		if (regionData != null) {
			regionData.saveData();
		}
		DiscordMessage.endMessage();
	}

	public Asylum getInstance() {
		return instance;
	}
}
