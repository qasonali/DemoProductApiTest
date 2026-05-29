package com.api.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
	
	Properties prop;
	private static ConfigManager instance;
	
    // private constructor prevents external initialization
	private ConfigManager() {
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("src/test/resources/Config.properties");
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ConfigManager getInstance() {
		if(instance == null) {
			synchronized (ConfigManager.class) { //thread safe
				if(instance == null) {
					instance = new ConfigManager();
				}
			}		
		}
		return instance;
	}
	
	 public String getProperty(String key) {
	        return prop.getProperty(key);
	    }
}
