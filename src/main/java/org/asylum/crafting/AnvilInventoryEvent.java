package org.asylum.crafting;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.ItemStack;

public class AnvilInventoryEvent implements Listener {

    @EventHandler
    public void anvilClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) { return; }
        if (event.getCurrentItem() == null) { return; }
        Player player = (Player) event.getWhoClicked();
        ItemStack item = event.getClickedInventory().getItem(2);
        if (event.getClickedInventory().getType().equals(InventoryType.ANVIL)) {
            event.setCancelled(false);
            if (event.isLeftClick() && event.getSlot() == 2) {
                    player.setItemOnCursor(item);
                    event.getClickedInventory().setItem(0, new ItemStack(Material.AIR));
                    event.getClickedInventory().setItem(1, new ItemStack(Material.AIR));
                    player.playSound(player, Sound.BLOCK_ANVIL_USE, 2, 2);
            }
        }
    }
}
