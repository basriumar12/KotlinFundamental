package com.basri.kotlinpertama

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    //gloabal variabel muttable
    var namaSaya = "Basri"
    var umur = 20
    var nama: String? = "Basri Umar"

    //imutable
    val namaAnda = "Ucup"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(namaSaya)
        println(namaAnda)
        println(umur)
        Log.e("TAG", "nama saya adalah $namaAnda ")
        Toast.makeText(this, "nama saya adalah $namaSaya", Toast.LENGTH_LONG).show()

        //set textview dengan nilai dari variabel
        tv_hello.text = "Nama saya : $namaSaya \n Umur : $umur"


        // control flow if
        val nama = "Basri Umar"
        val nilai = 0


        //validasi
        if (nilai > 80) {
            println(" Selamat $nama, anda lulus ")
        } else {
            println(" Anda tidak lulus ")
        }

        //when
        when (nilai) {

            90 -> {
                println(" Nilai anda memuaskan")
            }

            80 -> {
                println(" Nilai anda cukup")
            }

            70 -> {
                println(" Nilai anda kurang")
            }

            else -> {
                println("Nilai anda belum keluar")
            }
        }

        //penggunaan for
        // mencetak nilai 1-10
        for (number in 1..10){
            println("Nilai ke $number")

        }

        //control flow while
        var nilaiWhile = 1

            while (nilaiWhile <= 5){
                println("nilai while $nilaiWhile")
                nilaiWhile++
            }

        //control do while
        var nilaiDoWhile =1
        do {
            println("nilai do while $nilaiDoWhile")
            nilaiDoWhile++
        }while (nilaiDoWhile <=3)

    }
}