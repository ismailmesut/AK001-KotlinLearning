package com.ismailmesutmujde.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("hello kotlin")

        // VARIABLES && CONSTANTS
        println("----------Variables & Constants----------")
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
        val name2 = "James"
        val a = 5

        // INTEGER & LONG
        println("----------Integer & Long----------")
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


        // DOUBLE & FLOAT
        println("----------Double & Float----------")
        // double
        val pi = 3.14
        println(pi*2.0)

        // float
        val myFloat = 3.14f
        println(myFloat*2)

        var myAge2 : Double
        myAge2 = 23.0
        println(myAge2/2)

        // camelCase
        // snake_case

        // STRING
        println("----------String----------")
        val myString = "ismail mesut müjde"
        println(myString)

        val name = "James"
        val surname = "Hetfield"
        val fullname = name + " " + surname
        println(fullname)
        val larsName : String = "Lars"
        println(myString.capitalize())
    }
}