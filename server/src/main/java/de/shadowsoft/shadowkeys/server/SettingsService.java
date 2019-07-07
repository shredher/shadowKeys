package de.shadowsoft.shadowkeys.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SettingsService {
    private static final Logger logger = LogManager.getLogger(SettingsService.class);
    private static SettingsService instance;

    public static SettingsService getInstance() {
        if (instance == null) {
            instance = new SettingsService();
        }
        return instance;
    }

    private final Settings settings;

    private SettingsService() {
        settings = new Settings();
    }

    public Settings getSettings() {
        return settings;
    }
}
