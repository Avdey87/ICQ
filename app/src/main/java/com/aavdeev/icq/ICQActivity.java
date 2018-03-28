package com.aavdeev.icq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ICQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icq);
    }

    public void onClickAktivity(View view) {
        EditText et = findViewById(R.id.text);
        String text = et.getText().toString();
        Intent intent = new Intent(this, TextICQActivity.class);
        intent.putExtra(TextICQActivity.TEXT, text);
        startActivity(intent);
    }

    public void onClickIntent(View view) {
        EditText message = findViewById(R.id.text);
        String messageText = message.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        Intent chosenIntent = Intent.createChooser(intent, "Выбор способа отправки");
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);

        startActivity(chosenIntent);
    }
}
