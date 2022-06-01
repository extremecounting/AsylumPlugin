package org.asylum.itemManager;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpgradesItemManager {

    public static ItemStack crystal;
    public static ItemStack magmaBucket;
    public static ItemStack lightArmorPlate;
    public static ItemStack heavyArmorPlate;
    public static List<ItemStack> upgrades;
    public static List<String> upgradesName = new ArrayList<>();

    public static void init() {
        createCrystal();
        createMagmaBucket();
        createLightArmorPlate();
        createHeavyArmorPlate();
        createUpgradesList();
        createUpgradesNameList();
    }

    private static void createCrystal() {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bCrystal");
        List<String> lore = new ArrayList<>();
        lore.add("§7Can be added to weapons");
        lore.add("§7to increase damage.");
        meta.setLore(lore);
        item.setItemMeta(meta);
        crystal = item;

    }

    private static void createMagmaBucket() {
        ItemStack item = new ItemStack(Material.LAVA_BUCKET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.of("#f85e2b") + "Magma Bucket");
        meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        List<String> lore = new ArrayList<>();
        lore.add("§7Can be added to some tools");
        lore.add("§7to auto smelt ores");
        meta.setLore(lore);
        item.setItemMeta(meta);
        magmaBucket = item;
    }
    
    private static void createLightArmorPlate() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fLight Armor Plate");
        List<String> lore = new ArrayList<>();
        lore.add("§7A light armo plate");
        lore.add("§7Makes tools more mobile");
        meta.setLore(lore);
        item.setItemMeta(meta);
        lightArmorPlate = item;
    }
    
    private static void createHeavyArmorPlate() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Heavy Armor Plate");
        List<String> lore = new ArrayList<>();
        lore.add("§7A heavy armor plate");
        lore.add("§7Makes tools more powerful");
        meta.setLore(lore);
        item.setItemMeta(meta);
        heavyArmorPlate = item;
    }
    private static void createUpgradesList() {
        upgrades = Arrays.asList(crystal, magmaBucket, lightArmorPlate, heavyArmorPlate);
    }
    private static void createUpgradesNameList() {
        for (ItemStack e : upgrades) {
            upgradesName.add(e.getItemMeta().getDisplayName());
        }
    }
}
