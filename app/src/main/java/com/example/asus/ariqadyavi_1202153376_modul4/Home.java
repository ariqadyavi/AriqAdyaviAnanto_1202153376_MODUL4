package com.example.asus.ariqadyavi_1202153376_modul4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Home extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void stud(View view) {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }

    public void pict(View view) {
        Intent g = new Intent(this, SecondActivity.class);
        startActivity(g);
    }
}
