package com.example.marvelmania;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton=(Button) findViewById(R.id.button2);
        startButton.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button2){
            startActivity(new Intent(MainActivity.this, Main2Activity.class));
        }
    }
}




