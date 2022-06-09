package org.asylum.npc.interactEvent;

import org.asylum.npc.guis.CookGUI;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Cook implements Listener {
    @EventHandler
    public void OnClickCook(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType() == EntityType.VILLAGER) {
            if (event.getRightClicked().getName().contains("Cook")) {
                CookGUI gui = new CookGUI();
                player.openInventory(gui.getInventory());
            }
        }
    }
}
