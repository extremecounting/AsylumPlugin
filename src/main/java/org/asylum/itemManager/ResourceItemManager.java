package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResourceItemManager {
    public static ItemStack tinGear;
    public static ItemStack copperGear;
    public static ItemStack bronzeGear;
    public static ItemStack ironGear;
    public static ItemStack titaniumGear;
    public static ItemStack tungstenGear;
    public static List<ItemStack> resources;
    public static List<String> resourcesName = new ArrayList<>();

    public static void init() {
        createTinGear();
        createCopperGear();
        createBronzeGear();
        createIronGear();
        createTitaniumGear();
        createTungstenGear();
        createResourcesList();
        createResourcesNameList();
    }

    private static void createTinGear() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Gear");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak gear");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinGear = item;
    }

    private static void createCopperGear() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Copper Gear");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak gear");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperGear = item;
    }

    private static void createBronzeGear() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§Bronze Gear");
        List<String> lore = new ArrayList<>();
        lore.add("§7A standard gear");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzeGear = item;
    }

    private static void createIronGear() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Gear");
        List<String> lore = new ArrayList<>();
        lore.add("§7A standard gear");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironGear = item;
    }

    private static void createTitaniumGear() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eTitanium Gear");
        List<String> lore = new ArrayList<>();
        lore.add("§7A strong gear");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumGear = item;
    }

    private static void createTungstenGear() {
        ItemStack item = new ItemStack(Material.STICK, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Gear");
        List<String> lore = new ArrayList<>();
        lore.add("§7A very strong gear");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenGear = item;
    }

    private static void createResourcesList() {
        resources = Arrays.asList(tinGear, copperGear, bronzeGear,
                ironGear, titaniumGear, tungstenGear);
    }

    private static void createResourcesNameList() {
        for (ItemStack e : resources) {
            resourcesName.add(e.getItemMeta().getDisplayName());
        }
    }
}
