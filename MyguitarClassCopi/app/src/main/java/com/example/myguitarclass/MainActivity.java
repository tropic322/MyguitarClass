package com.example.myguitarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button_main_to_training;
    private Button button_main_to_guitar_tuning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //////////////////////////////////

        button_main_to_training=findViewById(R.id.training);
        button_main_to_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_training_notes_or_strings();
            }
        });
        ///////////////////////////////////
        button_main_to_guitar_tuning=findViewById(R.id.tuning);
        button_main_to_guitar_tuning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_guitar_tuning();
            }
        });
    }
    //////////////////////////////////////////////////////
    public void openActivity_training_notes_or_strings(){
        Intent intent = new Intent(this, training_notes_or_strings.class);
        startActivity(intent);
    }
    /////////////////////////////////////////////////////
    public void openActivity_guitar_tuning(){
        Intent intent = new Intent(this, guitar_tuning.class);
        startActivity(intent);
    }
}