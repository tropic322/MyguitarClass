package com.example.myguitarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button button_to_theory;
    private Button button_to_practice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practice_or_theory);


        button_to_theory = findViewById(R.id.theory);
        button_to_theory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_activity(LessonList.class);
            }
        });

        ////////////////////////////////////

        /////////////////////////////////////

        button_to_practice = findViewById(R.id.practice);
        button_to_practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_activity( Practice.class);
            }
        });
    }
    public void open_activity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }



}

