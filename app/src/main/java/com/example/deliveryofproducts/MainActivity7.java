package com.example.deliveryofproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
    }
    public void ClickGl(View view){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}