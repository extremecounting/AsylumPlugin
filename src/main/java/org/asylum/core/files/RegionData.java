package org.asylum.core.files;

import java.io.File;
import java.io.IOException;

import org.asylum.Asylum;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class RegionData {

	private Asylum asylum;
	private String fileName;
	private File file;
	private FileConfiguration config = new YamlConfiguration();
	
	public RegionData(Asylum asylum, String fileName) {
		this.asylum = asylum;
		this.fileName = fileName;
		file = new File(asylum.getDataFolder(), fileName+".yml");
	}
	
	public void loadData() {
		if(!file.exists()) {
			file.getParentFile().mkdirs();
			asylum.saveResource(fileName, false);
		}
		try {
			config.load(file);
		} catch (IOException | InvalidConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	public void saveData() {
		try {
			config.save(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public FileConfiguration getConfig() {
		return config;
	}
}
