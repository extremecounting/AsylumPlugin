package org.asylum.npc.inventoryEvents;

import org.asylum.npc.guis.ArmorsmithGUI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class ArmorsmithEvents implements Listener {
    @EventHandler
    public void onClickEventBlacksmith(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) { return; }
        if (event.getCurrentItem() == null) { return; }
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory().getHolder() instanceof ArmorsmithGUI) {
            event.setCancelled(true);
            if (event.isRightClick())
                event.setCancelled(true);
            if (event.isShiftClick())
                event.setCancelled(true);
            if (event.isLeftClick()) {
                event.setCancelled(true);
                if (event.getCurrentItem() == null) {
                    event.setCancelled(true);
                    return;
                }
                if (event.getCurrentItem().getType() == Material.BARRIER) {
                    player.closeInventory();
                }
            }
        }
    }

    public void ArmorsmithStart() {
        ItemStack item;
        item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            ArmorsmithGUI.inv.setItem(i, item);
            ArmorsmithGUI.inv.setItem((i + 36), item);
        }
        ArmorsmithGUI.inv.setItem(9, item);
        ArmorsmithGUI.inv.setItem(13, item);
        ArmorsmithGUI.inv.setItem(17, item);
        ArmorsmithGUI.inv.setItem(18, item);
        ArmorsmithGUI.inv.setItem(26, item);
        ArmorsmithGUI.inv.setItem(27, item);
        ArmorsmithGUI.inv.setItem(31, item);
        ArmorsmithGUI.inv.setItem(35, item);

        item = new ItemStack(Material.BARRIER);
        meta = item.getItemMeta();
        meta.setDisplayName("§c§lExit");
        item.setItemMeta(meta);
        ArmorsmithGUI.inv.setItem(40, item);


    }

    public static void CClear() {
        ItemStack item = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            ArmorsmithGUI.inv.setItem(i, item);
            ArmorsmithGUI.inv.setItem(i + 9, item);
            ArmorsmithGUI.inv.setItem(i + 18, item);
            ArmorsmithGUI.inv.setItem(i + 27, item);
            ArmorsmithGUI.inv.setItem((i + 36), item);
        }
    }

    private ItemStack createItem(String name, Material mat, List<String> lore, int amount) {
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }
}
