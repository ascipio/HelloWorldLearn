package com.anik.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        TextView textView = findViewById(R.id.text_view2);
        String name = getIntent().getStringExtra("user");
        textView.setText(name);

    }
}
