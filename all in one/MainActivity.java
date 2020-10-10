package com.example.allinoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;

public class MainActivity extends AppCompatActivity {
    Button bn;
    Spinner sr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn = findViewById(R.id.b);
        sr = findViewById(R.id.s);

        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                int p = sr.getSelectedItemPosition();

                if (p == 0) {
                    Toast.makeText(MainActivity.this, "select any app", Toast.LENGTH_LONG).show();
                }
                if (p == 1) {
                    try {
                        i = getPackageManager().getLaunchIntentForPackage("com.jio.join");
                        startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }

                }
                if (p == 2) {
                    try {
                        i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                        startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }

                }
                if (p == 3) {
                    try {

                        i = getPackageManager().getLaunchIntentForPackage("com.imo.android.imoim");
                        startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }
                }
                if (p == 4) {
                    try {

                        i = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                        startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }
                }
                if (p == 5) {
                    try {

                    i = getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                    startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }
                }
                if (p == 6) {
                    try {

                    i = getPackageManager().getLaunchIntentForPackage("us.zoom.videomeetings");
                    startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }
                }
                if (p == 7) {
                    try {

                    i = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.classroom");
                    startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }
                }
                if (p == 8) {
                    try {

                    i = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.meetings");
                    startActivity(i);
                    } catch (Exception e) {
                        Toast.makeText(MainActivity.this, "App not found", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });
    }
}






