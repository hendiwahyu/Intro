package com.pinteraktif.intro

import android.util.Log
import java.util.*

private const val TAG = "Person"

class Person(name: String, age:Int) {
    private val userName: String = name.capitalize(Locale.ROOT)
    private val userAge : Int = age

    init {
        Log.d(TAG, "UserName = $userName")
        Log.d(TAG, "User age = $userAge")
    }
}