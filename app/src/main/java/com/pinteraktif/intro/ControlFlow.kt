package com.pinteraktif.intro

import android.util.Log

private const val TAG = "ControlFlow"

fun fizzBuzz() {
    val low = 1
    val high = 100
    val number = low..high


    for (i in number) {
        if (i.rem(3) == 0 && i.rem(5) == 0) {
            Log.d(TAG, "$i = FizzBuzz")
        } else if (i >= 2 && i.rem(3) == 0 && isPrimeNumber(i)) {
            Log.d(TAG, "$i = Fizz and Prime")
        } else if (i.rem(3) == 0) {
            Log.d(TAG, "$i = Fizz")
        } else if (i >= 2 && i.rem(5) == 0 && isPrimeNumber(i)) {
            Log.d(TAG, "$i = Buzz and Prime")
        } else if (i.rem(5) == 0) {
            Log.d(TAG, "$i = Buzz")
        } else if (i >= 2 && isPrimeNumber(i)) {
            Log.d(TAG, "$i = Prime")
        } else {
            Log.d(TAG, "$i")
        }
    }
}

fun isPrimeNumber(number: Int): Boolean {
    for (i in 2..number / 2) {
        if (number.rem(i) == 0) {
            return false
        }
    }
    return true
}


