package com.linuxkyrios.communicator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onSendMessage is performed when button is pressed
    public void onSendMessage(View view) {
        //Downloading text saved in EditText component
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        // Creating instance of intent class and assigning ReceiveMessageActivity as parameter,
        // then starting this activity
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //This part of code creates intent and add  a text to it. Constant used to assign information
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}