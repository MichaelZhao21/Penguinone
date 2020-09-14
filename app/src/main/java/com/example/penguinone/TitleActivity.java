package com.example.penguinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    public void next(View view) {
        Intent intent;
        if (view.getId() == R.id.houseButton)
            intent = new Intent(this, HouseActivity.class);
        else
            intent = new Intent(this, TransitionActivity.class);
        startActivity(intent);
    }
}