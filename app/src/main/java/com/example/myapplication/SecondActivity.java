package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView video,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        video=findViewById(R.id.videoId);
        phone=findViewById(R.id.phone);

        String videoId=getIntent().getExtras().getString("id");
        int ph=getIntent().getExtras().getInt("ph");
        video.setText(videoId);
        phone.setText(String.valueOf(ph));
    }
}