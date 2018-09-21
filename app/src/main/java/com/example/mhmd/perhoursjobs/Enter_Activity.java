package com.example.mhmd.perhoursjobs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Enter_Activity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_);
        Button face = (Button) findViewById(R.id.facebook);
        Button signup = (Button) findViewById(R.id.signup);
        Button signin = (Button) findViewById(R.id.signin);

        //To registration page
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Enter_Activity.this,Regestration.class);
                startActivity(intent);
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Enter_Activity.this , SignIn.class);
                startActivity(intent);
            }
        });

    }
}
