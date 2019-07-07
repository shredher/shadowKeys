package de.shadowsoft.shadowkeys.server;

import de.shadowsoft.shadowkeys.common.Protocol;
import de.shadowsoft.shadowkeys.server.exception.CommunicationException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ShadowKeyServer {
    private static final Logger LOGGER = LogManager.getLogger(ShadowKeyServer.class);
    private Socket clientSocket;
    private ServerSocket serverSocket;

    private void sendKeyStroke(String key) throws AWTException, CommunicationException {
        try {
            int keyInt = Integer.parseInt(key);
            Robot robot = new Robot();
            robot.keyPress(keyInt);
            robot.keyRelease(keyInt);
        } catch (NumberFormatException e) {
            throw new CommunicationException("Unable to parse key " + key + " to integer", e);
        }
    }

    public void start(int port) throws IOException, AWTException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine;
        String terminateCommand = Protocol.TERMINATE_COMMAND;
        while ((inputLine = in.readLine()) != null) {
            LOGGER.info(String.format("Received command '%s'", inputLine));
            if (inputLine.equals(terminateCommand)) {
                LOGGER.info("Received termination command");
                break;
            }

            try {
                String[] split = inputLine.split(":");
                switch (split[0]) {
                    case Protocol.KEYSTROKE:
                        sendKeyStroke(split[1]);
                        break;
                }
            } catch (CommunicationException | IllegalArgumentException e) {
                LOGGER.warn(String.format("Message not understood '%s'", inputLine));
            }
        }
        stop();
    }

    public void stop() {
        try {
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            LOGGER.error("Unable to close socket!");
        }

    }
}
    