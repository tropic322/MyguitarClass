package com.example.myguitarclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
<<<<<<< HEAD
=======
import android.view.View;
>>>>>>> test_second
import android.widget.Button;

public class LessonThirteen extends Activity {

    private Button buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_thirteen);

<<<<<<< HEAD
=======
        buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                openActivity(LessonList.class);
            }
        });
>>>>>>> test_second

    }
    @Override
    protected void onStop() {
        super.onStop();
        finish();

    }
    public void openActivity(Class<?> cls) {

        Intent intent = new Intent(this, cls);
        startActivity(intent);
    }

}
