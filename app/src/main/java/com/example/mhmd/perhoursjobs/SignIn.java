package com.example.mhmd.perhoursjobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button toJobs = findViewById(R.id.signin2);
        //to job list
        toJobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this,JobsListActivity.class);
                startActivity(intent);
            }
        });
        //to reset password
        Button forpass = findViewById(R.id.forgetpassword);
        forpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this , Reset_Password.class);
                startActivity(intent);
            }
        });
        //forget username
        Button foruser = findViewById(R.id.forgetuser);
        foruser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignIn.this , Forget_Username.class);
                startActivity(intent);
            }
        });
    }
}
