package com.example.zanespc.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class FightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        final String Fighter1 = extras.getString("1");
        final String Fighter2 = extras.getString("2");
        final String Fighter3 = extras.getString("3");

        final ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);

        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);


        CheckBox checkBox1 = findViewById(R.id.checkBox1);
        final CheckBox checkBox2 = findViewById(R.id.checkBox2);
        CheckBox checkBox3 = findViewById(R.id.checkBox3);
        final CheckBox checkBox4 = findViewById(R.id.checkBox4);


        TextView textViewLeft1 = findViewById(R.id.textViewLeft1);
        TextView textViewLeft2 = findViewById(R.id.textViewLeft2);
        TextView textViewLeft3 = findViewById(R.id.textViewLeft3);
        TextView textViewRight1 = findViewById(R.id.textViewRight1);
        TextView textViewRight2 = findViewById(R.id.textViewRight2);
        TextView textViewRight3 = findViewById(R.id.textViewRight3);

        Button attackBtn = findViewById(R.id.attackButton);



        textViewRight1.setText("Health: 100");
        textViewRight2.setText("Health: 180");
        textViewRight3.setText("Health: 90");


        int id1 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + Fighter1, null, null);
        imageView1.setImageResource(id1);

        int id2 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + Fighter2, null, null);
        imageView2.setImageResource(id2);

        int id3 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + Fighter3, null, null);
        imageView3.setImageResource(id3);


        if(Fighter1.equals("naruto")){
            textViewLeft1.setText("Health: 100");
            //checkBox1.setText("Shadow Replication");
            checkBox2.setText("Rasengan");
            //checkBox3.setText("Shadow Death Seal");
            checkBox4.setText("Chidori");
        }

        if(Fighter2.equals("captain_america")){
            textViewLeft2.setText("Health: 125");
        }

        if(Fighter3.equals("goku")){
            textViewLeft3.setText("Health: 110");
        }

        attackBtn.setOnClickListener(new View.OnClickListener() {
            int narutoHP = 100;
            int sasukeHP = 100;
            int zedHp = 90;
            int turn = 1;
            String move = "hi";
            int dmg = 0;


            TextView dialogue = findViewById(R.id.diaglogue);
            TextView textViewLeft1 = findViewById(R.id.textViewLeft1);
            TextView textViewLeft2 = findViewById(R.id.textViewLeft2);
            TextView textViewLeft3 = findViewById(R.id.textViewLeft3);
            TextView textViewRight1 = findViewById(R.id.textViewRight1);
            TextView textViewRight2 = findViewById(R.id.textViewRight2);
            TextView textViewRight3 = findViewById(R.id.textViewRight3);


            public void onClick(View v) {

                if(turn %2 == 1){
                    if(checkBox2.isChecked()){
                        checkBox2.toggle();
                        move = "Rasengen";
                        dmg = 25;
                    }
                    if(checkBox4.isChecked()){
                        checkBox4.toggle();
                        move = "Chidori";
                        dmg = 35;
                    }
                    dialogue.setText("Naruto used " + move + " on Sasuke for " + dmg + " damage");
                    sasukeHP = sasukeHP - dmg;
                    checkBox2.setText("Sharingan");
                    checkBox4.setText("Fire Bolt");
                    textViewRight1.setText("" + sasukeHP);
                }

                if(turn % 2 == 0){
                    if(checkBox2.isChecked()){
                        checkBox2.toggle();
                        move = "Sharingan";
                        dmg = 30;
                    }
                    if(checkBox4.isChecked()){
                        checkBox4.toggle();
                        move = "Fire bolt";
                        dmg = 25;
                    }
                    dialogue.setText("Sasuke used " + move + " on Naruto for " + dmg + " damage");
                    narutoHP = narutoHP - dmg;
                    checkBox2.setText("Rasengen");
                    checkBox4.setText("Chidori");
                    textViewLeft1.setText("" + narutoHP);
                }
                if(narutoHP < 1){
                    imageView1.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/deadnaruto", null, null));
                }
                turn++;
            }
        });



    }

}
