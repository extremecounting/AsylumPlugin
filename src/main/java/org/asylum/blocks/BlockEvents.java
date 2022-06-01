package org.asylum.blocks;

import org.asylum.Asylum;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Collection;
import java.util.List;

public class BlockEvents implements Listener {

    private PotionEffect effect;

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        player.removePotionEffect(PotionEffectType.SLOW_DIGGING);
        if (effect != null) {
            player.addPotionEffect(effect);
        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockDamage(BlockDamageEvent event) {
        Player player = event.getPlayer();
        Collection<PotionEffect> potionEffects = player.getActivePotionEffects();
        player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 1, 10));
        if (event.getBlock().getType() == Material.STONE) {
            minePotion(player, 0, potionEffects);
        } else if (event.getBlock().getType() == Material.DEEPSLATE_IRON_ORE) {
            minePotion(player, 1, potionEffects);
        } else if (event.getBlock().getType() == Material.COPPER_ORE) {
            minePotion(player, 2, potionEffects);
        } else if (event.getBlock().getType() == Material.IRON_ORE) {
            minePotion(player, 3, potionEffects);
        } else if (event.getBlock().getType() == Material.DEEPSLATE_COAL_ORE) {
            minePotion(player, 4, potionEffects);
        } else if (event.getBlock().getType() == Material.DEEPSLATE_COPPER_ORE) {
            minePotion(player, 5, potionEffects);
        }
        Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
            if ((1 / event.getBlock().getBreakSpeed(player)) > 200) {
                event.setCancelled(true);
                player.sendMessage(ChatColor.RED + "Your tool is to weak for this!");
                player.sendMessage(String.valueOf(1/event.getBlock().getBreakSpeed(player)));
            }
        }, 5L);
    }
    private void minePotion(Player player, int amplifier, Collection<PotionEffect> potionEffects) {
        List<PotionEffect> activeEffects = (List<PotionEffect>) potionEffects;
        int afterAmplifier;
        Boolean fatigueActive = false;
        for (PotionEffect e : activeEffects) {
            if (e.getType().equals(PotionEffectType.SLOW_DIGGING)) {
                fatigueActive = true;
                int formerAmplifier = e.getAmplifier();
                effect = e;
                if (amplifier == 0 && formerAmplifier == 0) {
                    afterAmplifier = 1;
                } else {
                    afterAmplifier = amplifier + formerAmplifier + 1;
                }
                player.removePotionEffect(PotionEffectType.SLOW_DIGGING);
                player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 200, afterAmplifier));
                Bukkit.getScheduler().runTaskLater(JavaPlugin.getPlugin(Asylum.class), () -> {
                    player.addPotionEffect(effect);
                }, 202);
            }
        }
        if (!fatigueActive) {
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW_DIGGING, 200, amplifier));
        }
    }
}
