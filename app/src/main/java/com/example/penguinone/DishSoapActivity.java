package com.example.penguinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DishSoapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dish_soap);
    }

    public void switchText(View view) {
        TextView words = findViewById(R.id.soapText);
        if (words.getText().toString().equals(getResources().getString(R.string.soap1))) {
            words.setText(R.string.soap2);
        }
        else {
            words.setText(R.string.soap1);
        }
    }

    public void soapAlt(View view) {
        Intent openPage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.amazon.com/ECOS-Dishmate-Dish-Liquid-Clear/dp/B004YIXB3C?ots=1&tag=epicurious09-20&linkCode=w50"));
        startActivity(openPage);
    }
}