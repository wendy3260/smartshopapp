package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class straws extends AppCompatActivity {
    private ImageButton main_button;
    private ImageButton profile_button;
    private ImageButton activity_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_straws);
        main_button = (ImageButton) findViewById(R.id.imageButton16);
        main_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMain();
            }
        });

        activity_button = (ImageButton) findViewById(R.id.imageButton17);
        activity_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });

        profile_button = (ImageButton) findViewById(R.id.imageButton18);
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

    public void openActivity(){
        Intent intent = new Intent(this, activity.class);
        startActivity(intent);
    }
    public void openProfile() {
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }
}
