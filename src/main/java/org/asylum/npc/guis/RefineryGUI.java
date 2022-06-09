package org.asylum.npc.guis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class RefineryGUI implements InventoryHolder {
    public static Inventory inv;

    public RefineryGUI() {
        inv = Bukkit.createInventory(null, 45, "§aRefinery");
        init();
    }

    public void init() {
        ItemStack item;
        item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
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

        item = createItem("§fStone", Material.STONE, Collections.singletonList("§7Form rocks into a stone"));
        inv.setItem(10, item);

        item = createItem("§fTin Ingot", Material.IRON_INGOT, Collections.singletonList("§7Smelt tin ingots"));
        inv.setItem(11, item);

    }


    private ItemStack createItem(String name, Material mat, List<String> lore) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }



    @Override
    public Inventory getInventory() {
        return inv;
    }
}
