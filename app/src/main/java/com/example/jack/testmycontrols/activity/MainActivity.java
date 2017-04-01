package com.example.jack.testmycontrols.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.jack.testmycontrols.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout .activity_main);

        Button btn= (Button) findViewById(R.id.recybtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,recyMain.class);
                startActivity(intent);
            }
        });

        Button btn2= (Button) findViewById(R.id.orrEcyBtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,orientationRecyActivity.class);
                startActivity(intent);
            }
        });

        Button btn3= (Button) findViewById(R.id.pubuBtn);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,pubuActivity.class);
                startActivity(intent);
            }
        });
    }
}
