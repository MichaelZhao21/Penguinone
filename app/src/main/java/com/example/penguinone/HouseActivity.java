package com.example.penguinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HouseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);
    }

    public void next(View view) {
        Intent intent = null;
        if (view.getId() == R.id.bedroomButton) {
            intent = new Intent(this, BedroomActivity.class);
        }
        else if (view.getId() == R.id.kitchenButton) {
            intent = new Intent(this, KitchenActivity.class);
        }
        startActivity(intent);
    }
}