package de.shadowsoft.shadowkeys.common;

import android.util.Log;
import de.shadowsoft.shadowkeys.client.MainActivity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ShadowKeyClient {
    private static String TAG = ShadowKeyClient.class.getSimpleName();

    private Socket clientSocket;
    private BufferedReader in;
    private PrintWriter out;
    private boolean connected;

    public String sendMessage(String msg) {
        if(connected) {
            out.println(msg);
        }else {
            Log.e(TAG, "Not connected. Cannot send message!");
        }
        return msg;
    }

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        connected = true;
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }
}
    
    