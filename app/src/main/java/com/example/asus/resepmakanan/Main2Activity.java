package com.example.asus.resepmakanan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String judul = intent.getStringExtra("nama");
        String ingredients = intent.getStringExtra("Ingredients");
        String process = intent.getStringExtra("Process");

        TextView judull = findViewById(R.id.txtNama);
        judull.setText(judul);

        TextView tingredients = findViewById(R.id.resep_ingredients);
        tingredients.setText(ingredients);

        tingredients.setMovementMethod(new ScrollingMovementMethod());
        TextView tprocess = findViewById(R.id.resep_process);

        tprocess.setText(process);
        ActionBar ab = getSupportActionBar();
        ab.setHomeButtonEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);
    }

}
