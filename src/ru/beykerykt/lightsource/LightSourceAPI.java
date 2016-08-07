package ru.beykerykt.lightsource;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import ru.beykerykt.lightsource.items.ItemManager;
import ru.beykerykt.lightsource.items.flags.FlagManager;
import ru.beykerykt.lightsource.sources.SourceManager;
import ru.beykerykt.lightsource.sources.search.SearchMachine;

public class LightSourceAPI {

	private static ItemManager itemManager;
	private static FlagManager flagManager;
	private static SourceManager sourceManager;
	private static SearchMachine searchMachine;

	public static ItemManager getItemManager() {
		if (itemManager == null) {
			itemManager = new ItemManager();
		}
		return itemManager;
	}

	public static FlagManager getFlagManager() {
		if (flagManager == null) {
			flagManager = new FlagManager();
		}
		return flagManager;
	}

	public static SourceManager getSourceManager() {
		if (sourceManager == null) {
			sourceManager = new SourceManager();
		}
		return sourceManager;
	}

	public static SearchMachine getSearchMachine() {
		if (searchMachine == null) {
			searchMachine = new SearchMachine();
		}
		return searchMachine;
	}

	public static void sendMessage(CommandSender sender, String message) {
		sender.sendMessage(ChatColor.AQUA + "[LightSource]: " + ChatColor.WHITE + message);
	}
}
