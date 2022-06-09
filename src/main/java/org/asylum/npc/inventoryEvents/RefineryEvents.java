package org.asylum.npc.inventoryEvents;

import org.asylum.itemManager.MaterialsItemManager;
import org.asylum.npc.guis.RefineryGUI;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class RefineryEvents implements Listener {
    private int amount = 1;
    private int type = 0;

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) {
            return;
        }
        if (event.getCurrentItem() == null) {
            return;
        }
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory().getHolder() instanceof RefineryGUI) {
            event.setCancelled(true);
            if (event.isRightClick())
                event.setCancelled(true);
            if (event.isShiftClick())
                event.setCancelled(true);
            if (event.isLeftClick()) {
                event.setCancelled(true);
                if (event.getCurrentItem() == null) {
                    event.setCancelled(true);
                    return;
                }
                if (event.getCurrentItem().getType() == Material.BARRIER) {
                    player.closeInventory();
                }
                if (event.getSlot() == 10 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§7Form rocks into a stone"))) {
                    amount = 1;
                    type = 4;
                    RefineryGUI.inv.clear();
                    RefineryStart();
                    StoneRefine(amount);

                }
                if (event.getSlot() == 11 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§7Smelt tin ingots"))) {
                    amount = 1;
                    type = 5;
                    RefineryGUI.inv.clear();
                    RefineryStart();
                    TinSmelt(amount);
                }
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCompress rocks to a stone"))) {
                    if (player.getInventory().containsAtLeast(MaterialsItemManager.rock, amount * 4)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            MaterialsItemManager.rock.setAmount(amount * 4);
                            MaterialsItemManager.stone.setAmount(amount);
                            player.getInventory().removeItem(MaterialsItemManager.rock);
                            player.getInventory().addItem(MaterialsItemManager.stone);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
            }
        }
        if (event.getCurrentItem().getType() == Material.LIME_CONCRETE && amount < 55) {
            amount += 10;
            if (type == 1) {
                StoneRefine(amount);
            } else if (type == 2) {
                TinSmelt(amount);
            }
        }
        if (event.getCurrentItem().getType() == Material.LIME_CONCRETE_POWDER && amount < 64) {
            amount ++;
            if (type == 1) {
                StoneRefine(amount);
            } else if (type == 2) {
                TinSmelt(amount);
            }
        }
        if (event.getCurrentItem().getType() == Material.RED_CONCRETE && amount > 10) {
            amount -= 10;
            if (type == 1) {
                StoneRefine(amount);
            } else if (type == 2) {
                TinSmelt(amount);
            }
        }
        if (event.getCurrentItem().getType() == Material.RED_CONCRETE_POWDER && amount > 1) {
            amount --;
            if (type == 1) {
                StoneRefine(amount);
            } else if (type == 2) {
                TinSmelt(amount);
            }
        }
    }


    public void RefineryStart() {
        Inventory RefinStart = Bukkit.createInventory(null, 45, "§aRefinery");
        ItemStack item;
        item = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            RefineryGUI.inv.setItem(i, item);
            RefineryGUI.inv.setItem((i + 36), item);
        }
        RefineryGUI.inv.setItem(9, item);
        RefineryGUI.inv.setItem(13, item);
        RefineryGUI.inv.setItem(17, item);
        RefineryGUI.inv.setItem(18, item);
        RefineryGUI.inv.setItem(26, item);
        RefineryGUI.inv.setItem(27, item);
        RefineryGUI.inv.setItem(31, item);
        RefineryGUI.inv.setItem(35, item);

        item = new ItemStack(Material.BARRIER);
        meta = item.getItemMeta();
        meta.setDisplayName("§c§lExit");
        item.setItemMeta(meta);
        RefineryGUI.inv.setItem(40, item);

        item = createItem("§aAdd 10 more", Material.LIME_CONCRETE, Collections.EMPTY_LIST, 1);
        RefineryGUI.inv.setItem(2, item);
        item = createItem("§aAdd 1 more", Material.LIME_CONCRETE_POWDER, Collections.EMPTY_LIST, 1);
        RefineryGUI.inv.setItem(3, item);
        item = createItem("§cSubstract 1", Material.RED_CONCRETE_POWDER, Collections.EMPTY_LIST, 1);
        RefineryGUI.inv.setItem(5, item);
        item = createItem("§cSubstract 10", Material.RED_CONCRETE, Collections.EMPTY_LIST, 1);
        RefineryGUI.inv.setItem(6, item);
    }

    private void StoneRefine(int amount){
        ItemStack item;
        item = MaterialsItemManager.rock;
        item.setAmount(amount);
        RefineryGUI.inv.setItem(10, item);
        RefineryGUI.inv.setItem(11, item);
        RefineryGUI.inv.setItem(19, item);
        RefineryGUI.inv.setItem(20, item);
        item = createItem("§aCompress", Material.ANVIL, Collections.singletonList("§fCompress rocks to a stone"), 1);
        RefineryGUI.inv.setItem(22, item);
        item = MaterialsItemManager.stone;
        item.setAmount(amount);
        RefineryGUI.inv.setItem(24, item);
    }

    private void TinSmelt(int amount) {
        ItemStack item;
        item = MaterialsItemManager.tinOre;
        item.setAmount(amount);
        RefineryGUI.inv.setItem(10, item);
        RefineryGUI.inv.setItem(11, item);
        RefineryGUI.inv.setItem(12, item);
        RefineryGUI.inv.setItem(19, item);
        item = MaterialsItemManager.coal;
        item.setAmount(amount);
        RefineryGUI.inv.setItem(20, item);
        item = createItem(net.md_5.bungee.api.ChatColor.of("#9a6904") + "Smelt", Material.BLAST_FURNACE, Collections.singletonList("§fSmelt tin ore into tin ingots"), 1);
        RefineryGUI.inv.setItem(22, item);
        item = MaterialsItemManager.tinIngot;
        item.setAmount(amount);
        RefineryGUI.inv.setItem(14, item);
        RefineryGUI.inv.setItem(15, item);
    }

    public static void CClear() {
        ItemStack item = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            RefineryGUI.inv.setItem(i, item);
            RefineryGUI.inv.setItem(i + 9, item);
            RefineryGUI.inv.setItem(i + 18, item);
            RefineryGUI.inv.setItem(i + 27, item);
            RefineryGUI.inv.setItem((i + 36), item);
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
}
