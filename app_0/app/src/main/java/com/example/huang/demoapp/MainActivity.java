package com.example.huang.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    // use a View object and call it view
    public void clickFunction(View view) {

        // read user input text from the edit text box
        EditText usernameEditText = (EditText) findViewById(R.id.usernameTextField); // R is for resources , (EditText) -- convert view to text
        EditText passwordEditText = (EditText) findViewById(R.id.passwordTextfield);

        // quick flush of
        Toast.makeText(MainActivity.this,usernameEditText.getText().toString() + ": " + passwordEditText.getText().toString(), Toast.LENGTH_LONG).show();

        // after log in change the picture
        ImageView image = (ImageView) findViewById(R.id.logoImageview);
        image.setImageResource(R.drawable.logo);

        // log info
        Log.i("Info", usernameEditText.getText().toString() + " " + passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
