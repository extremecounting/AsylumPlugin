package org.asylum.rightClick;

import org.asylum.Asylum;
import org.asylum.gui.ItemGui;
import org.asylum.itemManager.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RightClickItem implements Listener {

    public static ItemStack DisplayItem;
    public static List<ItemStack> AttributeDisplays = new ArrayList<>();

    @EventHandler
    public void OnRightClick(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();
        ItemStack item = event.getItem();
        String itemName = item.getItemMeta().getDisplayName();

        if ((action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK)) && !player.isSneaking()) {
            if (item != null) {
                if (BashersItemManager.bashersName.contains(item.getItemMeta().getDisplayName())) {
                    double pushAmount = 1.5;
                    int damage = (BashersItemManager.bashersName.indexOf(item.getItemMeta().getDisplayName()) * 2) + 4;
                    player.setVelocity(player.getLocation().getDirection().multiply(pushAmount));
                    player.sendMessage(String.valueOf(damage));
                    Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                        Collection<Entity> mobs = player.getWorld().getNearbyEntities(player.getLocation(), 2, 2, 2);
                        for (Entity e : mobs) {
                            if (!(e instanceof Player)) {
                                ((LivingEntity) e).damage(damage);
                            }
                        }
                    }, 2L);
                }
            }
        }
        if ((action.equals(Action.RIGHT_CLICK_AIR) && player.isSneaking()) || (action.equals(Action.RIGHT_CLICK_BLOCK) && player.isSneaking())) {
            if (item != null) {
                if (ArmorItemManager.armorName.contains(itemName) || BashersItemManager.bashersName.contains(itemName) || MeleeWeaponItemManager.weaponsName.contains(itemName)
                        || ToolItemManager.toolsName.contains(itemName)) {
                    event.setCancelled(true);
                    AttributeDisplays.clear();
                    DisplayItem = item;
                    ItemGui gui;
                    if (item.getItemMeta().getLore().contains("§8Heavy IV")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                    }
                    if (item.getItemMeta().getLore().contains("§8Heavy III")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                    }
                    if (item.getItemMeta().getLore().contains("§8Heavy II")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                    }
                    if (item.getItemMeta().getLore().contains("§8Heavy I")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(3));
                    }
                    if (item.getItemMeta().getLore().contains("§fLight IV")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                    }
                    if (item.getItemMeta().getLore().contains("§fLight III")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                    }
                    if (item.getItemMeta().getLore().contains("§fLight II")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                    }
                    if (item.getItemMeta().getLore().contains("§fLight I")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(2));
                    }
                    if (item.getItemMeta().getLore().contains("§cHeated")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(1));
                    }
                    if (item.getItemMeta().getLore().contains("§bCrystallized IV")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                    }
                    if (item.getItemMeta().getLore().contains("§bCrystallized III")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                    }
                    if (item.getItemMeta().getLore().contains("§bCrystallized II")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                    }
                    if (item.getItemMeta().getLore().contains("§bCrystallized I")) {
                        AttributeDisplays.add(UpgradesItemManager.upgrades.get(0));
                    }
                    gui = new ItemGui();
                    player.openInventory(gui.getInventory());
                }

            }
        }
    }
}
