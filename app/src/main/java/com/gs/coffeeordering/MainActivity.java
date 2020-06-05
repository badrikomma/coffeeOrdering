package com.gs.coffeeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv1, tv2;
    Button add1, add2;
    Button sub1, sub2;
    Button order;
    int x = 0, y = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        add1 = findViewById(R.id.button2);
        sub1 = findViewById(R.id.button);
        sub2 = findViewById(R.id.button4);
        add2 = findViewById(R.id.button5);
        order = findViewById(R.id.button6);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = x + 1;
                tv1.setText(String.valueOf(x));
            }
        });

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x = x - 1;
                tv1.setText(String.valueOf(x));
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y = y + 1;
                tv2.setText(String.valueOf(y));
            }
        });

        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                y = y - 1;
                tv2.setText(String.valueOf(y));
            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total;
                total = (x * 100) + (y * 50);
                Toast.makeText(getApplicationContext(),"Your total bill is: "+String.valueOf(total), Toast.LENGTH_SHORT).show();
            }
        });


    }
}