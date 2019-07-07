package de.shadowsoft.shadowkeys.client;

import android.util.Log;
import de.shadowsoft.shadowkeys.common.ShadowKeyClient;

import java.io.IOException;

public class ClientConnector implements Runnable {
    private static String TAG = ClientConnector.class.getSimpleName();
    private ShadowKeyClient client;

    public ClientConnector(ShadowKeyClient client) {
        this.client = client;
    }

    @Override
    public void run() {
        try {
            client.startConnection("10.63.1.6", 4444);
            Log.i(TAG,"Connected to server!");
        } catch (IOException e) {
            Log.d(TAG, "Unable to connect to server", e);
        }
    }
}
    
    