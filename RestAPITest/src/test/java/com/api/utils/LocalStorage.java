package com.api.utils;

import java.io.*;
import java.util.Properties;

public class LocalStorage {
    private static final String FILE_PATH = "src/test/resources/localstorage.properties";

    public static void saveCredentials(String email, String password) {
        try (FileOutputStream fos = new FileOutputStream(FILE_PATH)) {
            Properties prop = new Properties();
            prop.setProperty("username", email);
            prop.setProperty("password", password);
            prop.store(fos, "Stored credentials from Register API");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUsername() {
        return getProperty("username");
    }

    public static String getPassword() {
        return getProperty("password");
    }

    private static String getProperty(String key) {
        try (FileInputStream fis = new FileInputStream(FILE_PATH)) {
            Properties prop = new Properties();
            prop.load(fis);
            return prop.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
