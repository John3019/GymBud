package com.example.testy;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Location extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        getSupportActionBar().setTitle("GymBud");

        Button btn = (Button) findViewById(R.id.Home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Location.this, Workout.class);
                startActivity(i);
                finish();
            }
        });

        Button btn2 = (Button) findViewById(R.id.Gym);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Location.this, Gym.class);
                startActivity(i);
                finish();
            }
        });
    }
}