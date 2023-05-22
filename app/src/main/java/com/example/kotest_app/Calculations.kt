package com.example.kotest_app

class Calculations {
    fun additionOfTwoNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun subtractionOfTwoNumbers(a: Int, b: Int): Int {
        return if (a > b)
            a - b
        else
            b - a
    }

    fun multiplicationOfTwoNumbers(a: Int, b: Int): Int {
        return a * b
    }

    fun divisionOfTwoNumbers(a: Int, b: Int): Int {
        return if (b != 0)
            a / b
        else 0
    }

}