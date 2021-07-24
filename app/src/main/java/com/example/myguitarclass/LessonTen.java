package com.example.myguitarclass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LessonTen extends Activity {

    private Button buttonBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson_ten);


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
