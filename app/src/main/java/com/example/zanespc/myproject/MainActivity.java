package com.example.zanespc.myproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.selectButton);
        button.setOnClickListener(new View.OnClickListener() {
            CheckBox checkBoxThanos = (CheckBox)findViewById(R.id.checkBoxThanos);
            CheckBox checkBoxNaruto = (CheckBox)findViewById(R.id.checkBoxNaruto);
            CheckBox checkBoxZed = (CheckBox)findViewById(R.id.checkBoxZed);
            CheckBox checkBoxMewtwo = (CheckBox)findViewById(R.id.checkBoxMewtwo);
            CheckBox checkBoxBobby = (CheckBox)findViewById(R.id.checkBoxBobby);
            CheckBox checkBoxBears = (CheckBox)findViewById(R.id.checkBoxBears);
            CheckBox checkBoxSasuke = (CheckBox)findViewById(R.id.checkBoxSasuke);
            CheckBox checkBoxCaptainAmerica = (CheckBox)findViewById(R.id.checkBoxCaptainAmerica);
            CheckBox checkBoxGoku = (CheckBox)findViewById(R.id.checkBoxGoku);

            Intent i = new Intent(MainActivity.this, FightActivity.class);
            Bundle extras = new Bundle();

            public String[] F = {"1", "2", "3"};
            int m = 0;

            public void onClick(View v) {
                if(checkBoxThanos.isChecked()) {
                    extras.putString(F[m], "thanos");
                    m++;
                }

                if(checkBoxNaruto.isChecked()){
                    extras.putString(F[m], "naruto");
                    m++;
                }

                if(checkBoxZed.isChecked()){
                    extras.putString(F[m], "zed");
                    m++;
                }

                if(checkBoxMewtwo.isChecked()){
                    extras.putString(F[m], "mewtwo");
                    m++;
                }

                if(checkBoxBears.isChecked()){
                    extras.putString(F[m], "four_bears");
                    m++;
                }

                if(checkBoxSasuke.isChecked()){
                    extras.putString(F[m], "sasuke");
                    m++;
                }

                if(checkBoxCaptainAmerica.isChecked()){
                    extras.putString(F[m], "captain_america");
                    m++;
                }

                if(checkBoxBobby.isChecked()){
                    extras.putString(F[m], "bobby_shmurda");
                    m++;
                }

                if(checkBoxGoku.isChecked()){
                    extras.putString(F[m], "goku");
                    m++;
                }

                if(m == 3) {
                    i.putExtras(extras);
                    startActivity(i);
                }
            }
        });

    }


}





