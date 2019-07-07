package de.shadowsoft.shadowkeys.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ShadowKeyClient {
    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        return msg;
    }

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }
}
    
    