package com.example.service;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton btnplay;
    Boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnplay = findViewById(R.id.btnplay);
        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this,MyService.class);
                startService(intent1);
                if(flag == true)
                {
                    btnplay.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.pause));
                    Toast.makeText(MainActivity.this, "Музыка начала играть", Toast.LENGTH_SHORT).show();
                    flag = false;
                }
                else{
                    btnplay.setImageDrawable(ContextCompat.getDrawable(MainActivity.this, R.drawable.play));
                    flag = true;
                    Toast.makeText(MainActivity.this, "Пауза", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}