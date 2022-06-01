package org.asylum.core.regions.command;

import org.asylum.Asylum;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public abstract class RegionCmd implements CommandExecutor {

	protected Asylum asylum;
	
	public RegionCmd(Asylum asylum, String name) {
		this.asylum = asylum;
		asylum.getCommand(name).setExecutor(this);
	}
	
	protected abstract void execute(Player player, String[] args);
	
	public boolean onCommand(CommandSender sender, org.bukkit.command.Command cmd, String alias, String[] args) {
		if(sender instanceof Player) execute((Player) sender, args);
		return true;		
	}
	
}
