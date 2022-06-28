package com.example.deliveryofproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void Click3(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }


    public void signUp(View view) {

        String email = ((TextView)findViewById(R.id.editTextTextEmailAddress2)).getText().toString();
        String passwordFirst = ((TextView)findViewById(R.id.editTextTextPassword)).getText().toString();
        String fullName = ((TextView)findViewById(R.id.editTextTextPersonName)).getText().toString();
        String number = ((TextView)findViewById(R.id.editTextPhone)).getText().toString();

        if (email.isEmpty() || passwordFirst.isEmpty() || fullName.isEmpty() || number.isEmpty())
        {
            Toast.makeText(this, "Не все поля заполнены", Toast.LENGTH_LONG).show();
            return;
        }

        if(!email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(.[A-Za-z]{2,})$"))
        {
            Toast.makeText(this, "Некорректный адрес электронной почты", Toast.LENGTH_LONG).show();
            return;
        }


        String url = "https://food.madskill.ru/auth/register";

        RequestQueue requestQueue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        Toast.makeText(MainActivity4.this, response.toString(), Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
                        startActivity(intent);
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity4.this, "Регистрация не удалась", Toast.LENGTH_LONG).show();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("email", email);
                params.put("password", passwordFirst);
                params.put("login", fullName);


                return params;
            }
        };

        requestQueue.add(request);
    }
}