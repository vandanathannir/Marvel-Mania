package com.example.marvelmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    ArrayList<String> list = new ArrayList<String>();
    Button play;
    Button restart;
    String result;
    String mod;
    TextView text;
    TextView text2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<String> answers = (ArrayList<String>) getIntent().getSerializableExtra("answers");
        System.out.println("This is my transferred list: "+answers);

        play=findViewById(R.id.buttonP);
        play.setOnClickListener(Main3Activity.this);

        restart=findViewById(R.id.buttonR);
        restart.setOnClickListener(Main3Activity.this);

        result=SuperheroCharacter(answers);
        mod=result.toLowerCase();
        mod=mod.replace(" ","");

        System.out.println(mod);
        System.out.println();

        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.skrulls);

        switch(mod){
            case "thor":
                imageView.setImageResource(R.drawable.thor);
                break;
            case "redskull":
                imageView.setImageResource(R.drawable.redskull);
                break;
            case "blackpanther":
                imageView.setImageResource(R.drawable.blackpanther);
                break;
            case "blackwidow":
                imageView.setImageResource(R.drawable.blackwidow);
                break;
            case "captainamerica":
                imageView.setImageResource(R.drawable.captainamerica);
                break;
            case "erikkillmonger":
                imageView.setImageResource(R.drawable.erikkillmonger);
                break;
            case "hulk":
                imageView.setImageResource(R.drawable.hulk);
                break;
            case "ironman":
                imageView.setImageResource(R.drawable.ironman);
                break;
            case "kingpen":
                imageView.setImageResource(R.drawable.kingpen);
                break;
            case "loki":
                imageView.setImageResource(R.drawable.loki);
                break;
            case "skrulls":
                imageView.setImageResource(R.drawable.skrulls);
                break;
            case "spiderman":
                imageView.setImageResource(R.drawable.spiderman);
                break;
            case "taskmaster":
                imageView.setImageResource(R.drawable.taskmaster);
                break;
            case "thanos":
                imageView.setImageResource(R.drawable.thanos);
                break;
            case "ultron":
                imageView.setImageResource(R.drawable.ultron);
                break;
            case "captainmarvel":
                imageView.setImageResource(R.drawable.captainmarvel);
                break;
        }

        //System.out.println("Your character is: "+result);

        text=findViewById(R.id.textView);
        text2=findViewById(R.id.textView4);
        text.setText("YOU ARE");
        text2.setText(result+"!");
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.buttonR){
            startActivity(new Intent(Main3Activity.this, MainActivity.class));
        }

        if (v.getId()==R.id.buttonP){ //play game new activity code here
            Intent myIntent=new Intent(Main3Activity.this, Main4Activity.class);
            myIntent.putExtra("you",mod);
            startActivity(myIntent);
        }
    }

    public static String SuperheroCharacter (ArrayList<String> list){

        ArrayList<String> ie=new ArrayList<String>();
        int i=0; //represents introvert
        int e=0; //represents extrovert
        if(list.get(0).equals("Agree")){ //social events are enjoyed
            e++;
        }
        else{
            i++; //if one does not like social events.
        }
        if(list.get(1).equals("Agree")){ //you cant start conversation
            i++;
        }
        else{
            e++; //if one does not like social events.
        }
        if(list.get(2).equals("Agree")){ //spend a weekend alone
            i++;
        }
        else{
            e++; //if one does not like social events.
        }

        if(e>i){
            ie.add("e");
        }

        else{
            ie.add("i");
        }

        int s=0; //represents practical
        int n=0; //represents imaginative
        if(list.get(3).equals("Agree")){ //social events are enjoyed
            n++;
        }
        else{
            s++; //if one does not like social events.
        }
        if(list.get(4).equals("Agree")){ //you cant start conversation
            s++;
        }
        else{
            n++; //if one does not like social events.
        }
        if(list.get(5).equals("Agree")){ //spend a weekend alone
            n++;
        }
        else{
            s++; //if one does not like social events.
        }

        if(n>s){
            ie.add("n");
        }

        else{
            ie.add("s");
        }
        int f=0; //represents practical
        int l=0; //represents imaginative
        if(list.get(6).equals("Agree")){ //social events are enjoyed
            f++;
        }
        else{
            l++; //if one does not like social events.
        }
        if(list.get(7).equals("Agree")){ //you cant start conversation
            f++;
        }
        else{
            l++; //if one does not like social events.
        }
        if(list.get(8).equals("Agree")){ //spend a weekend alone
            l++;
        }
        else{
            f++; //if one does not like social events.
        }

        if(f>l){
            ie.add("f");
        }

        else{
            ie.add("l");
        }
        int t=0; //represents practical
        int a=0; //represents imaginative
        if(list.get(9).equals("Agree")){ //social events are enjoyed
            t++;
        }
        else{
            a++; //if one does not like social events.
        }
        if(list.get(10).equals("Agree")){ //you cant start conversation
            a++;
        }
        else{
            t++; //if one does not like social events.
        }
        if(list.get(11).equals("Agree")){ //spend a weekend alone
            a++;
        }
        else{
            t++; //if one does not like social events.
        }

        if(t>a){
            ie.add("t");
        }

        else{
            ie.add("a");
        }
        String finalSuperhero = "";
        for(int j=0; j<4;j++){
            finalSuperhero+= ie.get(j);
        }
        String hero= "";
        String Thor = "Thor";
        String Spider = "Spider Man";
        String Iron = "Iron Man";
        String Captain = "Captain America";
        String balckp = "Black Panther";
        String Hulk = "Hulk";
        String blackw = "Black Widow";
        String captM = "Captain Marvel";
        String loki ="Loki";
        String King = "Kingpen";
        String Thanos = "Thanos";
        String Red = "Red Skull";
        String er ="Erik Killmonger";
        String ul = "Ultron";
        String ts ="Taskmaster";
        String sk = "Skrulls";

        if (finalSuperhero.equals("enfa"))
        {
            hero = Thor;
        }else if(finalSuperhero.equals("enft")){
            hero =Spider;
        }else if(finalSuperhero .equals( "enlt")){
            hero =Iron;
        }else if(finalSuperhero .equals("isfa")){
            hero =Captain;
        }else if(finalSuperhero.equals( "isla")){
            hero =balckp;
        }else if(finalSuperhero .equals("inft")){
            hero =Hulk;
        }else if(finalSuperhero.equals("inla")){
            hero =blackw;
        }else if(finalSuperhero.equals("esfa")){
            hero =captM;
        }else if(finalSuperhero .equals( "islt")){
            hero =  loki;
        }else if(finalSuperhero .equals("esla")){
            hero =  King;
        }else if(finalSuperhero.equals("enla")){
            hero =  Thanos;
        }else if(finalSuperhero.equals( "infa")){
            hero = Red ;
        }else if(finalSuperhero.equals("isft")){
            hero = er;
        }else if(finalSuperhero.equals("inlt")){
            hero = ul;
        }
        else if(finalSuperhero.equals ("esft")){
            hero = ts;
        }
        else if(finalSuperhero.equals("eslt")){
            hero = sk;
        }
        return hero;
    }
}
