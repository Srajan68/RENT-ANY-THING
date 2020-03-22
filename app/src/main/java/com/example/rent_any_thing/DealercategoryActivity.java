package com.example.rent_any_thing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DealercategoryActivity extends AppCompatActivity {
    private Button addproduct ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealercategory);


        addproduct =(Button) findViewById(R.id.check_new_Product_btn);



        addproduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DealercategoryActivity.this, DealerproductUpActivity.class);
                startActivity(intent);
            }


        });



    }
}
