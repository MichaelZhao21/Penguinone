package com.example.penguinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class QuizAfterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_after);

        Bundle extras = getIntent().getExtras();

        if (extras == null) return;

        int score = extras.getInt("score");

        TextView scoreElement = findViewById(R.id.score);
        scoreElement.setText(String.format(Locale.US, "%d%%", score));

        TextView comment = findViewById(R.id.quizComment);
        if (score >= 80) {
            comment.setText(R.string.quiz80);
        }
        else if (score >= 50) {
            comment.setText(R.string.quiz50);
        }
        else {
            comment.setText(R.string.quiz0);
        }
    }

    public void home(View view) {
        Intent i = new Intent(this, TitleActivity.class);
        startActivity(i);
    }
}