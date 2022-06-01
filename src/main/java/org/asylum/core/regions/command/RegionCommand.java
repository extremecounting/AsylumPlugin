package org.asylum.core.regions.command;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.asylum.Asylum;
import org.asylum.core.regions.Bound;
import org.asylum.utils.Utils;
import org.bukkit.entity.Player;

public class RegionCommand extends RegionCmd {

	private Map<UUID, Bound> regionSetup = new HashMap<>();
	
	public RegionCommand(Asylum asylum) {
		super(asylum, "region");
	}

	@Override
	protected void execute(Player player, String[] args) {
		if(args.length == 0) {
			Utils.sendMsg(player, "&3Asylum&f: &cIncorrect Usage");
		}
	}

}
