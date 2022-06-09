package org.asylum.npc.inventoryEvents;

import org.asylum.itemManager.ArmorItemManager;
import org.asylum.itemManager.MaterialsItemManager;
import org.asylum.itemManager.ToolItemManager;
import org.asylum.npc.guis.BlacksmithGUI;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class BlacksmithEvents implements Listener {
    @EventHandler
    public void onClickEventBlacksmith(InventoryClickEvent event) {
        if (event.getClickedInventory() == null) { return; }
        if (event.getCurrentItem() == null) { return; }
        Player player = (Player) event.getWhoClicked();
        if (event.getClickedInventory().getHolder() instanceof BlacksmithGUI) {
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
                if (event.getSlot() == 20 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§7Buy tools"))) {
                    ItemStack item;
                    BlacksmithStart();
                    item = new ItemStack(Material.AIR);
                    BlacksmithGUI.inv.setItem(13, item);
                    BlacksmithGUI.inv.setItem(31, item);
                    item = createItem("§7Stone Pickaxe", Material.STONE_PICKAXE, Collections.singletonList("§aBuy a stone pickaxe"), 1);
                    BlacksmithGUI.inv.setItem(10, item);
                }
                if (event.getSlot() == 22 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§7Buy armor"))) {
                    ItemStack item;
                    CClear();
                    BlacksmithStart();
                    item = new ItemStack(Material.AIR);
                    BlacksmithGUI.inv.setItem(13, item);
                    BlacksmithGUI.inv.setItem(31, item);
                    item = createItem("§fTin Armor", ArmorItemManager.tinChestplate.getType(), Collections.singletonList("§7Buy tin armor"), 1);
                    BlacksmithGUI.inv.setItem(10, item);
                }
                if (event.getSlot() == 24 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§7Buy weapons"))) {
                    ItemStack item;
                    CClear();
                    BlacksmithStart();
                    item = new ItemStack(Material.AIR);
                    BlacksmithGUI.inv.setItem(13, item);
                    BlacksmithGUI.inv.setItem(31, item);
                }
                if (event.getSlot() == 10 && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§aBuy a stone pickaxe"))) {
                    CClear();
                    BlacksmithStart();
                    ItemStack item;
                    item = MaterialsItemManager.stone;
                    BlacksmithGUI.inv.setItem(10, item);
                    BlacksmithGUI.inv.setItem(11, item);
                    BlacksmithGUI.inv.setItem(12, item);
                    item = MaterialsItemManager.branch;
                    BlacksmithGUI.inv.setItem(20, item);
                    BlacksmithGUI.inv.setItem(29, item);
                    item = createItem("§8Create", Material.ANVIL, Collections.singletonList("§fCreate your stone pickaxe"), 1);
                    BlacksmithGUI.inv.setItem(22, item);
                    item = ToolItemManager.stonePick;
                    BlacksmithGUI.inv.setItem(24, item);
                }
                if (event.getSlot() == 22 && event.getCurrentItem().getType() == Material.ANVIL && event.getCurrentItem().getItemMeta().getLore().equals(Collections.singletonList("§fCreate your stone pickaxe"))) {
                    if (player.getInventory().containsAtLeast(MaterialsItemManager.stone, 3) && player.getInventory().containsAtLeast(MaterialsItemManager.branch, 2)) {
                        if (player.getInventory().firstEmpty() > -1) {
                            MaterialsItemManager.stone.setAmount(3);
                            MaterialsItemManager.branch.setAmount(2);
                            player.getInventory().remove(MaterialsItemManager.stone);
                            player.getInventory().removeItem(MaterialsItemManager.branch);
                            player.getInventory().addItem(ToolItemManager.stonePick);
                        } else {
                            player.sendMessage("§cYou don't have enough space!");
                        }
                    } else {
                        player.sendMessage("§cYou don't have all the needed items!");
                    }
                }
            }
        }
    }

    public void BlacksmithStart() {
        ItemStack item;
        item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            BlacksmithGUI.inv.setItem(i, item);
            BlacksmithGUI.inv.setItem((i + 36), item);
        }
        BlacksmithGUI.inv.setItem(9, item);
        BlacksmithGUI.inv.setItem(13, item);
        BlacksmithGUI.inv.setItem(17, item);
        BlacksmithGUI.inv.setItem(18, item);
        BlacksmithGUI.inv.setItem(26, item);
        BlacksmithGUI.inv.setItem(27, item);
        BlacksmithGUI.inv.setItem(31, item);
        BlacksmithGUI.inv.setItem(35, item);

        item = new ItemStack(Material.BARRIER);
        meta = item.getItemMeta();
        meta.setDisplayName("§c§lExit");
        item.setItemMeta(meta);
        BlacksmithGUI.inv.setItem(40, item);


    }

    public static void CClear() {
        ItemStack item = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(" ");
        item.setItemMeta(meta);
        for (int i = 0; i < 9; i++) {
            BlacksmithGUI.inv.setItem(i, item);
            BlacksmithGUI.inv.setItem(i + 9, item);
            BlacksmithGUI.inv.setItem(i + 18, item);
            BlacksmithGUI.inv.setItem(i + 27, item);
            BlacksmithGUI.inv.setItem((i + 36), item);
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
