package com.example.deliveryofproducts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ActivityNine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
    }



    public void ClickTen(View view) {
        Intent intent = new Intent(this, ActivityTen.class);
        startActivity(intent);
    }

    TextView textView4;
    TextView textView3;
    TextView textView7;
    TextView textView10;
    TextView textView13;
    TextView textView16;
    TextView textView19;
    TextView textView24;
    TextView textView6;
    TextView textView9;
    TextView textView15;
    TextView textView12;
    TextView textView18;

    Button button;

    int pr;

    public void plus(View view) {
        textView4 = (TextView) findViewById(R.id.textView4); // textView4 - обьект "надпись"
        CharSequence zz = textView4.getText(); // получем содержимое обьекта
        int pz = Integer.valueOf(zz.toString()); // преобразовываем в число
        if (pz >= 0) {
            pz++;
        } else pz = 0;
        textView4.setText(Integer.toString(pz)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView3 = (TextView) findViewById(R.id.textView3); // textView3 - обьект "надпись"
        CharSequence tri = textView3.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //textView24 - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        pr = pr + tris; // прибавляем 1
        textView24.setText(Integer.toString(pr)); // преобразовываем в строку и возвращаем в обьект "надпись" */


    }

    public void plus2(View view) {
        textView7 = (TextView) findViewById(R.id.textView7); //cnt - обьект "надпись"
        CharSequence zz2 = textView7.getText(); // получем содержимое обьекта
        int pz2 = Integer.valueOf(zz2.toString()); // преобразовываем в число
        if (pz2 >= 0) {
            pz2++;
        } else pz2 = 0;
        textView7.setText(Integer.toString(pz2)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView6 = (TextView) findViewById(R.id.textView6); //cnt - обьект "надпись"
        CharSequence tri = textView6.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        pr = pr + tris; // прибавляем 1
        textView24.setText(Integer.toString(pr));
    }

    public void plus3(View view) {
        textView10 = (TextView) findViewById(R.id.textView10); //cnt - обьект "надпись"
        CharSequence zz3 = textView10.getText(); // получем содержимое обьекта
        int pz3 = Integer.valueOf(zz3.toString()); // преобразовываем в число
        if (pz3 >= 0) {
            pz3++;
        } else pz3 = 0;
        textView10.setText(Integer.toString(pz3)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView9 = (TextView) findViewById(R.id.textView9); //cnt - обьект "надпись"
        CharSequence tri = textView9.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        pr = pr + tris; // прибавляем 1
        textView24.setText(Integer.toString(pr));
    }

    public void plus4(View view) {

        textView13 = (TextView) findViewById(R.id.textView13); //cnt - обьект "надпись"
        CharSequence zz4 = textView13.getText(); // получем содержимое обьекта
        int pz4 = Integer.valueOf(zz4.toString()); // преобразовываем в число
        if (pz4 >= 0) {
            pz4++;
        } else pz4 = 0;
        textView13.setText(Integer.toString(pz4)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView12 = (TextView) findViewById(R.id.textView12); //cnt - обьект "надпись"
        CharSequence tri = textView12.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        pr = pr + tris; // прибавляем 1
        textView24.setText(Integer.toString(pr));
    }

    public void plus5(View view) {
        textView16 = (TextView) findViewById(R.id.textView16); //cnt - обьект "надпись"
        CharSequence zz5 = textView16.getText(); // получем содержимое обьекта
        int pz5 = Integer.valueOf(zz5.toString()); // преобразовываем в число
        if (pz5 >= 0) {
            pz5++;
        } else pz5 = 0;
        textView16.setText(Integer.toString(pz5)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView15 = (TextView) findViewById(R.id.textView15); //cnt - обьект "надпись"
        CharSequence tri = textView15.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        pr = pr + tris; // прибавляем 1
        textView24.setText(Integer.toString(pr));
    }

    public void plus6(View view) {
        textView19 = (TextView) findViewById(R.id.textView19); //cnt - обьект "надпись"
        CharSequence zz6 = textView19.getText(); // получем содержимое обьекта
        int pz6 = Integer.valueOf(zz6.toString()); // преобразовываем в число
        if (pz6 >= 0) {
            pz6++;
        } else pz6 = 0;
        textView19.setText(Integer.toString(pz6)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView18 = (TextView) findViewById(R.id.textView18); //cnt - обьект "надпись"
        CharSequence tri = textView18.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        pr = pr + tris; // прибавляем 1
        textView24.setText(Integer.toString(pr));
    }


    public void minus(View view) {
        textView4 = (TextView) findViewById(R.id.textView4); // обьект "надпись"
        CharSequence zz = textView4.getText(); // получем содержимое обьекта
        int pz = Integer.valueOf(zz.toString()); // преобразовываем в число
        if (pz > 0) {
            pz--;
        } else pz = 0;
        textView4.setText(Integer.toString(pz)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView3 = (TextView) findViewById(R.id.textView3); //обьект "надпись"
        CharSequence tri = textView3.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        int pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        if (pz != 0) {
            pr = pr - tris; // прибавляем 1
            textView24.setText(Integer.toString(pr));
        }
    }

    public void minus2(View view) {
        textView7 = (TextView) findViewById(R.id.textView7); //cnt - обьект "надпись"
        CharSequence zz2 = textView7.getText(); // получем содержимое обьекта
        int pz2 = Integer.valueOf(zz2.toString()); // преобразовываем в число
        if (pz2 > 0) {
            pz2--;
        } else pz2 = 0;
        textView7.setText(Integer.toString(pz2)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView6 = (TextView) findViewById(R.id.textView6); //cnt - обьект "надпись"
        CharSequence tri = textView6.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        int pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        if (pz2 != 0) {
            pr = pr - tris; // прибавляем 1
            textView24.setText(Integer.toString(pr));
        } else {
            textView24.setText(Integer.toString(pr));
        }

    }

    public void minus3(View view) {
        textView10 = (TextView) findViewById(R.id.textView10); //cnt - обьект "надпись"
        CharSequence zz3 = textView10.getText(); // получем содержимое обьекта
        int pz3 = Integer.valueOf(zz3.toString()); // преобразовываем в число
        if (pz3 > 0) {
            pz3--;
        } else pz3 = 0;
        textView10.setText(Integer.toString(pz3)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView9 = (TextView) findViewById(R.id.textView9); //cnt - обьект "надпись"
        CharSequence tri = textView9.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        int pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        if (pz3 != 0) {
            pr = pr - tris; // прибавляем 1
            textView24.setText(Integer.toString(pr));
        }
    }

    public void minus4(View view) {
        textView13 = (TextView) findViewById(R.id.textView13); //cnt - обьект "надпись"
        CharSequence zz4 = textView13.getText(); // получем содержимое обьекта
        int pz4 = Integer.valueOf(zz4.toString()); // преобразовываем в число
        if (pz4 > 0) {
            pz4--;
        } else pz4 = 0;
        textView13.setText(Integer.toString(pz4)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView12 = (TextView) findViewById(R.id.textView12); //cnt - обьект "надпись"
        CharSequence tri = textView12.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        int pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        if (pz4 != 0) {
            pr = pr - tris; // прибавляем 1
            textView24.setText(Integer.toString(pr));
        }
    }

    public void minus5(View view) {
        textView16 = (TextView) findViewById(R.id.textView16); //cnt - обьект "надпись"
        CharSequence zz5 = textView16.getText(); // получем содержимое обьекта
        int pz5 = Integer.valueOf(zz5.toString()); // преобразовываем в число
        if (pz5 > 0) {
            pz5--;
        } else pz5 = 0;
        textView16.setText(Integer.toString(pz5)); // преобразовываем в строку и возвращаем в обьект "надпись"

        textView15 = (TextView) findViewById(R.id.textView15); //cnt - обьект "надпись"
        CharSequence tri = textView15.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        int pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        if (pz5 != 0) {
            pr = pr - tris; // прибавляем 1
            textView24.setText(Integer.toString(pr));
        }
    }

    public void minus6(View view) {
        textView19 = (TextView) findViewById(R.id.textView19); //cnt - обьект "надпись"
        CharSequence zz6 = textView19.getText(); // получем содержимое обьекта
        int pz6 = Integer.valueOf(zz6.toString()); // преобразовываем в число
        if (pz6 > 0) {
            pz6--;
        } else pz6 = 0;
        textView19.setText(Integer.toString(pz6)); // преобразовываем в строку и возвращаем в обьект "надпись"


        textView18 = (TextView) findViewById(R.id.textView18); //cnt - обьект "надпись"
        CharSequence tri = textView18.getText(); // получем содержимое обьекта
        int tris = Integer.valueOf(tri.toString()); // преобразовываем в число

        textView24 = (TextView) findViewById(R.id.textView24); //cnt - обьект "надпись"
        CharSequence zzi = textView24.getText(); // получем содержимое обьекта
        int pr = Integer.valueOf(zzi.toString()); // преобразовываем в число
        if (pz6 != 0) {
            pr = pr - tris; // прибавляем 1
            textView24.setText(Integer.toString(pr));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.two_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.point:

                Intent intent = new Intent(this, MainActivity5.class);
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

