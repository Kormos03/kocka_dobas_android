package com.example.kocka_dobas_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button3;
    private TextView textView;
    public String eredmeny = "qweqew";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            eredmeny += "qweqew" + "\n";
            textView.setText(eredmeny);
            }
        });
    }

    public void init()
    {
        button3 = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);
    }
}