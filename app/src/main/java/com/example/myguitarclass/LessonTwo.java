package com.example.myguitarclass;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.example.myguitarclass.Sound.soundPlay;

public class LessonTwo extends Activity {

    private Button buttonBack;
    private Button boiOne;
    private Button boiWithChords;
    private Button em;
    private Button d;


    private MediaPlayer boiNumberOne;
    private MediaPlayer boiNumberOneWithChords;
    private MediaPlayer chordEm;
    private MediaPlayer chordD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_two);


        buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                openActivity(LessonList.class);
            }
        });

        boiNumberOne = MediaPlayer.create(this,R.raw.boi_one);
        boiNumberOneWithChords = MediaPlayer.create(this,R.raw.boi_one_with_chords);
        chordEm = MediaPlayer.create(this,R.raw.chord_em);
        chordD = MediaPlayer.create(this,R.raw.chord_d);


        boiOne = findViewById(R.id.buttonBoiOne);
        boiOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(boiNumberOne);
            }
        });
        boiWithChords = findViewById(R.id.buttonBoiOneWithChords);
        boiWithChords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(boiNumberOneWithChords);
            }
        });
        em = findViewById(R.id.buttonEm);
        em.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(chordEm);
            }
        });
        d = findViewById(R.id.buttonD);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlay(chordD);
            }
        });

    }

    public void openActivity(Class<?> cls) {

        Intent a = new Intent(this, cls);
        a.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(a);
    }

}