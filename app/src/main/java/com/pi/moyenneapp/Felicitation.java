package com.pi.moyenneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Felicitation extends AppCompatActivity {
    TextView successView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_felicitation);
        float moyenne=getIntent().getFloatExtra("moyenne",(float)0.0);
        String msg="Congratulations , you are successed to the next level , your moyenne is :"+moyenne;
        successView=findViewById(R.id.ViewSuccess);
        successView.setText(msg);


    }
    public  void send(View view){
        successView=findViewById(R.id.ViewSuccess);
        String msg=successView.getText().toString();
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:93611028"));
        smsIntent.putExtra("sms_body",msg);
        startActivity(smsIntent);

    }
}