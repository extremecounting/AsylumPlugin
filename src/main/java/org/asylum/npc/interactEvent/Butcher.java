package org.asylum.npc.interactEvent;

import org.asylum.npc.guis.ButcherGUI;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Butcher implements Listener {
    @EventHandler
    public void OnClickButcher(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType() == EntityType.VILLAGER) {
            if (event.getRightClicked().getName().contains("Butcher")) {
                ButcherGUI gui = new ButcherGUI();
                player.openInventory(gui.getInventory());
            }
        }
    }
}
