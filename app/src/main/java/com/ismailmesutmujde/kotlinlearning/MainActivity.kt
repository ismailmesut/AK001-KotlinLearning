package com.ismailmesutmujde.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin")

        // VARIABLES && CONSTANTS

        // Variables (Değişkenler) -> var
        // var tanımlanan bir değişken sonradan değiştirilebilir.

        var x = 5
        var y = 4
        println(x * y)

        var age = 35
        println(age / 7 * 5)

        age = 36
        println(age)

        // Constants (Sabitler) -> val
        // val tanımlanan bir değişken sonradan değiştirilemez.
        val name = "James"
        val a = 5

        // Integer
        var myAge = 35
        println("myAge: " + myAge)
        var result = age / 7 * 5
        println(result)

        // Defining -> Tanımlama
        var myInteger : Int
        // Initialize -> ilk değerini atama
        myInteger = 10
        myInteger = 20

        val b : Int = 23
        println(b/2)

    }
}