package com.linuxkyrios.communicator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import android.os.Bundle;

public class ReceiveMessageActivity extends Activity {
    //Name of value transmitted in intent
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        //Two lines below are used to download intent and by
        // getStringExtra method read delivered string
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView) findViewById(R.id.message);
        // This line displays string in text view
        messageView.setText(messageText);
    }
}