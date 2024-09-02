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

        // BOOLEAN
        println("----------Boolean----------")
        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        // <, >, <=, >=, ==, !=, &&(AND), ||(OR)

        println(3<5)
        println(6<3)
        println(3==3)
        println(4!=5)

        // CONVERSION
        println("----------Conversion----------")
        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger*2)

        // COLLECTIONS
        // Arrays
        println("----------Arrays----------")
        val myArray = arrayOf("James", "Kirk", "Rob", "Lars")

        // index
        println(myArray[0])
        myArray[0] = "James Hetfield"
        println(myArray[0])
        println(myArray)

        myArray.set(1, "Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[4])
        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("ismail", 5)
        println(mixedArray[0])
        println(mixedArray[1])

        // List - ArrayList
        println("----------Lists: ArrayList----------")
        val myMusician = arrayListOf<String>("James", "Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0, "Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList= ArrayList<Any>()
        myMixedArrayList.add("ismail")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])
    }
}