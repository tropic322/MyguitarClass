package com.example.myguitarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class choose_string extends AppCompatActivity {

    private Button button_choose_string_to_back;
    private Button button_1st_string;
    private Button button_2nd_string;
    private Button button_3rd_string;
    private Button button_4_string;
    private Button button_5_string;
    private Button button_6_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.choose_string);

        button_choose_string_to_back=findViewById(R.id.button11);//находим нужную кнопку по айди
        button_choose_string_to_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    openActivity_training_notes_or_strings();
                }
                catch (Exception e){
                }
            }
        });
        button_1st_string=findViewById(R.id.button);
        button_1st_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_game_with_4_answers();
            }
        });
        button_2nd_string=findViewById(R.id.button9);
        button_2nd_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_game_with_4_answers();
            }
        });
        button_3rd_string=findViewById(R.id.button6);
        button_3rd_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_game_with_4_answers();
            }
        });
        button_4_string=findViewById(R.id.button10);
        button_4_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_game_with_4_answers();
            }
        });
        button_5_string=findViewById(R.id.button7);
        button_5_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_game_with_4_answers();
            }
        });
        button_6_string=findViewById(R.id.button8);
        button_6_string.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_game_with_4_answers();
            }
        });
    }
    public void openActivity_game_with_4_answers(){
        Intent intent = new Intent(this, game_with_4_answers.class);
        training_notes_or_strings.param_intent=2;
        //intent.putExtra("back_param","2");//передаем параметр,чтобы потом правильно вернуться
        startActivity(intent);
    }
    public void openActivity_training_notes_or_strings(){
        Intent intent = new Intent(this, training_notes_or_strings.class);
        startActivity(intent);
    }
}