package com.example.digitaltasbhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvlearn, tvcount;
    Button btnadd, btnreset, btnsub, btncount;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvlearn = findViewById(R.id.tvlearn);
        tvcount = findViewById(R.id.tvcountview);

        btnadd = findViewById(R.id.btnadd);
        btnreset = findViewById(R.id.btnreset);
        btnsub = findViewById(R.id.btnsub);
        btncount = findViewById(R.id.btncount);

        // ========== Click Event =====================

        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvcount.setText(""+count);
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvcount.setText(""+count);
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvcount.setText(""+count);
            }
        });
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvcount.setText(""+count);
            }
        });




    }
}