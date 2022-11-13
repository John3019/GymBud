package com.example.testy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Gym extends AppCompatActivity {

    ArrayList<String> Workouts = new ArrayList<String>();

    //String[] Workouts = {"Run", "Push Ups", "Pull Ups", "Minute PLank", "Burpees", "Sit Ups"};
    int num = 0;
    int[] Complete;
    boolean check = true;

    public Gym() {
        Workouts.add("BenchPress");
        Workouts.add("Squat Rack");
        Workouts.add("Chest Press");
        Workouts.add("Deadlifts");
        Workouts.add("Leg Press");
        Workouts.add("Dumbell Curls");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        getSupportActionBar().setTitle("GymBud");

        Button btn = (Button) findViewById(R.id.Gen_Work);
        TextView txt = (TextView) findViewById(R.id.Workview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Workouts.size() == 0) {
                    if (check) {
                        btn.setText("Finish");
                        txt.setText("All Done");
                        check = false;
                    }
                    else {
                        Intent i = new Intent(Gym.this, MainActivity.class);
                        startActivity(i);
                        finish();

                    }
                } else {
                    Random rand = new Random();
                    int plan = rand.nextInt(Workouts.size());
                    String exercise = Workouts.get(plan);
                    txt.setText(exercise);
                    Workouts.remove(plan);
                }



            }
        });

    }

}