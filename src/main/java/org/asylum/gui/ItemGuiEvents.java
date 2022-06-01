package org.asylum.gui;

import net.md_5.bungee.api.ChatColor;
import org.asylum.itemManager.UpgradesItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class ItemGuiEvents implements Listener {

    private static List<String> lore;



    @EventHandler
    public void OnClickItemGUI(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) { return; }
        if (event.getCurrentItem() == null) { return; }
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory().getHolder() instanceof ItemGui) {
            event.setCancelled(true);
            if (event.isLeftClick()) {
                if (event.getCurrentItem() == null) {
                    event.setCancelled(true);
                    return;
                }
                if (event.getCurrentItem().getType() == Material.BARRIER) {
                    player.closeInventory();
                    return;
                }
                if (event.getSlot() == 4 || event.getSlot() == 20 || event.getSlot() == 24 || event.getSlot() == 40) {
                    if (event.getCurrentItem().getType() != Material.GRAY_STAINED_GLASS_PANE && (player.getInventory().firstEmpty() > -1)) {
                        ItemStack emptySlot = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
                        player.getInventory().addItem(event.getCurrentItem());
                        if (event.getCurrentItem().equals(UpgradesItemManager.upgrades.get(3))) {
                            event.setCurrentItem(emptySlot);
                            fourLvlAction(player, "§8Heavy");
                        }
                        if (event.getCurrentItem().equals(UpgradesItemManager.upgrades.get(2))) {
                            event.setCurrentItem(emptySlot);
                            fourLvlAction(player, "§fLight");
                        }
                        if (event.getCurrentItem().equals(UpgradesItemManager.upgrades.get(0))) {
                            event.setCurrentItem(emptySlot);
                            fourLvlAction(player, "§bCrystallized");
                        }
                        if (event.getCurrentItem().equals(UpgradesItemManager.upgrades.get(1))) {
                            event.setCurrentItem(emptySlot);
                            lore = player.getInventory().getItemInMainHand().getItemMeta().getLore();
                            ItemMeta meta = player.getInventory().getItemInMainHand().getItemMeta();
                            lore.remove(lore.indexOf("§cHeated"));
                            meta.setLore(lore);
                            player.getInventory().getItemInMainHand().setItemMeta(meta);
                        }
                    }
                }
            }
        }
    }
    private static void fourLvlAction(Player player, String name) {
        if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(name + " IV")) {
            lore = player.getInventory().getItemInMainHand().getItemMeta().getLore();
            ItemMeta meta = player.getInventory().getItemInMainHand().getItemMeta();
            lore.set(lore.indexOf(name + " IV"), name + " III");
            meta.setLore(lore);
            player.getInventory().getItemInMainHand().setItemMeta(meta);
        }
        else if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(name + " III")) {
            lore = player.getInventory().getItemInMainHand().getItemMeta().getLore();
            ItemMeta meta = player.getInventory().getItemInMainHand().getItemMeta();
            lore.set(lore.indexOf(name + " III"), name + " II");
            meta.setLore(lore);
            player.getInventory().getItemInMainHand().setItemMeta(meta);
        }
        else if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(name + " II")) {
            lore = player.getInventory().getItemInMainHand().getItemMeta().getLore();
            ItemMeta meta = player.getInventory().getItemInMainHand().getItemMeta();
            lore.set(lore.indexOf(name + " II"), name + " I");
            meta.setLore(lore);
            player.getInventory().getItemInMainHand().setItemMeta(meta);
        }
        else if (player.getInventory().getItemInMainHand().getItemMeta().getLore().contains(name + " I")) {
            lore = player.getInventory().getItemInMainHand().getItemMeta().getLore();
            ItemMeta meta = player.getInventory().getItemInMainHand().getItemMeta();
            lore.remove(lore.indexOf(name + " I"));
            meta.setLore(lore);
            player.getInventory().getItemInMainHand().setItemMeta(meta);
        }
    }

}


