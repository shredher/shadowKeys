package de.shadowsoft.shadowkeys.client;

import android.util.Log;
import de.shadowsoft.shadowkeys.common.ShadowKeyClient;

public class MessageSender implements Runnable {

    private static String TAG = MessageSender.class.getSimpleName();
    private final ShadowKeyClient client;
    private final String message;

    public MessageSender(ShadowKeyClient client, String message) {
        this.client = client;
        this.message = message;
    }

    @Override
    public void run() {
        client.sendMessage(message);
        Log.i(TAG, "Message " + message + " sent");
    }
}
    
    