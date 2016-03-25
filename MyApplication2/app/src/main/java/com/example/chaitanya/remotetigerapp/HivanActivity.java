package com.example.chaitanya.remotetigerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HivanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hivan);

    }

    public void testOpen(View view) {
        Toast.makeText(this, "!", Toast.LENGTH_SHORT).show();
    }
}
