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

        // Long
        var myLong : Long = 100
        println(myLong)

        // Double & Float
        val pi = 3.14
        println(pi*2.0)

        val myFloat = 3.14f
        println(myFloat*2)

        var myAge2 : Double
        myAge2 = 23.0
        println(myAge2/2)

        // camelCase
        // snake_case
    }
}