package com.example.captain.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ActivityToCheckCurrentDate extends AppCompatActivity {

    Date date;
    TextView textView;
    DateFormat dateFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_check_current_date);

        dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        date = Calendar.getInstance().getTime();
        String reportDate = dateFormat.format(date);
        textView = (TextView) findViewById(R.id.TextToDisplayDate);

        textView.setText(reportDate);

    }
}
