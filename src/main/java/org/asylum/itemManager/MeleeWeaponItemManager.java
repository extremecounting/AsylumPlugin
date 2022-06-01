package org.asylum.itemManager;

import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeleeWeaponItemManager {

    public static ItemStack hammer;
    public static List<ItemStack> weapons;
    public static List<String> weaponsName = new ArrayList<>();

    public static void init() {
        createHammer();
        createMeleeWeaponsList();
        createWeaponsNameList();
    }

    private static void createHammer() {
        ItemStack item = new ItemStack(Material.WOODEN_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aRusty Hammer");
        List<String> lore = new ArrayList<>();
        lore.add("§7A rusty hammer");
        lore.add("§7§lPrimitive I §r§8[0/25]");
        meta.setLore(lore);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS, ItemFlag.HIDE_UNBREAKABLE);
        meta.setUnbreakable(true);
        meta.setCustomModelData(211111);
        item.setItemMeta(meta);
        hammer = item;
    }

    private static void createMeleeWeaponsList() {
        weapons = Arrays.asList(hammer);
    }

    private static void createWeaponsNameList() {
        for (ItemStack e : weapons) {
            weaponsName.add(e.getItemMeta().getDisplayName());
        }
    }
}
