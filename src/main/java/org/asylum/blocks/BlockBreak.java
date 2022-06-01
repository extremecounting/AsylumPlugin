package org.asylum.blocks;

import org.apache.commons.collections4.CollectionUtils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class BlockBreak implements Listener {
    private static Player player;

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        player = event.getPlayer();
        ItemStack anItem = player.getInventory().getItemInMainHand();
        ItemMeta meta = player.getInventory().getItemInMainHand().getItemMeta();
        if (event.getBlock().getType() == Material.STONE) {
            blockMine(player, meta, 1);
        } else if (event.getBlock().getType() == Material.DEEPSLATE_IRON_ORE || event.getBlock().getType() == Material.COAL_ORE) {
            blockMine(player, meta, 2);
        } else if (event.getBlock().getType() == Material.COPPER_ORE) {
            blockMine(player, meta, 3);
        } else if (event.getBlock().getType() == Material.IRON_ORE) {
            blockMine(player, meta, 4);
        } else if (event.getBlock().getType() == Material.DEEPSLATE_COAL_ORE) {
            blockMine(player, meta, 5);
        } else if (event.getBlock().getType() == Material.DEEPSLATE_COPPER_ORE) {
            blockMine(player, meta, 6);
        }
        anItem.setItemMeta(meta);
        player.getInventory().setItemInMainHand(anItem);
    }

    private void blockMine(Player player, ItemMeta meta, int num) {
        List<String> lore = meta.getLore();
        if (!CollectionUtils.isEmpty(lore)) {
            String loretier = player.getInventory().getItemInMainHand().getItemMeta().getLore().get(1);
            int frstbracket = loretier.indexOf('[') + 1;
            int slashint = loretier.indexOf('/') + 1;
            int lastbracket = loretier.indexOf(']');
            int frstnumber = Integer.parseInt(loretier.substring(frstbracket, slashint - 1));
            int secndnumber = Integer.parseInt(loretier.substring(slashint, lastbracket));
            frstnumber += num;
            if (frstnumber >= secndnumber) {
                ItemStack leveledItem = levelItem(player.getInventory().getItemInMainHand());
                meta.setLore(leveledItem.getItemMeta().getLore());
            } else {
                lore.set(1, loretier.substring(0, frstbracket) + frstnumber + loretier.charAt(slashint - 1) + secndnumber + loretier.charAt(lastbracket));
                meta.setLore(lore);
            }
        }
    }

    private ItemStack levelItem(ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        List<String> lore = meta.getLore();
        String[] tierNames = {"§7§lPrimitive I ", "§7§lPrimitive II ", "§a§lApprentice I ", "§a§lApprentice II ", "§2§lJourneyman I ", "§2§lJourneyman II ", "§c§lMaster I ", "§c§lMaster II "};
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
}
