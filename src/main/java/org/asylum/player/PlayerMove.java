package org.asylum.player;

import org.apache.commons.collections4.CollectionUtils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;

public class PlayerMove implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent event) {
        float speed = 0.2f;
        int lightAmount = 0;
        Player player = event.getPlayer();
        List<ItemStack> armorContents = Arrays.asList(player.getInventory().getArmorContents());
        if (!CollectionUtils.isEmpty(armorContents)) {
            lightAmount = armorStuff(armorContents, "§fLight");
            if (lightAmount > 0) {
                speed = (0.2f + (0.025f * lightAmount));
                if (speed > 1) {
                    speed = 1;
                }
            }
            player.setWalkSpeed(speed);
        } else {
            player.setWalkSpeed(0.2f);
        }
    }

    private int armorStuff(List<ItemStack> armor, String type) {
        int upgrade = 0;
        for (ItemStack item : armor) {
            if (item != null) {
                if(item.hasItemMeta()) {
                    if (item.getItemMeta().hasLore()) {
                        if (item.getItemMeta().getLore().contains(type + " IV")) {
                            upgrade += 4;
                        } else if (item.getItemMeta().getLore().contains(type + " III")) {
                            upgrade += 3;
                        } else if (item.getItemMeta().getLore().contains(type + " II")) {
                            upgrade += 2;
                        } else if (item.getItemMeta().getLore().contains(type + " I")) {
                            upgrade++;
                        }
                    }
                }
            }
        }
        return upgrade;
    }
}
