package org.asylum.crafting;

import net.md_5.bungee.api.ChatColor;
import org.asylum.itemManager.*;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class AnvilRecipes implements Listener {

    private static ItemStack result;
    private static List<String> lore;
    private static ItemMeta resultMeta;
    private static int index;

    @EventHandler
    public void onInventoryClickAnvil(PrepareAnvilEvent event) {
        if (event.getView().getType() == InventoryType.ANVIL) {
            String itemName = event.getInventory().getItem(0).getItemMeta().getDisplayName();
            result = createItem(event.getInventory().getItem(0).getItemMeta().getDisplayName(), event.getInventory().getItem(0).getType(), event.getInventory().getItem(0).getItemMeta().getLore(), 1);
            if ((BashersItemManager.bashersName.contains(itemName) || ArmorItemManager.armorName.contains(itemName)) && event.getInventory().getItem(1).equals(UpgradesItemManager.upgrades.get(2))) {
                fourLvlAction("§fLight", event);
            }
            if ((BashersItemManager.bashersName.contains(itemName) || ArmorItemManager.armorName.contains(itemName)) && event.getInventory().getItem(1).equals(UpgradesItemManager.upgrades.get(3))) {
                fourLvlAction("§8Heavy", event);
            }
            if (ToolItemManager.toolsName.contains(itemName) && event.getInventory().getItem(1).equals(UpgradesItemManager.upgrades.get(1))) {
                if (!result.getItemMeta().getLore().contains(ChatColor.of("#f85e2b") + "Heated")) {
                    lore = result.getItemMeta().getLore();
                    lore.add("§cHeated");
                    resultMeta = result.getItemMeta();
                    resultMeta.setLore(lore);
                    result.setItemMeta(resultMeta);
                    event.setResult(result);
                }
            }
            if (MeleeWeaponItemManager.weaponsName.contains(event.getInventory().getItem(0).getItemMeta().getDisplayName()) && event.getInventory().getItem(1).equals(UpgradesItemManager.upgrades.get(0))) {
                fourLvlAction("§bCrystallized", event);
            }
        }
    }
    private ItemStack createItem(String name, Material mat, List<String> lore, int amount) {
        ItemStack item = new ItemStack(mat, amount);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    private static void fourLvlAction(String name, PrepareAnvilEvent event) {
        if (!result.getItemMeta().getLore().contains(name + " IV")) {
            if (result.getItemMeta().getLore().contains(name + " III")) {
                lore = result.getItemMeta().getLore();
                index = lore.indexOf(name + " III");
                lore.set(index, name + " IV");
            } else if (result.getItemMeta().getLore().contains(name + " II")) {
                lore = result.getItemMeta().getLore();
                index = lore.indexOf(name + " II");
                lore.set(index, name + " III");
            } else if (result.getItemMeta().getLore().contains(name + " I")) {
                lore = result.getItemMeta().getLore();
                index = lore.indexOf(name + " I");
                lore.set(index, name + " II");
            } else {
                lore = result.getItemMeta().getLore();
                lore.add(name + " I");
            }
            resultMeta = result.getItemMeta();
            resultMeta.setLore(lore);
            result.setItemMeta(resultMeta);
            event.setResult(result);
        }
    }
}
