package com.example.marvelmania;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{

    Button next;
    Spinner spinner1, spinner2, spinner3;
    TextView textview1, textview2, textview3;
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    ArrayList<String> list3 = new ArrayList<String>();
    ArrayList<String> list4 = new ArrayList<String>();
    ArrayList<String> list5 = new ArrayList<String>();
    ArrayList<String> list6 = new ArrayList<String>();
    ArrayList<String> list7 = new ArrayList<String>();
    ArrayList<String> list8 = new ArrayList<String>();
    ArrayList<String> list9 = new ArrayList<String>();
    ArrayList<String> list10 = new ArrayList<String>();
    ArrayList<String> list11 = new ArrayList<String>();
    ArrayList<String> list12 = new ArrayList<String>();
    ArrayList<String> answers = new ArrayList<String>();
    int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next = (Button) (findViewById(R.id.button1));
        next.setOnClickListener(Main2Activity.this);
        spinner1 = (Spinner) (findViewById(R.id.spinner1));
        spinner2 = (Spinner) (findViewById(R.id.spinner2));
        spinner3 = (Spinner) (findViewById(R.id.spinner3));

        textview1 = findViewById(R.id.textView1);
        textview2 = findViewById(R.id.textView2);
        textview3 = findViewById(R.id.textView3);

        list1.add("Agree");
        list1.add("Disagree");

        list2.add("Agree");
        list2.add("Disagree");

        list3.add("Agree");
        list3.add("Disagree");

        list4.add("Agree");
        list4.add("Disagree");

        list5.add("Agree");
        list5.add("Disagree");

        list6.add("Agree");
        list6.add("Disagree");

        list7.add("Agree");
        list7.add("Disagree");

        list8.add("Agree");
        list8.add("Disagree");

        list9.add("Agree");
        list9.add("Disagree");

        list10.add("Agree");
        list10.add("Disagree");

        list11.add("Agree");
        list11.add("Disagree");

        list12.add("Agree");
        list12.add("Disagree");

        for (int i=0;i<12;i++)
            answers.add("");

        textview1.setText("You enjoy vibrant social events with lots of people.");
        textview2.setText("You often rely on other people to start conversations.");
        textview3.setText("You can spend a weekend by yourself without getting bored.");

        if (page == 1) {

            next.setText("Next");

            ArrayAdapter<String> adapt1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list1);
            spinner1.setAdapter(adapt1);

            ArrayAdapter<String> adapt2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list2);
            spinner2.setAdapter(adapt2);

            ArrayAdapter<String> adapt3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list3);
            spinner3.setAdapter(adapt3);

            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(0,list1.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(1,list2.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(2,list3.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
    }

    @Override
    public void onClick(View v) {
        if (page==1)
            page=2;
        else if (page==2)
            page=3;
        else if (page==3)
            page=4;
        else if (page==4)
            page=5;

        if (page == 2) {

            next.setText("Next");

            textview1.setText("You enjoy creativity (dance, music, art, etc.) in your free time.");
            textview2.setText("You see yourself as more of a realist than a visionary.");
            textview3.setText("You often daydream about various scenarios.");

            ArrayAdapter<String> adapt4 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list4);
            spinner1.setAdapter(adapt4);

            ArrayAdapter<String> adapt5 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list5);
            spinner2.setAdapter(adapt5);

            ArrayAdapter<String> adapt6 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list6);
            spinner3.setAdapter(adapt6);

            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(3,list4.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(4,list5.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(5,list6.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
        if (page == 3) {

            next.setText("Next");

            textview1.setText("You listen to your heart over your head.");
            textview2.setText("You find it easy to sympathize with people you’ve never met.");
            textview3.setText("You would never let yourself cry in front of others.");

            ArrayAdapter<String> adapt7 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list7);
            spinner1.setAdapter(adapt7);

            ArrayAdapter<String> adapt8 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list8);
            spinner2.setAdapter(adapt8);

            ArrayAdapter<String> adapt9 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list9);
            spinner3.setAdapter(adapt9);

            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(6,list7.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(7,list8.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(8,list9.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }
        if (page == 4) {

            next.setText("Results");

            textview1.setText("If you make a mistake,you tend to start doubting your abilities.");
            textview2.setText("You very rarely feel insecure about yourself.");
            textview3.setText("You can stay calm under a lot of pressure.");

            ArrayAdapter<String> adapt10 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list10);
            spinner1.setAdapter(adapt10);

            ArrayAdapter<String> adapt11 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list11);
            spinner2.setAdapter(adapt11);

            ArrayAdapter<String> adapt12 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list12);
            spinner3.setAdapter(adapt12);

            spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(9,list10.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(10,list11.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });

            spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                    answers.set(11,list12.get(position));
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {

                }
            });
        }

        if (page == 5) {
            Intent myIntent = new Intent(Main2Activity.this, Main3Activity.class);
            myIntent.putExtra("answers", answers);
            startActivity(myIntent);
        }
        System.out.println(answers);
    }
}
