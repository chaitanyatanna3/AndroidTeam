package com.example.chaitanya.remotetigerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonChaitanya, buttonHivan, buttonMarcus, buttonAhemad, buttonSailu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChaitanya = (Button) findViewById(R.id.btn_chaitanya);
        buttonHivan = (Button) findViewById(R.id.btn_hivan);
        buttonMarcus = (Button) findViewById(R.id.btn_marcus);
        buttonAhemad = (Button) findViewById(R.id.btn_ahemad);
        buttonSailu = (Button) findViewById(R.id.btn_sailu);

        buttonChaitanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_chaitanya = new Intent(MainActivity.this, ChaitanyaActivity.class);
                startActivity(intent_chaitanya);
            }
        });
    }
}
