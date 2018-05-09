package com.example.captain.myfirstapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;

public class CalendarToChangeDate extends AppCompatActivity {

    private CalendarView calendarView;
    private GetAndChangeData getAndChangeData = new GetAndChangeData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = (CalendarView) findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                Intent intent = new Intent(CalendarToChangeDate.this,Acti_theChangedDay.class);
                int hey = dayOfMonth;
                startActivity(intent);
                getAndChangeData.setDayInt(hey);
            }
        });
    }
}
