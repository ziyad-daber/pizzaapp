package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzarecipes.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        Thread splashScreenThread = new Thread(() -> {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {}

            startActivity(new Intent(SplashActivity.this, ListPizzaActivity.class));
            finish();
        });

        splashScreenThread.start();
    }
}