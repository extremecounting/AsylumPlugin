package org.asylum.player;

import org.asylum.Asylum;
import org.asylum.itemManager.MeleeWeaponItemManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public class Damage implements Listener {
    @EventHandler
    public void onAttack(EntityDamageByEntityEvent event) {
        Entity attacker = event.getDamager();
        Entity victim = event.getEntity();
        if (victim instanceof Player) {
            List<ItemStack> armorContents = Arrays.asList(((Player) victim).getInventory().getArmorContents());
            double heavyAmount = armorStuff(armorContents, "§8Heavy");
            double damageResistance = (100 - (heavyAmount * 3)) / 100;
            double damage = event.getDamage() * damageResistance;
            event.setDamage(damage);
        }
        if (attacker instanceof Player) {
            List<String> weapons = Arrays.asList(MeleeWeaponItemManager.hammer.getItemMeta().getDisplayName());
            ItemStack helditem = ((Player) attacker).getInventory().getItemInMainHand();
            if (weapons.contains(helditem.getItemMeta().getDisplayName())) {

            }
            String[] crystals = {"§bCrystallized I", "§bCrystallized II", "§bCrystallized III", "§bCrystallized IV"};
            for (int i = 0; i < crystals.length; i++) {
                if (helditem.getItemMeta().getLore().contains(crystals[i])) {
                    event.setDamage(event.getDamage() + ((i + 1) * 2));
                    break;
                }
            }
            Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                attacker.sendMessage(String.valueOf(event.getDamage()));
                ItemStack anItem = ((Player) attacker).getInventory().getItemInMainHand();
                String loretier = ((Player) attacker).getInventory().getItemInMainHand().getItemMeta().getLore().get(1);
                ItemMeta meta = ((Player) attacker).getInventory().getItemInMainHand().getItemMeta();
                List<String> lore = meta.getLore();
                int frstbracket = loretier.indexOf('[') + 1;
                int slashint = loretier.indexOf('/') + 1;
                int lastbracket = loretier.indexOf(']');
                int frstnumber = Integer.parseInt(loretier.substring(frstbracket, slashint - 1));
                int secndnumber = Integer.parseInt(loretier.substring(slashint, lastbracket));
                double damage = event.getDamage();
                if (damage > 64) {
                    damage -= 64;
                    frstnumber += (8 + Math.round(damage / 32));
                } else if (damage > 16) {
                    damage -= 16;
                    frstnumber += (5 + Math.round(damage / 16));
                } else if (damage > 0) {
                    frstnumber += Math.round(1 + (damage / 4));
                }
                if (frstnumber >= secndnumber) {
                    ItemStack leveledItem = levelItem(anItem);
                    meta.setLore(leveledItem.getItemMeta().getLore());
                } else {
                    lore.set(1, loretier.substring(0, frstbracket) + frstnumber + loretier.charAt(slashint - 1) + secndnumber + loretier.charAt(lastbracket));
                    meta.setLore(lore);
                }
                anItem.setItemMeta(meta);
                ((Player) attacker).getInventory().setItemInMainHand(anItem);
                }, 2L);
        }
    }
    
    private ItemStack levelItem(ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        List<String> lore = meta.getLore();
        String[] tierNames = {"§7§lPrimitive I ", "§7§lPrimitive II ", "§a§lApprentice I ",
                "§a§lApprentice II ", "§2§lJourneyman I ", "§2§lJourneyman II ", "§c§lMaster I ", "§c§lMaster II "};
        int[] tierLimits = {25, 75, 200, 450, 1000, 2000, 5000, 12500};
        if (lore.contains("§c§lMaster II ")) {
            lore.set(1, "§c§lMaster III");
        } else {
            for (int i = 0; i < tierNames.length - 1; i++) {
                if (lore.get(1).contains(tierNames[i])) {
                    lore.set(1, tierNames[i + 1] + "§r§8[0/" + tierLimits[i + 1] + "]");
                    break;
                }
            }
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    private int armorStuff(List<ItemStack> armor, String type) {
        int upgrade = 0;
        for (ItemStack e : armor) {
            if (e != null) {
                if (e.getItemMeta().getLore().contains(type + " IV")) {
                    upgrade += 4;
                } else if (e.getItemMeta().getLore().contains(type + " III")) {
                    upgrade += 3;
                } else if (e.getItemMeta().getLore().contains(type + " II")) {
                    upgrade += 2;
                } else if (e.getItemMeta().getLore().contains(type + " I")) {
                    upgrade++;
                }
            }
        }
        return upgrade;
    }
}
