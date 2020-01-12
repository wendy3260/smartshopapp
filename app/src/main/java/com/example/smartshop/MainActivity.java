package com.example.smartshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton activity_button;
    private ImageButton profile_button;
    private Button menstrual;
    private Button straw;
    private Button flask;
    private Button swab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activity_button = (ImageButton) findViewById(R.id.imageButton2);
        activity_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openActivity();
            }
        });

        profile_button = (ImageButton) findViewById(R.id.imageButton3);
        profile_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openProfile();
            }
        });

        menstrual = (Button) findViewById(R.id.button3);
        menstrual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openMenstrual();
            }
        });

        flask = (Button) findViewById(R.id.button4);
        flask.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openFlask();
            }
        });

        straw = (Button) findViewById(R.id.button5);
        straw.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openStraw();
            }
        });

        swab = (Button) findViewById(R.id.button6);
        swab.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                openSwab();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, activity.class);
        startActivity(intent);
    }

    public void openProfile(){
        Intent intent = new Intent(this, profile.class);
        startActivity(intent);
    }

    public void openMenstrual(){
        Intent intent = new Intent(this, menstrual.class);
        startActivity(intent);
    }

    public void openFlask(){
        Intent intent = new Intent(this, flask.class);
        startActivity(intent);
    }

    public void openStraw(){
        Intent intent = new Intent(this, straws.class);
        startActivity(intent);
    }

    public void openSwab(){
        Intent intent = new Intent(this, swab.class);
        startActivity(intent);
    }
}
