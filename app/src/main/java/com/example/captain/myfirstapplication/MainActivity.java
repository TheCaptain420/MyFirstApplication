package com.example.captain.myfirstapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Edit test
        final GetAndChangeData getAndChangeData = new GetAndChangeData();


        //Til calenderen
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(MainActivity.this, CalendarToChangeDate.class);
                startActivity(intent);

            }
        });

        //Til today
        Button button1 = findViewById(R.id.btn_gototoday);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, ActivityToCheckCurrentDate.class);
                startActivity(intent1);
            }
        });

        //Til edittext
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent data = new Intent();
              EditText editText =(EditText) findViewById(R.id.editText);
              //Set the data to pass back
              data.setData(Uri.parse(editText.getText().toString()));
              setResult(RESULT_OK,data);
              Intent intent = new Intent(MainActivity.this,WritingTheName.class);
              startActivity(intent);
              //closes the activity
              //finish();
            }
        });


    }


}
