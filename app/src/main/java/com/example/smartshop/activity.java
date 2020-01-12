package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class activity extends AppCompatActivity {
    private ImageButton profile_button;
    private ImageButton main_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        main_button = (ImageButton) findViewById(R.id.imageButton7);
        main_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMain();
            }
        });

        profile_button = (ImageButton) findViewById(R.id.imageButton9);
        profile_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openProfile();
            }
        });
    }

    public void openMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openProfile() {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}