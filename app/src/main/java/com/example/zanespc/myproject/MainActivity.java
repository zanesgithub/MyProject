package com.example.zanespc.myproject;

import android.app.Activity;
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

            int m = 0;
            public void onClick(View v) {
                if(checkBoxThanos.isChecked())
                    Log.d("myTag", "This is my message");

            }
        });

    }


}





