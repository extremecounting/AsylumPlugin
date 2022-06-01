package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ExtraItemManager {

    public static ItemStack key;
    public static ItemStack brokenKey;
    public static ItemStack mushroomKey;

    public static void init() {
        createKey();
        createBrokenKey();
        createMushroomKey();
    }

    private static void createKey() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Regular Key");
        List<String> lore = new ArrayList<>();
        lore.add("§cCurrently useless!");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        meta.setCustomModelData(311111);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        item.setItemMeta(meta);
        key = item;
    }

    private static void createBrokenKey() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fBroken Key");
        List<String> lore = new ArrayList<>();
        lore.add("§cCurrently useless!");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        meta.setCustomModelData(312222);
        item.setItemMeta(meta);
        brokenKey = item;
    }

    private static void createMushroomKey() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Mushroom Key");
        List<String> lore = new ArrayList<>();
        lore.add("§cCurrently useless!");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setUnbreakable(true);
        meta.setCustomModelData(313333);
        meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
        item.setItemMeta(meta);
        mushroomKey = item;
    }
}
