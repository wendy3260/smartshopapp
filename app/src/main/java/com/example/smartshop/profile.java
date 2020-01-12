package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class profile extends AppCompatActivity {
    private ImageButton activity_button;
    private ImageButton home_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        activity_button = (ImageButton) findViewById(R.id.imageButton4);
        activity_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openActivity();
            }
        });

        home_button = (ImageButton) findViewById(R.id.imageButton5);
        home_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openHome();
            }
        });
    }

    public void openActivity() {
        Intent intent = new Intent(this, activity.class);
        startActivity(intent);
    }

    public void openHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}