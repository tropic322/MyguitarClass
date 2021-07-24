package com.example.myguitarclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.view.MenuItem;

import java.io.IOException;


public class guitar_tuning extends AppCompatActivity {

    private Button button_to_main;
    private Button button_title;
    private Button button_string_one;
    private Button button_string_two;
    private Button button_string_three;
    private Button button_string_four;
    private Button button_string_five;
    private Button button_string_six;
    private Button choose_tuning;

    private MediaPlayer title_sound;
    private MediaPlayer one_sound;
    private MediaPlayer two_sound;
    private MediaPlayer three_sound;
    private MediaPlayer four_sound;
    private MediaPlayer five_sound;
    private MediaPlayer six_sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guitar_tuning);

        title_sound = MediaPlayer.create(this,R.raw.tuning_e_major);
        one_sound = MediaPlayer.create(this,R.raw.string1_0);
        two_sound = MediaPlayer.create(this,R.raw.string2_0);
        three_sound = MediaPlayer.create(this,R.raw.string3_0);
        four_sound = MediaPlayer.create(this, R.raw.string4_0);
        five_sound = MediaPlayer.create(this,R.raw.string5_0);
        six_sound = MediaPlayer.create(this,R.raw.string6_0);

        button_title=findViewById(R.id.button3);
        button_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(title_sound);
            }
        });
        button_to_main=findViewById(R.id.button21);
        button_to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_MainActivity();
            }
        });

        button_string_one=findViewById(R.id.button29);
        button_string_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(one_sound);
            }
        });

        button_string_two=findViewById(R.id.button32);
        button_string_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(two_sound);
            }
        });

        button_string_three=findViewById(R.id.button31);
        button_string_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(three_sound);
            }
        });

        button_string_four=findViewById(R.id.button30);
        button_string_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(four_sound);
            }
        });

        button_string_five=findViewById(R.id.button27);
        button_string_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(five_sound);
            }
        });

        button_string_six=findViewById(R.id.button33);
        button_string_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(six_sound);
            }

        });

        choose_tuning =findViewById((R.id.button34)); //начала попупа
        choose_tuning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(guitar_tuning.this, choose_tuning);//привязываем попуп к активностии и кнопке
                popup.getMenuInflater()//???
                        .inflate(R.menu.popup_menu, popup.getMenu());//???

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                switch (item.getItemId()) {

                                    case R.id.E_major:
                                        button_title.setText("E major");
                                        button_string_six.setText("E");
                                        button_string_one.setText("e");
                                        button_string_two.setText("B");
                                        button_string_three.setText("G");
                                        button_string_four.setText("D");
                                        button_string_five.setText("A");
                                        button_string_six.setText("E");

                                        try {
                                            title_sound.setDataSource(String.valueOf(R.raw.tuning_e_major));
                                            one_sound.setDataSource(String.valueOf(R.raw.string1_0));
                                            two_sound.setDataSource(String.valueOf(R.raw.string2_0));
                                            three_sound.setDataSource(String.valueOf(R.raw.string3_0));
                                            four_sound.setDataSource(String.valueOf(R.raw.string4_0));
                                            five_sound.setDataSource(String.valueOf(R.raw.string5_0));
                                            six_sound.setDataSource(String.valueOf(R.raw.string6_0));
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }

                                        return true;
                                    case R.id.Drop_D:
                                        button_title.setText("Drop D");
                                        button_string_one.setText("e");
                                        button_string_two.setText("B");
                                        button_string_three.setText("G");
                                        button_string_four.setText("D");
                                        button_string_five.setText("A");
                                        button_string_six.setText("D");

                                        //тут может быть ваша реклама
                                        try {
                                            title_sound.setDataSource(String.valueOf(R.raw.tuning_drop_d));

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        return true;
                                    case R.id.Drop_C:
                                        button_title.setText("Drop C");
                                        button_string_one.setText("D");
                                        button_string_two.setText("A");
                                        button_string_three.setText("F");
                                        button_string_four.setText("C");
                                        button_string_five.setText("G");
                                        button_string_six.setText("C");

                                        //тут может быть ваша реклама
                                        try {
                                            title_sound.setDataSource(String.valueOf(R.raw.tuning_drop_c));

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        return true;
                                    case R.id.DADGAD:
                                        button_title.setText("DADGAD");
                                        button_string_one.setText("D");
                                        button_string_two.setText("A");
                                        button_string_three.setText("G");
                                        button_string_four.setText("D");
                                        button_string_five.setText("A");
                                        button_string_six.setText("D");
                                        //тут может быть ваша реклама

                                        try {
                                            six_sound.setDataSource(String.valueOf(R.raw.tuning_e_major));

                                            title_sound.setDataSource(String.valueOf(R.raw.tuning_dadgad));

                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        return true;
                                    default:
                                        return false;
                                }
                            }
                        });
                popup.show(); ///???


            }

        });


    }
    public void openActivity_MainActivity(){
        Intent intent = new Intent(this,MainActivity.class); //кнопка назад, открыть пред. активность
        startActivity(intent);
    }

    public void soundPlay(MediaPlayer sound){// функция для воспроизведения аудио
        sound.seekTo(0); //для проигрыша трека с начала
        sound.start();
    }


}