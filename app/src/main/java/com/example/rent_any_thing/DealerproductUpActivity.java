package com.example.rent_any_thing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DealerproductUpActivity extends AppCompatActivity {

    private Button submit,Goback ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealerproduct_up);


        submit =(Button) findViewById(R.id.submit_btn);
        Goback =(Button) findViewById(R.id.goback_btn);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DealerproductUpActivity.this, DealerproductUpActivity.class);
                startActivity(intent);
            }


        });
        Goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DealerproductUpActivity.this, DealercategoryActivity.class);
                startActivity(intent);
            }


        });


    }
}