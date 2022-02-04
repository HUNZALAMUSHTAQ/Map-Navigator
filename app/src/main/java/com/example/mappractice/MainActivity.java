package com.example.mappractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    Button button ;
    EditText mlongitude;
    EditText mlatitude ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlongitude = (EditText) findViewById(R.id.longt);
        mlatitude = (EditText) findViewById(R.id.lat);
        button = (Button) findViewById(R.id.Locate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),MapsActivity.class);
                intent.putExtra("longitude" , mlongitude.getText().toString());
                intent.putExtra("latitude" ,  mlatitude.getText().toString());

                startActivity(intent);

            }
        });


    }
}