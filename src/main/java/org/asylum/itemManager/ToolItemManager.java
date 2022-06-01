package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolItemManager {
    public static ItemStack stonePick;
    public static ItemStack tinPick;
    public static ItemStack copperPick;
    public static ItemStack bronzePick;
    public static ItemStack ironPick;
    public static ItemStack titaniumPick;
    public static ItemStack tungstenPick;
    public static List<ItemStack> tools;
    public static List<String> toolsName = new ArrayList<>();

    public static void init() {
        createStonePick();
        createTinPick();
        createCopperPick();
        createBronzePick();
        createIronPick();
        createTitaniumPick();
        createTungstenPick();
        createToolsList();
        createToolsNameList();
    }

    private static void createStonePick() {
        ItemStack item = new ItemStack(Material.STONE_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aStone Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7Better than your fists");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        stonePick = item;
    }

    private static void createTinPick() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak pickaxe");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinPick = item;
    }

    private static void createCopperPick() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Copper Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak pickaxe");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperPick = item;
    }

    private static void createBronzePick() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Bronze Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A standard pickaxe");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzePick = item;
    }

    private static void createIronPick() {
        ItemStack item = new ItemStack(Material.IRON_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A standard pickaxe");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironPick = item;
    }

    private static void createTitaniumPick() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§eTitanium Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A strong pickaxe");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumPick = item;
    }

    private static void createTungstenPick() {
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Pickaxe");
        List<String> lore = new ArrayList<>();
        lore.add("§7A very strong pickaxe");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenPick = item;
    }

    private static void createToolsList() {
        tools = Arrays.asList(stonePick, tinPick, copperPick,
                bronzePick, ironPick, titaniumPick, tungstenPick);
    }

    private static void createToolsNameList() {
        for (ItemStack e : tools) {
            toolsName.add(e.getItemMeta().getDisplayName());
        }
    }
}
