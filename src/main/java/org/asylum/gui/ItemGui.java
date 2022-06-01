package org.asylum.gui;

import org.asylum.rightClick.RightClickItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

public class ItemGui implements InventoryHolder {

    private Inventory inv;
    ItemStack DisplayItem = RightClickItem.DisplayItem;

    public ItemGui() {
        inv = Bukkit.createInventory(this, 54, DisplayItem.getItemMeta().getDisplayName());
        init();
    }

    @EventHandler
    public void itemInHand(PlayerInteractEvent event) {

        ItemStack item = event.getItem();
    }


    public void init() {
        ItemStack item;
        item = DisplayItem;

        inv.setItem(22, item);
        ItemStack exitbtn = createItem("§c§lExit", Material.BARRIER, Collections.EMPTY_LIST);
        ItemStack Attribute;
        Attribute = createItem("§8Empty Upgrade Slot", Material.GRAY_STAINED_GLASS_PANE, Collections.EMPTY_LIST);
        inv.setItem(4, Attribute);
        inv.setItem(20, Attribute);
        inv.setItem(24, Attribute);
        inv.setItem(40, Attribute);
        inv.setItem(49, exitbtn);

        int size = RightClickItem.AttributeDisplays.size();
        for (int i=0;i<size;i++) {
            Attribute = RightClickItem.AttributeDisplays.get(i);
            if (i==0) {
                inv.setItem(4, Attribute);
            } else if (i==1) {
                inv.setItem(20, Attribute);
            } else if (i==2) {
                inv.setItem(24, Attribute);
            } else if (i==3) {
                inv.setItem(40, Attribute);
            }
        }
    }

    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    @NotNull
    public Inventory getInventory() {
        return inv;
    }
}
