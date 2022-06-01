package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BashersItemManager {
    public static ItemStack tinBashShield;
    public static ItemStack copperBashShield;
    public static ItemStack bronzeBashShield;
    public static ItemStack ironBashShield;
    public static ItemStack titaniumBashShield;
    public static ItemStack tungstenBashShield;
    public static List<ItemStack> bashers;
    public static List<String> bashersName = new ArrayList<>();


    public static void init() {
        createTinBashShield();
        createCopperBashShield();
        createBronzeBashShield();
        createIronBashShield();
        createTitaniumBashShield();
        createTungstenBashShield();
        createBashersList();
        createBashersNameList();
    }


    private static void createTinBashShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTin Bashing Shield");
        List<String> lore = new ArrayList<>();
        lore.add("§7A shield for bashing");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinBashShield = item;
    }

    private static void createCopperBashShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Copper Bashing Shield");
        List<String> lore = new ArrayList<>();
        lore.add("§7A shield for bashing");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperBashShield = item;
    }

    private static void createBronzeBashShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Bronze Bashing Shield");
        List<String> lore = new ArrayList<>();
        lore.add("§7A shield for bashing");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzeBashShield = item;
    }

    private static void createIronBashShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Bashing Shield");
        List<String> lore = new ArrayList<>();
        lore.add("§7A shield for bashing");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironBashShield = item;
    }

    private static void createTitaniumBashShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eTitanium Bashing Shield");
        List<String> lore = new ArrayList<>();
        lore.add("§7A shield for bashing");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumBashShield = item;
    }

    private static void createTungstenBashShield() {
        ItemStack item = new ItemStack(Material.SHIELD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Bashing Shield");
        List<String> lore = new ArrayList<>();
        lore.add("§7A shield for bashing");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenBashShield = item;
    }

    private static void createBashersList() {
        bashers = Arrays.asList(tinBashShield, copperBashShield, bronzeBashShield,
                ironBashShield, titaniumBashShield, tungstenBashShield);
    }
    private static void createBashersNameList() {
        for (ItemStack e : bashers) {
            bashersName.add(e.getItemMeta().getDisplayName());
        }
    }
}
