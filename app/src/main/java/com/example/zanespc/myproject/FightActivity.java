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

    String[] p1c1Attacks = {""};
    String[] p2c1Attacks = {""};
    int[] p1c1Dmgs = {0};
    int[] p2c1Dmgs = {0};
    String[] p1c2Attacks = {""};
    String[] p2c2Attacks = {""};
    int[] p1c2Dmgs = {0};
    int[] p2c2Dmgs = {0};
    String[] p1c3Attacks = {""};
    String[] p2c3Attacks = {""};
    int[] p1c3Dmgs = {0};
    int[] p2c3Dmgs = {0};

    String[] p1Attacks = {""};
    String[] p2Attacks = {""};
    int[] p1Dmgs = {0};
    int[] p2Dmgs = {0};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        final String p1Fighter1 = extras.getString("pOne1");
        final String p1Fighter2 = extras.getString("pOne2");
        final String p1Fighter3 = extras.getString("pOne3");
        final String p2Fighter1 = extras.getString("pTwo1");
        final String p2Fighter2 = extras.getString("pTwo2");
        final String p2Fighter3 = extras.getString("pTwo3");


        final String[] narutoStrings = {"Naruto", "Wind Style", "Rasengan", "High Kick", "Chidori"};
        final String[] sasukeStrings = {"Sasuke", "Shuriken", "Sharingan", "Kirin", "Fire Style"};
        final String[] captainAmericaStrings = {"Captain America", "Punch", "Shield Toss", "Drop Kick", "Leg Sweep"};
        final String[] gokuStrings = {"Goku", "Arrow Knee", "Kamehameha", "Kaio-ken", "Slashdown Kick"};
        final String[] zedStrings = {"Zed", "Razor Shuriken", "Living Shadow", "Shadow Slash", "Death Mark"};
        final String[] mewtwoStrings = {"Mewtwo", "Psywave", "Laser Focus", "Amnesia", "Psych Up"};
        final String[] fourBearStrings = {"Four Bears", "Bite", "Maul", "Claw", "Stomp"};
        final String[] thanosStrings = {"Thanos", "Flick", "Gauntlet Punch", "Laser", "Barrel Roll"};
        final String[] bobbyStrings = {"Bobby Shmurda", "Yeet", "Shmuddy Dance", "Gratata", "Diss Track"};

        final int [] narutoCounters = {100, 25, 30, 22, 35};
        final int [] sasukeCounters = {100, 20, 35, 22, 25};
        final int [] captainAmericaCounters = {125, 20, 24, 40, 10};
        final int [] gokuCounters = {110, 24, 40, 21, 14};
        final int [] zedCounters = {90, 28, 14, 18, 45};
        final int [] mewtwoCounters = {140, 20, 24, 40, 10};
        final int [] fourBearCounters = {180, 14, 24, 18, 10};
        final int [] thanosCounters = {175, 15, 22, 17, 25};
        final int [] bobbyCounters = {55, 50, 42, 25, 35};

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


        int id1 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + p1Fighter1, null, null);
        imageView1.setImageResource(id1);
        int id2 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + p1Fighter2, null, null);
        imageView2.setImageResource(id2);
        int id3 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + p1Fighter3, null, null);
        imageView3.setImageResource(id3);
        int id4 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + p2Fighter1, null, null);
        imageView4.setImageResource(id4);
        int id5 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + p2Fighter2, null, null);
        imageView5.setImageResource(id5);
        int id6 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + p2Fighter3, null, null);
        imageView6.setImageResource(id6);


        switch (p1Fighter1){
            case "naruto": p1c1Attacks = narutoStrings; p1c1Dmgs = narutoCounters; break;
            case "sasuke": p1c1Attacks = sasukeStrings; p1c1Dmgs = sasukeCounters; break;
            case "captain_america": p1c1Attacks = captainAmericaStrings; p1c1Dmgs = captainAmericaCounters; break;
            case "goku": p1c1Attacks = gokuStrings; p1c1Dmgs = gokuCounters; break;
            case "zed": p1c1Attacks = zedStrings; p1c1Dmgs = zedCounters; break;
            case "mewtwo": p1c1Attacks = mewtwoStrings; p1c1Dmgs = mewtwoCounters; break;
            case "four_bears": p1c1Attacks = fourBearStrings; p1c1Dmgs = fourBearCounters; break;
            case "thanos": p1c1Attacks = thanosStrings; p1c1Dmgs = thanosCounters; break;
            case "bobby_shmurda": p1c1Attacks = bobbyStrings; p1c1Dmgs = bobbyCounters; break;
        }
        switch (p1Fighter2){
            case "naruto": p1c2Attacks = narutoStrings; p1c2Dmgs = narutoCounters; break;
            case "sasuke": p1c2Attacks = sasukeStrings; p1c2Dmgs = sasukeCounters; break;
            case "captain_america": p1c2Attacks = captainAmericaStrings; p1c2Dmgs = captainAmericaCounters; break;
            case "goku": p1c2Attacks = gokuStrings; p1c2Dmgs = narutoCounters; break;
            case "zed": p1c2Attacks = zedStrings; p1c2Dmgs = zedCounters; break;
            case "mewtwo": p1c2Attacks = mewtwoStrings; p1c2Dmgs = mewtwoCounters; break;
            case "four_bears": p1c2Attacks = fourBearStrings; p1c2Dmgs = fourBearCounters; break;
            case "thanos": p1c2Attacks = thanosStrings; p1c2Dmgs = thanosCounters; break;
            case "bobby_shmurda": p1c2Attacks = bobbyStrings; p1c2Dmgs = bobbyCounters; break;
        }
        switch (p1Fighter3){
            case "naruto": p1c3Attacks = narutoStrings; p1c3Dmgs = narutoCounters; break;
            case "sasuke": p1c3Attacks = sasukeStrings; p1c3Dmgs = sasukeCounters; break;
            case "captain_america": p1c3Attacks = captainAmericaStrings; p1c3Dmgs = captainAmericaCounters; break;
            case "goku": p1c3Attacks = gokuStrings; p1c3Dmgs = gokuCounters; break;
            case "zed": p1c3Attacks = zedStrings; p1c3Dmgs = zedCounters; break;
            case "mewtwo": p1c3Attacks = mewtwoStrings; p1c3Dmgs = mewtwoCounters; break;
            case "four_bears": p1c3Attacks = fourBearStrings; p1c3Dmgs = fourBearCounters; break;
            case "thanos": p1c3Attacks = thanosStrings; p1c3Dmgs = thanosCounters; break;
            case "bobby_shmurda": p1c3Attacks = bobbyStrings; p1c3Dmgs = bobbyCounters; break;
        }
        switch (p2Fighter1){
            case "naruto": p2c1Attacks = narutoStrings; p2c1Dmgs = narutoCounters; break;
            case "sasuke": p2c1Attacks = sasukeStrings; p2c1Dmgs = sasukeCounters; break;
            case "captain_america": p2c1Attacks = captainAmericaStrings; p2c1Dmgs = captainAmericaCounters; break;
            case "goku": p2c1Attacks = gokuStrings; p2c1Dmgs = gokuCounters; break;
            case "zed": p2c1Attacks = zedStrings; p2c1Dmgs = zedCounters; break;
            case "mewtwo": p2c1Attacks = mewtwoStrings; p2c1Dmgs = mewtwoCounters; break;
            case "four_bears": p2c1Attacks = fourBearStrings; p2c1Dmgs = fourBearCounters; break;
            case "thanos": p2c1Attacks = thanosStrings; p2c1Dmgs = thanosCounters; break;
            case "bobby_shmurda": p2c1Attacks = bobbyStrings; p2c1Dmgs = bobbyCounters; break;
        }
        switch (p2Fighter2){
            case "naruto": p2c2Attacks = narutoStrings; p2c2Dmgs = narutoCounters; break;
            case "sasuke": p2c2Attacks = sasukeStrings; p2c2Dmgs = sasukeCounters; break;
            case "captain_america": p2c2Attacks = captainAmericaStrings; p2c2Dmgs = captainAmericaCounters; break;
            case "goku": p2c2Attacks = gokuStrings; p2c2Dmgs = gokuCounters; break;
            case "zed": p2c2Attacks = zedStrings; p2c2Dmgs = zedCounters; break;
            case "mewtwo": p2c2Attacks = mewtwoStrings; p2c2Dmgs = mewtwoCounters; break;
            case "four_bears": p2c2Attacks = fourBearStrings; p2c2Dmgs = fourBearCounters; break;
            case "thanos": p2c2Attacks = thanosStrings; p2c2Dmgs = thanosCounters; break;
            case "bobby_shmurda": p2c2Attacks = bobbyStrings; p2c2Dmgs = bobbyCounters; break;
        }
        switch (p2Fighter3){
            case "naruto": p2c3Attacks = narutoStrings; p2c3Dmgs = narutoCounters; break;
            case "sasuke": p2c3Attacks = sasukeStrings; p2c3Dmgs = sasukeCounters; break;
            case "captain_america": p2c3Attacks = captainAmericaStrings; p2c3Dmgs = captainAmericaCounters; break;
            case "goku": p2c3Attacks = gokuStrings; p2c3Dmgs = gokuCounters; break;
            case "zed": p2c3Attacks = zedStrings; p2c3Dmgs = zedCounters; break;
            case "mewtwo": p2c3Attacks = mewtwoStrings; p2c3Dmgs = mewtwoCounters; break;
            case "four_bears": p2c3Attacks = fourBearStrings; p2c3Dmgs = fourBearCounters; break;
            case "thanos": p2c3Attacks = thanosStrings; p2c3Dmgs = thanosCounters; break;
            case "bobby_shmurda": p2c3Attacks = bobbyStrings; p2c3Dmgs = bobbyCounters; break;
        }

        textViewLeft1.setText("Health: " + p1c1Dmgs[0]);
        textViewLeft2.setText("Health: " + p1c2Dmgs[0]);
        textViewLeft3.setText("Health: " + p1c3Dmgs[0]);
        textViewRight1.setText("Health: " + p2c1Dmgs[0]);
        textViewRight2.setText("Health: " + p2c2Dmgs[0]);
        textViewRight3.setText("Health: " + p2c3Dmgs[0]);

        p1Attacks = p1c1Attacks;
        p1Dmgs = p1c1Dmgs;
        p2Attacks = p2c1Attacks;
        p2Dmgs = p2c1Dmgs;
        String initMove1 = p1Attacks[1].toString();
        String initMove2 = p1Attacks[2].toString();
        String initMove3 = p1Attacks[3].toString();
        String initMove4 = p1Attacks[4].toString();

        checkBox1.setText(initMove1); checkBox2.setText(initMove2);
        checkBox3.setText(initMove3); checkBox4.setText(initMove4);

        attackBtn.setOnClickListener(new View.OnClickListener() {
            TextView textViewLeft1 = findViewById(R.id.textViewLeft1);
            TextView textViewLeft2 = findViewById(R.id.textViewLeft2);
            TextView textViewLeft3 = findViewById(R.id.textViewLeft3);
            TextView textViewRight1 = findViewById(R.id.textViewRight1);
            TextView textViewRight2 = findViewById(R.id.textViewRight2);
            TextView textViewRight3 = findViewById(R.id.textViewRight3);


            int p1fighterHP = p1c1Dmgs[0];
            int p2fighterHP = p2c1Dmgs[0];
            int p1 = 0;
            int p2 = 0;
            int turn = 1;
            String fighterL = p1c1Attacks[0]; String fighterR = p2c1Attacks[0];
            String move = "";
            int dmg = 0;
            TextView dialogue = findViewById(R.id.diaglogue);

            public void onClick(View v) {
                dialogue.setText(p1Attacks[1].toString());

                if(turn %2 == 1){
                    int p1NumMoves = 0;
                    if(checkBox1.isChecked()){
                        checkBox1.toggle();
                        move = p1Attacks[1].toString();
                        dmg = p1Dmgs[1];
                        p1NumMoves++;
                    }
                    if(checkBox2.isChecked()){
                        checkBox2.toggle();
                        move = p1Attacks[2].toString();
                        dmg = p1Dmgs[2];
                        p1NumMoves++;
                    }
                    if(checkBox3.isChecked()){
                        checkBox3.toggle();
                        move = p1Attacks[3].toString();
                        dmg = p1Dmgs[3];
                        p1NumMoves++;
                    }
                    if(checkBox4.isChecked()){
                        checkBox4.toggle();
                        move = p1Attacks[4].toString();
                        dmg = p1Dmgs[4];
                        p1NumMoves++;
                    }
                    if(p1NumMoves != 1){
                        dmg = 0;
                        move = "";
                    }
                    checkBox1.setText(p2Attacks[1].toString()); checkBox2.setText(p2Attacks[2].toString());
                    checkBox3.setText(p2Attacks[3].toString()); checkBox4.setText(p2Attacks[4].toString());
                    if(dmg > 0){
                        dialogue.setText(fighterL + " used " + move + " on " + fighterR + " for " + dmg + " damage");
                    }else dialogue.setText("Please select one move!");

                    p2fighterHP = p2fighterHP - dmg;

                    if(p2 == 0) textViewRight1.setText("Health: " + p2fighterHP);
                    if(p2 == 1) textViewRight2.setText("Health: " + p2fighterHP);
                    if(p2 == 2) textViewRight3.setText("Health: " + p2fighterHP);
                }

                if(turn % 2 == 0) {
                    int p2NumMoves = 0;
                    if (checkBox1.isChecked()) {
                        checkBox1.toggle();
                        move = p2Attacks[1].toString();
                        dmg = p2Dmgs[1];
                        p2NumMoves++;
                    }
                    if (checkBox2.isChecked()) {
                        checkBox2.toggle();
                        move = p2Attacks[2].toString();
                        dmg = p2Dmgs[2];
                        p2NumMoves++;
                    }
                    if (checkBox3.isChecked()) {
                        checkBox3.toggle();
                        move = p2Attacks[3].toString();
                        dmg = p2Dmgs[3];
                        p2NumMoves++;
                    }
                    if (checkBox4.isChecked()) {
                        checkBox4.toggle();
                        move = p2Attacks[4].toString();
                        dmg = p2Dmgs[4];
                        p2NumMoves++;
                    }
                    if(p2NumMoves != 1){
                        dmg = 0;
                        move = "";
                    }
                    checkBox1.setText(p1Attacks[1].toString());
                    checkBox2.setText(p1Attacks[2].toString());
                    checkBox3.setText(p1Attacks[3].toString());
                    checkBox4.setText(p1Attacks[4].toString());
                    if (dmg > 0){
                        dialogue.setText(fighterR + " used " + move + " on " + fighterL + " for " + dmg + " damage");
                    }else dialogue.setText("Please select one move!");

                    p1fighterHP = p1fighterHP - dmg;

                    if(p1 == 0) textViewLeft1.setText("Health: " + p1fighterHP);
                    if(p1 == 1) textViewLeft2.setText("Health: " + p1fighterHP);
                    if(p1 == 2) textViewLeft3.setText("Health: " + p1fighterHP);

                }

                if(p1fighterHP < 1){
                    if(p1 == 0){
                        textViewLeft1.setText("Dead!");
                        p1Attacks = p1c2Attacks;
                        p1Dmgs = p1c2Dmgs;
                        imageView1.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/dead" + p1Fighter1, null, null));
                        fighterL = p1c2Attacks[0];
                    }
                    if(p1 == 1){
                        textViewLeft2.setText("Dead!");
                        imageView2.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/dead" + p1Fighter2, null, null));
                        p1Attacks = p1c3Attacks;
                        p1Dmgs = p1c3Dmgs;
                        fighterL = p1c3Attacks[0];
                    }
                    if(p1 == 2){
                        textViewLeft3.setText("Dead!");
                        imageView3.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/dead" + p1Fighter3, null, null));
                        dialogue.setText("Player Two Wins!!");
                    }
                    p1fighterHP = p1Dmgs[0];
                    checkBox1.setText(p1Attacks[1].toString()); checkBox2.setText(p1Attacks[2].toString());
                    checkBox3.setText(p1Attacks[3].toString()); checkBox4.setText(p1Attacks[4].toString());
                    p1++;
                }


                if(p2fighterHP < 1){
                    if(p2 == 0){
                        textViewRight1.setText("Dead!");
                        imageView4.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/dead" + p2Fighter1, null, null));
                        p2Attacks = p2c2Attacks;
                        p2Dmgs = p2c2Dmgs;
                        fighterR = p2c2Attacks[0];
                    }
                    if(p2 == 1){
                        textViewRight2.setText("Dead!");
                        imageView5.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/dead" + p2Fighter2, null, null));
                        p2Attacks = p2c3Attacks;
                        p2Dmgs = p2c3Dmgs;
                        fighterR = p2c3Attacks[0];
                    }
                    if(p2 == 2){
                        textViewRight3.setText("Dead!");
                        imageView6.setImageResource(getResources().getIdentifier("com.example.zanespc.myproject:drawable/dead" + p2Fighter3, null, null));
                        dialogue.setText("Player One Wins!!");
                    }
                    p2fighterHP = p2Dmgs[0];
                    checkBox1.setText(p2Attacks[1].toString()); checkBox2.setText(p2Attacks[2].toString());
                    checkBox3.setText(p2Attacks[3].toString()); checkBox4.setText(p2Attacks[4].toString());
                    p2++;
                }
                turn++;
            }
        });
    }

}
