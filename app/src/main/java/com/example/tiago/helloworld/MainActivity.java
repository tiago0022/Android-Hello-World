package com.example.tiago.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public ImageView imgIcon;
    public ImageView imgColor;
    public ImageView imgPink;
    public ImageView imgGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgIcon = (ImageView) findViewById(R.id.imgIcon);
        imgColor = (ImageView) findViewById(R.id.imgColor);
        imgPink = (ImageView) findViewById(R.id.imgPink);
        imgGreen = (ImageView) findViewById(R.id.imgGreen);

        imgIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IconActivity.class);
                startActivity(intent);
            }
        });

        imgIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(intent);
            }
        });

        imgIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PinkActivity.class);
                startActivity(intent);
            }
        });

        imgIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GreenActivity.class);
                startActivity(intent);
            }
        });
    }

    public MainActivity() {
        super();
    }



    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "You started the app", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "You restarted the app", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "You resumed the app", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "You paused the app", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "You stopped the app", Toast.LENGTH_LONG).show();
    }
}
