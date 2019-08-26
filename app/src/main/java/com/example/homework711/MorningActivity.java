package com.example.homework711;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MorningActivity extends AppCompatActivity {
    TextView txtTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morning);
        txtTime = findViewById(R.id.txt_time);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:MM");
        Calendar calendar = new GregorianCalendar();
        txtTime.setText(sdf.format(calendar.getTime()));
    }
}
