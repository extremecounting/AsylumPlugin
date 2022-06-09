package org.asylum.npc.interactEvent;

import org.asylum.npc.guis.ArmorsmithGUI;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Armorsmith implements Listener {
    @EventHandler
    public void OnClickArmorsmith(PlayerInteractEntityEvent event) {
        Player player = event.getPlayer();
        if (event.getRightClicked().getType() == EntityType.VILLAGER) {
            if (event.getRightClicked().getName().contains("Armorsmith")) {
                ArmorsmithGUI gui = new ArmorsmithGUI();
                player.openInventory(gui.getInventory());
            }
        }
    }
}
