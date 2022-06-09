package org.asylum.npc.interactEvent;

import org.asylum.npc.guis.BlacksmithGUI;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Blacksmith implements Listener {

    @EventHandler
    public void OnClickBlacksmith(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType() == EntityType.VILLAGER) {
            if (event.getRightClicked().getName().contains("Blacksmith")) {
                BlacksmithGUI gui = new BlacksmithGUI();
                player.openInventory(gui.getInventory());
            }
        }
    }
}
