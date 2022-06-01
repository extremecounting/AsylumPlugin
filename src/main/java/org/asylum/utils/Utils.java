package org.asylum.utils;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Utils {
	/**
	 * Formats a string to use Colorcodes
	 * @param string message to translate colorcodes
	 * @return Formated Message
	 */
	public static String color(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
	/**
	 * Sends a colorcode formated message to the player 
	 * @param player Player to send the message to
	 * @param message Message to send
	 */
	public static void sendMsg(Player player, String message) {
		player.sendMessage(color(message));
	}
	
	/**
	 * Strips a string from color
	 * @param string message to strip color from
	 * @return Stripped Message
	 */
	public static String decolor(String string) {
		return ChatColor.stripColor(color(string));
	}
}
