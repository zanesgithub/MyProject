package com.example.zanespc.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FightActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        Intent i = getIntent();
        Bundle extras = i.getExtras();
        String Fighter1 = extras.getString("1");
        String Fighter2 = extras.getString("2");
        String Fighter3 = extras.getString("3");

        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);


        int id1 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + Fighter1, null, null);
        imageView1.setImageResource(id1);

        int id2 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + Fighter2, null, null);
        imageView2.setImageResource(id2);

        int id3 = getResources().getIdentifier("com.example.zanespc.myproject:drawable/" + Fighter3, null, null);
        imageView3.setImageResource(id3);


    }
}
