package org.asylum.npc.guis;

import org.asylum.itemManager.FoodItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class CookGUI implements InventoryHolder {

    public static Inventory inv;
    public static ItemStack plantMushrooms;
    public static ItemStack cookedMeat;

    public CookGUI() {
        inv = Bukkit.createInventory(null , 45, "§aCook");
        init();
    }

    public void init() {
        ItemStack item;
        item = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE);
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

        plantMushrooms = createItem("§2Plants And Mushrooms", Material.CARROT, Collections.singletonList("§aCook plants and mushrooms here"));
        inv.setItem(10, plantMushrooms);

        cookedMeat = createItem("§eCooked Meat", Material.CHICKEN, Collections.singletonList("§aCook chicken & goat cuts here"));
        inv.setItem(11, cookedMeat);

        inv.setItem(12, FoodItemManager.regularMealsDisplay);
        inv.setItem(13, FoodItemManager.breakfastMealsDisplay);
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
