package de.shadowsoft.shadowkeys.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Server {
    private static final Logger LOGGER = LogManager.getLogger(Server.class);

    public static void main(String[] args) {
        SettingsService settingsService = SettingsService.getInstance();
        int port = settingsService.getSettings().getIntSetting(Settings.PORT);
        LOGGER.info("Drawing up...");
        ShadowKeyServer server = new ShadowKeyServer();
        LOGGER.info("Starting server on port " + port + "...");
        try {
            server.start(port);
        } catch (Exception e) {
            LOGGER.error("Unable to start server on port " + port);
        }
        LOGGER.info("Server closed.");
    }
}
    
    