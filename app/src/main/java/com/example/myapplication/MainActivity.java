package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button add,sub, go, external, pass;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result= findViewById(R.id.result);
        add=findViewById(R.id.btn_1);
        sub=findViewById(R.id.btn_2);
        go =findViewById(R.id.btn_3);
        external =findViewById(R.id.btn_4);
        pass=findViewById(R.id.btn_5);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic
                count++;
                result.setText(count+"");
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //logic
                count--;
                result.setText(String.valueOf(count));
            }
        });
        //explicit intent
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(MainActivity.this,FirstActivity.class);
                startActivity(i);

            }
        });
        //implicit intent
        external.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="http://www.google.com";
                Intent i= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        });
        //pass explicit
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                String videoId="abcd";
                int phone=9841;
                Bundle b= new Bundle();
                b.putString("id",videoId);
                b.putInt("ph",phone);
                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}
