package com.example.penguinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DeodorantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deodorant);
    }

    public void switchText(View view) {
        TextView words = findViewById(R.id.deoText);
        if (words.getText().toString().equals(getResources().getString(R.string.deodorant1))) {
            words.setText(R.string.deodorant2);
        }
        else {
            words.setText(R.string.deodorant1);
        }
    }

    public void deoAlt(View view) {
        Intent openPage = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nativecos.com/products/coconut-vanilla-deo-womens?gclid=CjwKCAjwz6_8BRBkEiwA3p02Vcz99NqE1Hym_Ivvno-yMjuETOEiSIT_SKyg2pQRgWHcEFeTWmZ7fhoC1QUQAvD_BwE"));
        startActivity(openPage);
    }
}