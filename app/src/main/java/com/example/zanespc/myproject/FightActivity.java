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
        final ImageView imageView2 = findViewById(R.id.imageView2);
        final ImageView imageView3 = findViewById(R.id.imageView3);

        final ImageView imageView4 = findViewById(R.id.imageView4);
        final ImageView imageView5 = findViewById(R.id.imageView5);
        final ImageView imageView6 = findViewById(R.id.imageView6);


        final CheckBox checkBox1 = findViewById(R.id.checkBox1);
        final CheckBox checkBox2 = findViewById(R.id.checkBox2);
        final CheckBox checkBox3 = findViewById(R.id.checkBox3);
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
            checkBox1.setText("Wind Style");
            checkBox2.setText("Rasengan");
            checkBox3.setText("High Kick");
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
            int captainAmericaHP = 125;
            int fourBearsHP = 180;
            int zedHP  = 90;
            int gokuHP = 110;
            int turn = 1;
            String fighterL = "Naruto"; String fighterR = "Sasuke";
            String moveL1 = "Wind Style"; String moveL2 = "Rasengan"; String moveL3 = "High Kick"; String moveL4 = "Chidori";
            String moveR1 = "Shuriken"; String moveR2 = "Sharingan"; String moveR3 = "Kirin"; String moveR4 = "Fire Style";
            int dmgL1 = 25; int dmgL2 = 30; int dmgL3 = 22; int dmgL4 = 35;
            int dmgR1 = 20; int dmgR2 = 35; int dmgR3 = 22; int dmgR4 = 25;
            String move = "";
            int dmg = 0;
            boolean nar = true;
            boolean sas = true;

            TextView dialogue = findViewById(R.id.diaglogue);
            TextView textViewLeft1 = findViewById(R.id.textViewLeft1);
            TextView textViewLeft2 = findViewById(R.id.textViewLeft2);
            TextView textViewLeft3 = findViewById(R.id.textViewLeft3);
            TextView textViewRight1 = findViewById(R.id.textViewRight1);
            TextView textViewRight2 = findViewById(R.id.textViewRight2);
            TextView textViewRight3 = findViewById(R.id.textViewRight3);


            public void onClick(View v) {

                if(turn %2 == 1){
                    if(checkBox1.isChecked()){
                        checkBox1.toggle();
                        move = moveL1;
                        dmg = dmgL1;
                    }
                    if(checkBox2.isChecked()){
                        checkBox2.toggle();
                        move = moveL2;
                        dmg = dmgL2;
                    }
                    if(checkBox3.isChecked()){
                        checkBox3.toggle();
                        move = moveL3;
                        dmg = dmgL3;
                    }
                    if(checkBox4.isChecked()){
                        checkBox4.toggle();
                        move = moveL4;
                        dmg = dmgL4;
                    }
                    checkBox1.setText(moveR1); checkBox2.setText(moveR2);
                    checkBox3.setText(moveR3); checkBox4.setText(moveR4);
                    dialogue.setText(fighterL + " used " + move + " on " + fighterR + " for " + dmg + " damage");

                    if(fighterR.equals("Sasuke")){
                        sasukeHP = sasukeHP - dmg;
                        textViewRight1.setText("Health: " + sasukeHP);
                    }

                    if(fighterR.equals("Four Bears")){
                         fourBearsHP = fourBearsHP - dmg;
                         textViewRight2.setText("Health: " + fourBearsHP);
                    }

                    if(fighterR.equals("Zed")){
                        zedHP = zedHP - dmg;
                        textViewRight3.setText("Health: " + zedHP);
                    }


                }

                if(turn % 2 == 0){
                    if(checkBox1.isChecked()){
                        checkBox1.toggle();
                        move = moveR1;
                        dmg = dmgR1;
                    }
                    if(checkBox2.isChecked()){
                        checkBox2.toggle();
                        move = moveR2;
                        dmg = dmgR2;
                    }
                    if(checkBox3.isChecked()){
                        checkBox3.toggle();
                        move = moveR3;
                        dmg = dmgR3;
                    }
                    if(checkBox4.isChecked()){
                        checkBox4.toggle();
                        move = moveR4;
                        dmg = dmgR4;
                    }
                    checkBox1.setText(moveL1); checkBox2.setText(moveL2);
                    checkBox3.setText(moveL3); checkBox4.setText(moveL4);
                    dialogue.setText(fighterR + " used " + move + " on " + fighterL + " for " + dmg + " damage");

                    if(fighterL.equals("Naruto")){
                        narutoHP = narutoHP - dmg;
                        textViewLeft1.setText("Health: " + narutoHP);
                    }

                    if(fighterL.equals("Captain America")){
                        captainAmericaHP = captainAmericaHP - dmg;
                        textViewLeft2.setText("Health: " + captainAmericaHP);
                    }

                    if(fighterL.equals("Goku")){
                        gokuHP = gokuHP - dmg;
                        textViewLeft3.setText("Health: " + gokuHP);
                    }

                }

                if(narutoHP < 1){
                    imageView1.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/deadnaruto", null, null));
                    textViewLeft1.setText("Dead!");
                        moveL1 = "Punch";
                        moveL2 = "Shield Toss";
                        moveL3 = "Drop Kick";
                        moveL4 = "Leg Sweep";
                        dmgL1 = 20;
                        dmgL2 = 24;
                        dmgL3 = 40;
                        dmgL4 = 10;
                        fighterL = "Captain America";
                        checkBox1.setText(moveL1);
                        checkBox2.setText(moveL2);
                        checkBox3.setText(moveL3);
                        checkBox4.setText(moveL4);
                        narutoHP = 1;
                }


                if(sasukeHP < 1){
                    imageView4.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/deadsasuke", null, null));
                    textViewRight1.setText("Dead!");
                        moveR1 = "Bite";
                        moveR2 = "Maul";
                        moveR3 = "Claw";
                        moveR4 = "Stomp";
                        dmgR1 = 14;
                        dmgR2 = 24;
                        dmgR3 = 18;
                        dmgR4 = 10;
                        fighterR = "Four Bears";
                        checkBox1.setText(moveR1);
                        checkBox2.setText(moveR2);
                        checkBox3.setText(moveR3);
                        checkBox4.setText(moveR4);
                        sasukeHP = 1;
                }



                if(captainAmericaHP < 1){
                    imageView2.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/deadcaptainamerica", null, null));
                    textViewLeft2.setText("Dead!");
                    moveL1 = "Arrow Knee";
                    moveL2 = "Kamehameha";
                    moveL3 = "Kaio-ken";
                    moveL4 = "Slashdown Kick";
                    dmgL1 = 24;
                    dmgL2 = 40;
                    dmgL3 = 21;
                    dmgL4 = 14;
                    fighterL = "Goku";
                    checkBox1.setText(moveL1);
                    checkBox2.setText(moveL2);
                    checkBox3.setText(moveL3);
                    checkBox4.setText(moveL4);
                    captainAmericaHP = 1;
                }


                if(fourBearsHP < 1){
                    imageView5.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/deadfourbears", null, null));
                    textViewRight2.setText("Dead!");
                    moveR1 = "Razor Shuriken";
                    moveR2 = "Living Shadow";
                    moveR3 = "Shadow Slash";
                    moveR4 = "Death Mark";
                    dmgR1 = 28;
                    dmgR2 = 14;
                    dmgR3 = 18;
                    dmgR4 = 45;
                    fighterR = "Zed";
                    checkBox1.setText(moveR1);
                    checkBox2.setText(moveR2);
                    checkBox3.setText(moveR3);
                    checkBox4.setText(moveR4);
                    fourBearsHP = 1;
                }


                if(zedHP < 1){
                    imageView6.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/deadzed", null, null));
                    textViewRight3.setText("Dead!");
                    dialogue.setText("Player One Wins!!");
                    fourBearsHP = 1;
                }
                turn++;
            }
        });



    }

}
