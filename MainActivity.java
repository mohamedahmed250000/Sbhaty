package com.example.sbhaty;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ActionBar aa;
ImageView imageView;
TextView textView1;
TextView textView2;
Button button;
    int i =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aa=getSupportActionBar();
        aa.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#303B77")));
        imageView= findViewById(R.id.my);
        textView1 = findViewById(R.id.text);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                textView1.getText();
                textView1.setText(String.valueOf(i));
            }
        });
        button=findViewById(R.id.bu);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=0;
                textView1.getText();
                textView1.setText(String.valueOf(0000));
            }
        });

    }
}
