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
        //Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //This part of code creates intent and add  a text to it. Constant used to assign information
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        //Code below creates intent that use sending action with other apps
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        // Getting chooser title
        String chooserTitle = getString(R.string.chooser);
        // Creating new intent to guarantee, that user will always be asked about app to use
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}