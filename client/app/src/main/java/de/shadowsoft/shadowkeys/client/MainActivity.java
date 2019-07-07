package de.shadowsoft.shadowkeys.client;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import de.shadowsoft.shadowkeys.common.ShadowKeyClient;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static String TAG = MainActivity.class.getSimpleName();
    private Button btnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ShadowKeyClient client = new ShadowKeyClient();

            Log.i(TAG, "Connecting to server...");
            ClientConnector connector = new ClientConnector(client);
            new Thread(connector).start();
            Log.i(TAG, "Connected");

        setContentView(R.layout.activity_main);
        initializeControls();
        initializeListener(client);
    }

    private void initializeListener(final ShadowKeyClient client) {
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MessageSender sender = new MessageSender(client, "keystroke:32");
                new Thread(sender).start();
            }
        });
    }

    private void initializeControls() {
    }
}
