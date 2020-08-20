package com.example.penguinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        final TransitionActivity activityRef = this;

        // After 2000ms, go to the quiz activity screen
        new android.os.Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        Intent next = new Intent(activityRef, QuizActivity.class);
                        startActivity(next);
                    }
                }, 2000
        );
    }
}