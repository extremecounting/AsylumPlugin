package org.asylum.npc.interactEvent;

import org.asylum.npc.guis.RefineryGUI;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Refinery implements Listener {
    @EventHandler
    public void OnClickRefinery(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType() == EntityType.VILLAGER) {
            if (event.getRightClicked().getName().contains("Refinery")) {
                RefineryGUI gui = new RefineryGUI();
                player.openInventory(gui.getInventory());
            }
        }
    }
}
