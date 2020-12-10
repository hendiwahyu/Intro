package com.pinteraktif.intro

import android.util.Log

private const val TAG = "Shoes"
class ShoesWithLaces(nameShoes: String, sizeShoes: Int): Clothing(nameShoes,sizeShoes) {

    var lacesName: String? = null
    var areLacesClean: Boolean = false
    var areShoesLaced: Boolean = false

    init {
        Log.d(TAG, "Shoes name is $nameShoes ")
    }

    fun laceShoes(name: String){
        this.lacesName = name
        this.areLacesClean = true
        this.areShoesLaced = true
    }

   override fun washClothing(){
       super.washClothing()
       areLacesClean = true
   }



}