package com.example.myguitarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class training_notes_or_strings extends AppCompatActivity {

    private Button button_training_notes_or_strings_to_main;
    private Button button_training_by_notes;
    private Button button_button_training_notes_or_strings_to_game;
    static int param_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_notes_or_strings);

        button_training_notes_or_strings_to_main=findViewById(R.id.button2);
        button_training_by_notes=findViewById(R.id.training_by_notes);
        button_button_training_notes_or_strings_to_game=findViewById(R.id.traning_by_chords);


        
        button_training_notes_or_strings_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    openActivity_MainActivity();
                }
                catch (Exception e){

                }
            }
        });
        //////////////////////////////////////////////////
        button_training_by_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_choose_string();
            }
        });
        //////////////////////////////////////////////////
        button_button_training_notes_or_strings_to_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_game_with_4_answers();
            }
        });
    }


    public void openActivity_game_with_4_answers(){
        Intent intent = new Intent(this,game_with_4_answers.class);
        param_intent=1; //для перехода между экранамами choose_string,training_notes_or_string и game_with_4_answers

        startActivity(intent);
    }
    ///////////////////
    public void openActivity_MainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    /////////////////////////
    public void openActivity_choose_string(){
        Intent intent = new Intent(this,choose_string.class);
        startActivity(intent);
    }
}