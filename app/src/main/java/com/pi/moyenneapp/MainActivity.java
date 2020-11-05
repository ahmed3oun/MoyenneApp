package com.pi.moyenneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText moy1;
    EditText moy2;
    EditText moy3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*String val1=moy1.getText().toString();
        String val2=moy2.getText().toString();
        String val3=moy3.getText().toString();*/


    }
    public void calculer(View view){
        Log.d("info","here");
        moy1=findViewById(R.id.moy1);
        moy2=findViewById(R.id.moy2);
        moy3=findViewById(R.id.moy3);

        String val1=moy1.getText().toString();
        String val2=moy2.getText().toString();
        String val3=moy3.getText().toString();
        float value1=Float.parseFloat(val1);
        float value2=Float.parseFloat(val2);
        float value3=Float.parseFloat(val3);
        float moy=(value1+value2+value3)/3;
        if (moy>=10){
            Intent intent = new Intent(MainActivity.this,Felicitation.class);
            intent.putExtra("moyenne",moy);
            startActivity(intent);

        }
        else{
            Intent intent = new Intent(MainActivity.this,Failure.class);
            intent.putExtra("moyenne",moy);
            startActivity(intent);
        }


    }
}