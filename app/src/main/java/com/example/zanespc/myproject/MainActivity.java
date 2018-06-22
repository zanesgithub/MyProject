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
import android.widget.TextView;
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
            TextView charSelect = (TextView) findViewById(R.id.charSelect);

            Intent i = new Intent(MainActivity.this, FightActivity.class);
            Bundle extras = new Bundle();

            public String[] F = {"pOne1", "pTwo1", "pOne2", "pTwo2", "pOne3", "pTwo3", "", "", ""};
            int m = 0;
            int lockInNum = 0;

            public void onClick(View v) {
                if(checkBoxThanos.isChecked()) {
                    extras.putString(F[m], "thanos");
                    m++;
                    checkBoxThanos.setChecked(false);
                    checkBoxThanos.setEnabled(false);
                }

                if(checkBoxNaruto.isChecked()){
                    extras.putString(F[m], "naruto");
                    m++;
                    checkBoxNaruto.setChecked(false);
                    checkBoxNaruto.setEnabled(false);
                }

                if(checkBoxZed.isChecked()){
                    extras.putString(F[m], "zed");
                    m++;
                    checkBoxZed.setChecked(false);
                    checkBoxZed.setEnabled(false);
                }

                if(checkBoxMewtwo.isChecked()){
                    extras.putString(F[m], "mewtwo");
                    m++;
                    checkBoxMewtwo.setChecked(false);
                    checkBoxMewtwo.setEnabled(false);
                }

                if(checkBoxBears.isChecked()){
                    extras.putString(F[m], "four_bears");
                    m++;
                    checkBoxBears.setChecked(false);
                    checkBoxBears.setEnabled(false);
                }

                if(checkBoxSasuke.isChecked()){
                    extras.putString(F[m], "sasuke");
                    m++;
                    checkBoxSasuke.setChecked(false);
                    checkBoxSasuke.setEnabled(false);
                }

                if(checkBoxCaptainAmerica.isChecked()){
                    extras.putString(F[m], "captain_america");
                    m++;
                    checkBoxCaptainAmerica.setChecked(false);
                    checkBoxCaptainAmerica.setEnabled(false);
                }

                if(checkBoxBobby.isChecked()){
                    extras.putString(F[m], "bobby_shmurda");
                    m++;
                    checkBoxBobby.setChecked(false);
                    checkBoxBobby.setEnabled(false);
                }

                if(checkBoxGoku.isChecked()){
                    extras.putString(F[m], "goku");
                    m++;
                    checkBoxGoku.setChecked(false);
                    checkBoxGoku.setEnabled(false);
                }

                if(m % 2 == 0)charSelect.setText("Player one select one character then hit lock in");
                if(m % 2 == 1)charSelect.setText("Player two select one character then hit lock in");

                if(m == 6) {
                    charSelect.setText("launch attempt");
                    i.putExtras(extras);
                    startActivity(i);
                }
                else if(m > 6){
                    charSelect.setText("Too many characters selected! Start again");
                    checkBoxGoku.setEnabled(true);
                    checkBoxBobby.setEnabled(true);
                    checkBoxCaptainAmerica.setEnabled(true);
                    checkBoxThanos.setEnabled(true);
                    checkBoxSasuke.setEnabled(true);
                    checkBoxZed.setEnabled(true);
                    checkBoxBears.setEnabled(true);
                    checkBoxMewtwo.setEnabled(true);
                    checkBoxNaruto.setEnabled(true);
                    m = 0;
                }
            }
        });

    }


}





