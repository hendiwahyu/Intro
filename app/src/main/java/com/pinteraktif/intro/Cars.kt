package com.pinteraktif.intro

import android.util.Log

private const val TAG = "Cars"

class Cars(makeCars: String, modelCars: String, yearCars: Int, weightCars: Int) :
    Vehicle(makeCars, modelCars, yearCars, weightCars) {

    private var isDriving: Boolean = true

    fun cars(tripValue: Int) {

        when (tripValue) {
            0 -> {
                isDriving = false
                needsMaintenance = false
                Log.d(TAG, "$model $year from $make with weight $weight trip value since maintenance is $tripSinceMaintenance")
                Log.d(TAG, "$model $year in REPAIR need maintenance: $needsMaintenance.")
                Log.d(TAG, "$model $year is driving: $isDriving ")
            }
            in 1..100 -> {
                for (i in 0 until tripValue) {
                    tripSinceMaintenance = i + 1
                    isDriving
                    needsMaintenance = false
                    Log.d(TAG, " $model $year from $make with weight $weight trip value since maintenance is $tripSinceMaintenance Car is DRIVING ")
                    Log.d(TAG, "$model $year , need maintenance: $needsMaintenance.")
                    Log.d(TAG, "$model $year is driving: $isDriving ")
                }

            }
            else -> {
                for (i in 100 until tripValue) {
                    tripSinceMaintenance = i + 1
                    isDriving
                    needsMaintenance = true
                    Log.d(TAG, "$model $year from $make with weight $weight trip value since maintenance is $tripSinceMaintenance , car needs MAINTENANCE !")
                    Log.d(TAG, "$model $year, need maintenance: $needsMaintenance.")
                    Log.d(TAG, "$model $year is driving: $isDriving ")
                }
            }
        }
    }
}

