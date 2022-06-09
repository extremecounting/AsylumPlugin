package org.asylum.npc.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ArmorsmithGUI implements InventoryHolder {
    public static Inventory inv;

    public ArmorsmithGUI() {
        inv = Bukkit.createInventory(null, 45, "§aArmorsmith");
        init();
    }

    public void init() {
        ItemStack item;
        item = new ItemStack(Material.BROWN_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            inv.setItem(i, item);
            inv.setItem((i + 36), item);
        }
        inv.setItem(9, item);
        inv.setItem(17, item);
        inv.setItem(18, item);
        inv.setItem(26, item);
        inv.setItem(27, item);
        inv.setItem(35, item);

        item = new ItemStack(Material.BARRIER);
        meta = item.getItemMeta();
        meta.setDisplayName("§c§lExit");
        item.setItemMeta(meta);
        inv.setItem(40, item);


    }


    @Override
    public Inventory getInventory() {
        return inv;
    }
}
