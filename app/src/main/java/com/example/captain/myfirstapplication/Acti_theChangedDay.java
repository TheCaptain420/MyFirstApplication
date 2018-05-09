package com.example.captain.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Acti_theChangedDay extends AppCompatActivity {
    private GetAndChangeData getAndChangeData= new GetAndChangeData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acti_the_changed_day);

        TextView textView = findViewById(R.id.TextToDisplayDate);
       /* int heyo = getAndChangeData.getDayInt();
        String reeee = " "+ heyo;
        //textView.setText(reeee);*/

        //textView.setText("Hello");
        System.out.println("Hello");
    }



}
