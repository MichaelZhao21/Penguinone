package com.example.penguinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void submit(View view) {
        int checked = 0;
        for (int i = 1; i <= 20; i++) {
            int id = getResources().getIdentifier("checkBox" + i, "id", getPackageName());
            CheckBox box = findViewById(id);
            if (box.isChecked()) checked++;
        }

        int score = 100 - checked * 5;
        Intent i = new Intent(this, QuizAfterActivity.class);
        i.putExtra("score", score);
        startActivity(i);
    }
}