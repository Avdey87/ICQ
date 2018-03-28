package com.aavdeev.icq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TextICQActivity extends AppCompatActivity {

    public static final String TEXT = "text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_icq);

        TextView tv = findViewById(R.id.text_view);
        Intent intent = getIntent();
        String text = intent.getStringExtra(TEXT);
        tv.setText(text);
    }
}
