package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class ArmorItemManager {

    public static ItemStack tinHelmet;
    public static ItemStack tinChestplate;
    public static ItemStack tinLeggings;
    public static ItemStack tinBoots;
    public static ItemStack copperHelmet;
    public static ItemStack copperChestplate;
    public static ItemStack copperLeggings;
    public static ItemStack copperBoots;
    public static ItemStack bronzeHelmet;
    public static ItemStack bronzeChestplate;
    public static ItemStack bronzeLeggings;
    public static ItemStack bronzeBoots;
    public static ItemStack ironHelmet;
    public static ItemStack ironChestplate;
    public static ItemStack ironLeggings;
    public static ItemStack ironBoots;
    public static ItemStack titaniumHelmet;
    public static ItemStack titaniumChestplate;
    public static ItemStack titaniumLeggings;
    public static ItemStack titaniumBoots;
    public static ItemStack tungstenHelmet;
    public static ItemStack tungstenChestplate;
    public static ItemStack tungstenLeggings;
    public static ItemStack tungstenBoots;
    public static List<ItemStack> armor;
    public static List<String> armorName = new ArrayList<>();

    public static void init() {
        createTinHelmet();
        createTinChestplate();
        createTinLeggings();
        createTinBoots();
        createCopperHelmet();
        createCopperChestplate();
        createCopperLeggings();
        createCopperBoots();
        createBronzeHelmet();
        createBronzeChestplate();
        createBronzeLeggings();
        createBronzeBoots();
        createIronHelmet();
        createIronChestplate();
        createIronLeggings();
        createIronBoots();
        createTitaniumHelmet();
        createTitaniumChestplate();
        createTitaniumLeggings();
        createTitaniumBoots();
        createTungstenHelmet();
        createTungstenChestplate();
        createTungstenLeggings();
        createTungstenBoots();
        createArmorList();
        createArmorNameList();
    }

    private static void createTinHelmet() {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak helmet");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);

        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinHelmet = item;
    }

    private static void createTinChestplate() {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak chestplate");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinChestplate = item;
    }

    private static void createTinLeggings() {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("§7Weak leggings");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinLeggings = item;
    }

    private static void createTinBoots() {
        ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Boots");
        List<String> lore = new ArrayList<>();
        lore.add("§7Weak boots");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tinBoots = item;
    }

    private static void createCopperHelmet() {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak helmet");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperHelmet = item;
    }

    private static void createCopperChestplate() {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("§7A weak chestplate");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperChestplate = item;
    }

    private static void createCopperLeggings() {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("§7Weak leggings");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.LEGS);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperLeggings = item;
    }

    private static void createCopperBoots() {
        ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aTin Boots");
        List<String> lore = new ArrayList<>();
        lore.add("§7Weak boots");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        copperBoots = item;
    }
    
    private static void createBronzeHelmet() {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Bronze Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("§7A standard helmet");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzeHelmet = item;
    }
    
    private static void createBronzeChestplate() {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Bronze Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("§7A standard chestplate");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzeChestplate = item;
    }
    
    private static void createBronzeLeggings() {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Bronze Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("§7A standard leggings");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzeLeggings = item;
    }
    
    private static void createBronzeBoots() {
        ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Bronze Boots");
        List<String> lore = new ArrayList<>();
        lore.add("§7Standard boots");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        bronzeBoots = item;
    }
    
    private static void createIronHelmet() {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("§7Standard helmet");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironHelmet = item;
    }
    
    private static void createIronChestplate() {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("§7Standard chestplate");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironChestplate = item;
    }
    
    private static void createIronLeggings() {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("§7Standard leggings");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironLeggings = item;
    }
    
    private static void createIronBoots() {
        ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fIron Boots");
        List<String> lore = new ArrayList<>();
        lore.add("§7Standard boots");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        ironBoots = item;
    }
    
    private static void createTitaniumHelmet() {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTitanium Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("§7Strong helmet");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumHelmet = item;
    }
    
    private static void createTitaniumChestplate() {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTitanium Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("§7Strong chestplate");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumChestplate = item;
    }
    
    private static void createTitaniumLeggings() {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTitanium Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("§7Strong leggings");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumLeggings = item;
    }
    
    private static void createTitaniumBoots() {
        ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fTitanium Boots");
        List<String> lore = new ArrayList<>();
        lore.add("§7Strong boots");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        titaniumBoots = item;
    }
    
    private static void createTungstenHelmet() {
        ItemStack item = new ItemStack(Material.IRON_HELMET, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Helmet");
        List<String> lore = new ArrayList<>();
        lore.add("§7Very strong helmet");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenHelmet = item;
    }
    
    private static void createTungstenChestplate() {
        ItemStack item = new ItemStack(Material.IRON_CHESTPLATE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("§7Very strong chestplate");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenChestplate = item;
    }
    
    private static void createTungstenLeggings() {
        ItemStack item = new ItemStack(Material.IRON_LEGGINGS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Leggings");
        List<String> lore = new ArrayList<>();
        lore.add("§7Very strong leggings");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenLeggings = item;
    }
    
    private static void createTungstenBoots() {
        ItemStack item = new ItemStack(Material.IRON_BOOTS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§8Tungsten Boots");
        List<String> lore = new ArrayList<>();
        lore.add("§7Very strong boots");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        AttributeModifier modifier = new AttributeModifier(UUID.randomUUID(), "generic.armor", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HEAD);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, modifier);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(100000);
        item.setItemMeta(meta);
        tungstenBoots = item;
    }

    private static void createArmorList() {
        armor = Arrays.asList(tinHelmet, tinChestplate,
                tinLeggings, tinBoots, copperHelmet,
                copperChestplate, copperLeggings, copperHelmet,
                bronzeHelmet, bronzeChestplate, bronzeLeggings,
                bronzeBoots, ironHelmet, ironChestplate, ironLeggings,
                ironBoots, titaniumHelmet, titaniumChestplate,
                titaniumLeggings, titaniumBoots, tungstenHelmet,
                tungstenChestplate, tungstenLeggings, tungstenBoots);
    }

    private static void createArmorNameList() {
        for (ItemStack e : armor) {
            armorName.add(e.getItemMeta().getDisplayName());
        }
    }
    
}
