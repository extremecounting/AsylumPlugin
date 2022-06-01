package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaterialsItemManager {

    public static ItemStack pebble;
    public static ItemStack rock;
    public static ItemStack stone;
    public static ItemStack branch;
    public static ItemStack coal;
    public static ItemStack tinOre;
    public static ItemStack copperOre;
    public static ItemStack ironOre;
    public static ItemStack titaniumOre;
    public static ItemStack tungstenOre;
    public static ItemStack tinIngot;
    public static ItemStack copperIngot;
    public static ItemStack bronzeIngot;
    public static ItemStack ironIngot;
    public static ItemStack titaniumIngot;
    public static ItemStack tungstenIngot;
    public static List<ItemStack> materials;
    public static List<String> materialsName = new ArrayList<>();

    public static void init() {
        createPebble();
        createRock();
        createStone();
        createBranch();
        createCoal();
        createTinOre();
        createCopperOre();
        createIronOre();
        createTitaniumOre();
        createTungstenOre();
        createTinIngot();
        createCopperIngot();
        createBronzeIngot();
        createIronIngot();
        createTitaniumIngot();
        createTungstenIngot();
        createMaterialsList();
        createMaterialsNameList();
    }

    private static void createPebble() {
        ItemStack item = new ItemStack(Material.STONE_BUTTON);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Pebble");
        List<String> lore = new ArrayList<>();
        lore.add("§7Can be crafted together");
        meta.setLore(lore);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        pebble = item;
    }

    private static void createRock() {
        ItemStack item = new ItemStack(Material.COBBLESTONE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Rock");
        List<String> lore = new ArrayList<>();
        lore.add("§7Cluster of pebbles");
        meta.setLore(lore);
        meta.setCustomModelData(112222);
        item.setItemMeta(meta);
        rock = item;
    }

    private static void createStone() {
        ItemStack item = new ItemStack(Material.STONE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Stone");
        List<String> lore = new ArrayList<>();
        lore.add("§7Compressed Rock");
        meta.setLore(lore);
        meta.setCustomModelData(113333);
        item.setItemMeta(meta);
        stone = item;
    }

    private static void createBranch() {
        ItemStack item = new ItemStack(Material.STICK);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aBranch");
        List<String> lore = new ArrayList<>();
        lore.add("§7Used in tools and weapons");
        meta.setLore(lore);
        meta.setCustomModelData(114444);
        item.setItemMeta(meta);
        branch = item;
    }

    private static void createCoal() {
        ItemStack item = new ItemStack(Material.COAL);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§9Coal");
        List<String> lore = new ArrayList<>();
        lore.add("§7A common fuel");
        meta.setLore(lore);
        meta.setCustomModelData(115555);
        item.setItemMeta(meta);
        coal = item;
    }

    private static void createTinOre() {
        ItemStack item = new ItemStack(Material.DEEPSLATE_IRON_ORE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTin Ore");
        List<String> lore = new ArrayList<>();
        lore.add("§7A soft metal");
        meta.setLore(lore);
        meta.setCustomModelData(666666);
        item.setItemMeta(meta);
        tinOre = item;
    }

    private static void createCopperOre() {
        ItemStack item = new ItemStack(Material.COPPER_ORE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§4Copper Ore");
        List<String> lore = new ArrayList<>();
        lore.add("§7A soft metal");
        meta.setLore(lore);
        item.setItemMeta(meta);
        copperOre = item;
    }

    private static void createIronOre() {
        ItemStack item = new ItemStack(Material.IRON_ORE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Ore");
        List<String> lore = new ArrayList<>();
        lore.add("§7A hard metal");
        meta.setLore(lore);
        item.setItemMeta(meta);
        ironOre = item;
    }

    private static void createTitaniumOre() {
        ItemStack item = new ItemStack(Material.DEEPSLATE_COAL_ORE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTitanium Ore");
        List<String> lore = new ArrayList<>();
        lore.add("§7A hard metal");
        meta.setLore(lore);
        meta.setCustomModelData(333333);
        item.setItemMeta(meta);
        titaniumOre = item;
    }

    private static void createTungstenOre() {
        ItemStack item = new ItemStack(Material.DEEPSLATE_COPPER_ORE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Ore");
        List<String> lore = new ArrayList<>();
        lore.add("§7An extremely hard metal");
        meta.setLore(lore);
        meta.setCustomModelData(999999);
        item.setItemMeta(meta);
        tungstenOre = item;
    }

    private static void createTinIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTin Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("§7Refined tin ore");
        meta.setLore(lore);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinIngot = item;
    }

    private static void createCopperIngot() {
        ItemStack item = new ItemStack(Material.COPPER_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§4Copper Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("§7Refined copper ore");
        meta.setLore(lore);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperIngot = item;
    }

    private static void createBronzeIngot() {
        ItemStack item = new ItemStack(Material.COPPER_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§4Bronze Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("§7Tin and copper alloy");
        meta.setLore(lore);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzeIngot = item;
    }

    private static void createIronIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("§7Refined iron ore");
        meta.setLore(lore);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironIngot = item;
    }

    private static void createTitaniumIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTitanium Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("§7Refined titanium ore");
        meta.setLore(lore);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumIngot = item;
    }

    private static void createTungstenIngot() {
        ItemStack item = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Ingot");
        List<String> lore = new ArrayList<>();
        lore.add("§7Refined tungsten ore");
        meta.setLore(lore);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenIngot = item;
    }
    private static void createMaterialsList() {
        materials = Arrays.asList(pebble, rock, stone, branch,
                coal, tinOre, copperOre, ironIngot, titaniumOre,
                tungstenOre, tinIngot, copperIngot, bronzeIngot,
                titaniumIngot, tungstenIngot);
    }

    private static void createMaterialsNameList() {
        for (ItemStack e : materials) {
            materialsName.add(e.getItemMeta().getDisplayName());
        }
    }
}
