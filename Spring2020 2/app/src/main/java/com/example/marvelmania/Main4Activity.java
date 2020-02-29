package com.example.marvelmania;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    String you;
    ImageView hero, villan;
    TextView textView1, textView2;
    boolean villanFly=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);

        hero = findViewById(R.id.imageView1);
        villan = findViewById(R.id.imageView2);


        Bundle extras = getIntent().getExtras();
        if(extras !=null) {
            you = extras.getString("you");
        }

        switch(you){
            case "thor": {
                hero.setImageResource(R.drawable.thor);
                villan.setImageResource(R.drawable.loki);
                break;
            }
            case "redskull": {
                hero.setImageResource(R.drawable.redskull);
                villan.setImageResource(R.drawable.captainamerica);
                break;
            }
            case "blackpanther": {
                hero.setImageResource(R.drawable.blackpanther);
                villan.setImageResource(R.drawable.erikkillmonger);
                break;
            }
            case "blackwidow": {
                hero.setImageResource(R.drawable.blackwidow);
                villan.setImageResource(R.drawable.taskmaster);
                break;
            }
            case "captainamerica": {
                hero.setImageResource(R.drawable.captainamerica);
                villan.setImageResource(R.drawable.redskull);
                break;
            }
            case "erikkillmonger": {
                hero.setImageResource(R.drawable.erikkillmonger);
                villan.setImageResource(R.drawable.blackpanther);
                break;
            }
            case "hulk": {
                hero.setImageResource(R.drawable.hulk);
                villan.setImageResource(R.drawable.ultron);
                break;
            }
            case "ironman": {
                hero.setImageResource(R.drawable.ironman);
                villan.setImageResource(R.drawable.thanos);
                break;
            }
            case "kingpen": {
                hero.setImageResource(R.drawable.kingpen);
                villan.setImageResource(R.drawable.spiderman);
                break;
            }
            case "loki": {
                hero.setImageResource(R.drawable.loki);
                villan.setImageResource(R.drawable.thor);
                break;
            }
            case "skrulls": {
                hero.setImageResource(R.drawable.skrulls);
                villan.setImageResource(R.drawable.captainmarvel);
                break;
            }
            case "spiderman": {
                hero.setImageResource(R.drawable.spiderman);
                villan.setImageResource(R.drawable.kingpen);
                break;
            }
            case "taskmaster": {
                hero.setImageResource(R.drawable.taskmaster);
                villan.setImageResource(R.drawable.blackwidow);
                break;
            }
            case "thanos": {
                hero.setImageResource(R.drawable.thanos);
                villan.setImageResource(R.drawable.ironman);
                break;
            }
            case "ultron": {
                hero.setImageResource(R.drawable.ultron);
                villan.setImageResource(R.drawable.hulk);
                break;
            }
            case "captainmarvel": {
                hero.setImageResource(R.drawable.captainmarvel);
                villan.setImageResource(R.drawable.skrulls);
                break;
            }
        }

        final RelativeLayout rlayout = (RelativeLayout) findViewById(R.id.mainLayout);
        rlayout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                hero.setY(hero.getY()-25);
                TranslateAnimation translateAnimation2;

                if (!villanFly) {
                    translateAnimation2 = new TranslateAnimation(0, 0, -100, -1220);
                    translateAnimation2.setDuration(8000);
                    translateAnimation2.setAnimationListener(new Animation.AnimationListener() {
                        @Override
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override
                        public void onAnimationEnd(Animation animation) {
                            villan.setVisibility(View.INVISIBLE);
                        }

                        @Override
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                    villan.startAnimation(translateAnimation2);
                    villanFly=true;
                }

                if (hero.getY()<=0){
                    hero.setVisibility(View.INVISIBLE);
                    villan.setVisibility(View.INVISIBLE);
                    textView1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    rlayout.setBackgroundColor(Color.BLACK);
                    rlayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            startActivity(new Intent(Main4Activity.this, MainActivity.class));
                        }
                    });
                }
               //System.out.println(villan.getY());
            }
        });
        //System.out.println("this is you: "+you);
    }
}
