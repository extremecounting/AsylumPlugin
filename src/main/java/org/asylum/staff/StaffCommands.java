package org.asylum.staff;

import org.asylum.discordIntergrations.ChatConversion;
import org.asylum.itemManager.*;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class StaffCommands implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return true;
        }
        Player player = (Player) sender;

        if (cmd.getName().equalsIgnoreCase("hammer") && player.isOp()) {
            player.getInventory().addItem(MeleeWeaponItemManager.hammer);
        } else if (cmd.getName().equalsIgnoreCase("crystal") && player.isOp()) {
            player.getInventory().addItem(UpgradesItemManager.crystal);
        } else if (cmd.getName().equalsIgnoreCase("stonepick") && player.isOp()) {
            player.getInventory().addItem(ToolItemManager.stonePick);
        } else if (cmd.getName().equalsIgnoreCase("tinpick") && player.isOp()) {
            player.getInventory().addItem(ToolItemManager.tinPick);
        } else if (cmd.getName().equalsIgnoreCase("magmabucket") && player.isOp()) {
            player.getInventory().addItem(UpgradesItemManager.magmaBucket);
        } else if (cmd.getName().equalsIgnoreCase("tinbashshield") && player.isOp()) {
            player.getInventory().addItem(BashersItemManager.tinBashShield);
        } else if (cmd.getName().equalsIgnoreCase("bashshields") && player.isOp()) {
            for (ItemStack e : BashersItemManager.bashers) {
                player.getInventory().addItem(e);
            }
        } else if (cmd.getName().equalsIgnoreCase("armorplates") && player.isOp()) {
            player.getInventory().addItem(UpgradesItemManager.upgrades.get(2));
            player.getInventory().addItem(UpgradesItemManager.upgrades.get(3));
        } else if (cmd.getName().equalsIgnoreCase("tinarmors") && player.isOp()) {
            player.getInventory().addItem(ArmorItemManager.armor.get(0));
            player.getInventory().addItem(ArmorItemManager.armor.get(1));
            player.getInventory().addItem(ArmorItemManager.armor.get(2));
            player.getInventory().addItem(ArmorItemManager.armor.get(3));
        } else if (cmd.getName().equalsIgnoreCase("copperarmors") && player.isOp()) {
            player.getInventory().addItem(ArmorItemManager.armor.get(4));
            player.getInventory().addItem(ArmorItemManager.armor.get(5));
            player.getInventory().addItem(ArmorItemManager.armor.get(6));
            player.getInventory().addItem(ArmorItemManager.armor.get(7));
        } else if (cmd.getName().equalsIgnoreCase("bronzearmors") && player.isOp()) {
            player.getInventory().addItem(ArmorItemManager.armor.get(8));
            player.getInventory().addItem(ArmorItemManager.armor.get(9));
            player.getInventory().addItem(ArmorItemManager.armor.get(10));
            player.getInventory().addItem(ArmorItemManager.armor.get(11));
        } else if (cmd.getName().equalsIgnoreCase("ironarmors") && player.isOp()) {
            player.getInventory().addItem(ArmorItemManager.armor.get(12));
            player.getInventory().addItem(ArmorItemManager.armor.get(13));
            player.getInventory().addItem(ArmorItemManager.armor.get(14));
            player.getInventory().addItem(ArmorItemManager.armor.get(15));
        } else if (cmd.getName().equalsIgnoreCase("titaniumarmors") && player.isOp()) {
            player.getInventory().addItem(ArmorItemManager.armor.get(16));
            player.getInventory().addItem(ArmorItemManager.armor.get(17));
            player.getInventory().addItem(ArmorItemManager.armor.get(18));
            player.getInventory().addItem(ArmorItemManager.armor.get(19));
        } else if (cmd.getName().equalsIgnoreCase("tungstenarmors") && player.isOp()) {
            player.getInventory().addItem(ArmorItemManager.armor.get(20));
            player.getInventory().addItem(ArmorItemManager.armor.get(21));
            player.getInventory().addItem(ArmorItemManager.armor.get(22));
            player.getInventory().addItem(ArmorItemManager.armor.get(23));
        } else if (cmd.getName().equalsIgnoreCase("pebble") && player.isOp()) {
            player.getInventory().addItem(MaterialsItemManager.pebble);
        } else if (cmd.getName().equalsIgnoreCase("togglechatdisc") && player.isOp()) {
            if (ChatConversion.chatOn == true) {
                ChatConversion.chatOn = false;
                Bukkit.broadcastMessage("§cChat to Discord off");
            } else {
                ChatConversion.chatOn = true;
                Bukkit.broadcastMessage("§aChat to Discord on");
            }
        }
        return true;
    }
}
