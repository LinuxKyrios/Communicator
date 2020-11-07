package com.linuxkyrios.communicator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onSendMessage is performed when button is pressed
    public void onSendMessage(View view) {
        // Creating instance of intent class and assigning ReceiveMessageActivity as parameter,
        // then starting this activity
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        startActivity(intent);
    }
}