package com.example.myguitarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class game_with_4_answers extends AppCompatActivity {

    private Button button_to_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_lauoyt_with_4_answers);

        button_to_back=findViewById(R.id.button20);

        button_to_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_training_notes_or_strings();
            }
        });
    }
    public void openActivity_training_notes_or_strings(){
        Intent intent = new Intent();

        if(training_notes_or_strings.param_intent==1) {
            intent = new Intent(this,training_notes_or_strings.class);
            startActivity(intent);
        }
        else
        {
            intent = new Intent(this,choose_string.class);
            startActivity(intent);
        }
    }
}