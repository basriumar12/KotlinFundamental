package com.basri.kotlinpertama;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

class MainJava extends AppCompatActivity {


    //gloabal variabel
     String namaSaya = "Basri";
     int umur = 20;

     TextView tvHello;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi
        tvHello = findViewById(R.id.tv_hello);
        tvHello.setText(namaSaya+umur);


        namaSaya = " Basri Umar";


    }
}
