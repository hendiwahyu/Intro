package com.pinteraktif.intro

import android.util.Log

private const val TAG = "Person"

class Person(name: String, age:Int) {
    private val userName : String = name.capitalize()
    private val userAge : Int = age

    init {
        Log.d(TAG, "UserName = $userName")
        Log.d(TAG, "User age = $userAge")
    }

}