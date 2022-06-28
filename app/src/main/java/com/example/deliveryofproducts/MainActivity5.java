package com.example.deliveryofproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }


    public void Clickpizza(View view) {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }

    public void Clickyog(View view) {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);
    }

    public void Clicksalat(View view) {
        Intent intent = new Intent(this, MainActivity8.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.catalog:

                Intent intent = new Intent(this, ActivityNine.class);
                startActivity(intent);

                return true;
        }

        switch (item.getItemId()) {
            case R.id.exit:

                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);

                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
