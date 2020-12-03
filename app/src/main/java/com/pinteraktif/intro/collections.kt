package com.pinteraktif.intro

import android.util.Log

private const val TAG = "collections"

/*
    The Difference between Array and List
    =======================================

    - we use array when considering memory efficiency
    - we use list when frequent insertion and deletion

    Because of this difference then we can consider this collection when used.
    If we want to able to change the values in the collection then we use mutable list.

*/


fun collections(){
    val weekdays = listOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    val wednesday = weekdays[2]

    Log.d(TAG, "collections: $wednesday")


    val randomArray: Array<String> = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    randomArray[0] = "test"

    val randomArrayList = arrayListOf("hendi", 1, 2, "wahyu", 0.2)
    randomArrayList.add(0, 3)
    Log.d(TAG, "collections: $randomArrayList")
    randomArrayList.remove("hendi")
    Log.d(TAG, "collections: $randomArrayList")


    val randomCollections = arrayListOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    randomCollections.add(5, "Saturday")
    randomCollections.add(6, "Sunday")
    randomCollections[0] = "test"

    Log.d(TAG, "collections: $randomCollections")



}


