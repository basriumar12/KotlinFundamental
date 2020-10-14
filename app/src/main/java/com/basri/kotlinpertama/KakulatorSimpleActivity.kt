package com.basri.kotlinpertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kakulator_simple.*

class KakulatorSimpleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kakulator_simple)


        btn_hitung.setOnClickListener {

            //flow logic kakulator
            if (edt_value_first.text.toString().isNullOrEmpty()) {
                edt_value_first.setError("Nilai satu tidak bisa kosong")
            } else if (edt_value_second.text.toString().isNullOrEmpty()) {
                edt_value_second.setError("Nilai dua tidak bisa kosong")
                Toast.makeText(this,"Nilai Dua tidak bisa kosong", Toast.LENGTH_LONG).show()
            } else {
                var nilaiSatu = edt_value_first.text.toString().toInt()
                var nilaiDua = edt_value_second.text.toString().toInt()
                //buat simple logic kakulator
                var tambah = nilaiSatu + nilaiDua
                tv_result.text = tambah.toString()
            }

        }


    }
}