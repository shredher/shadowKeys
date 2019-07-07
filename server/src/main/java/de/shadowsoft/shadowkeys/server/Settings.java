package de.shadowsoft.shadowkeys.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Settings {

    private static final Logger LOGGER = LogManager.getLogger(Settings.class);
    public static String PORT = "PORT";

    private Map<String, String> map;


    public Settings() {
        map = new HashMap<>();
        reset();
    }

    public int getIntSetting(String key) {
        String val = getSetting(key);
        try {
            return Integer.parseInt(val);
        } catch (NumberFormatException e) {
            LOGGER.error(String.format("Setting '%s' does not contain a valid number: '%s'", key, val));
            return 0;
        }
    }

    public String getSetting(String key) {
        return map.getOrDefault(key, "");
    }

    public void reset() {
        map.clear();
        setSetting(PORT, "4444");
    }

    public void setSetting(String key, String value) {
        map.put(key, value);
    }

}
    
    