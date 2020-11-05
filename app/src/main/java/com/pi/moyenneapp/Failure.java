package com.pi.moyenneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Failure extends AppCompatActivity {
    TextView failedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_failure);
        float moyenne=getIntent().getFloatExtra("moyenne",(float)0.0);
        failedView=findViewById(R.id.ViewFailure);
        String msg="So sorry! , you are failed to pass the next level , your moyenne is :"+moyenne;
        failedView.setText(msg);
    }
    public  void send(View view){
        failedView=findViewById(R.id.ViewFailure);
        String msg=failedView.getText().toString();
        Intent smsIntent = new Intent(Intent.ACTION_SENDTO, Uri.parse("sms:93611028"));
        smsIntent.putExtra("sms_body",msg);
        startActivity(smsIntent);

    }
}