package com.example.rent_any_thing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signupActivity extends AppCompatActivity
{
    private Button GobackButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        GobackButton =(Button) findViewById(R.id.goback_btn);



        GobackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(signupActivity.this, MainActivity.class);
                startActivity(intent);
            }


        });



    }
}

