package com.pinteraktif.intro

import android.util.Log

private const val TAG = "Clothing"

open class Clothing(var name : String, var size: Int) {

    var isClean : Boolean = true

    constructor(clothName: String, clothSize: Int, isClean: Boolean) : this(clothName, clothSize) {
        this.isClean = isClean
        Log.d(TAG, " $clothName with size $clothSize is Clean = $isClean ")
    }

   open fun washClothing(){
        this.isClean = true
    }
}