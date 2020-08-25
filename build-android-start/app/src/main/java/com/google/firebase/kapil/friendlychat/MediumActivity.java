package com.google.firebase.kapil.friendlychat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MediumActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);



    }

    public void Fees(View view) {

        startActivity(new Intent(this, LoginActivity.class));
    }

    public void Chat(View view) {
        startActivity(new Intent(this, MainActivity.class));

    }
}