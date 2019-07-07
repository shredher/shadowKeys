package de.shadowsoft.shadowkeys.server;

import de.shadowsoft.shadowkeys.common.ShadowKeyClient;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class DummyClient {

    private static final Logger LOGGER = LogManager.getLogger(DummyClient.class);

    public static void main(String[] args) {
        String serverIp = "localhost";
        int port = SettingsService.getInstance().getSettings().getIntSetting(Settings.PORT);
        try {
            ShadowKeyClient client = new ShadowKeyClient();
            LOGGER.info(String.format("Connecting client to server '%s' on port %s...", serverIp, port));
            client.startConnection(serverIp, port);
            LOGGER.info("Client connected");
            LOGGER.info("Sending 1st message...");
            client.sendMessage("hello");
            LOGGER.info("Sending 2nd message...");
            client.sendMessage("world");
            LOGGER.info("Sending 1rd message...");
            client.sendMessage("!");
            LOGGER.info("Sending STOP message...");
            client.sendMessage(".");
            client.stopConnection();
        } catch (IOException e) {
            LOGGER.error("Unable to connect server and client");
        }
    }
}
    