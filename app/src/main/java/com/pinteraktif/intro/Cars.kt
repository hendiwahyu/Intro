package com.pinteraktif.intro

import android.util.Log

private const val TAG = "Cars"

class Cars(makeCars: String, modelCars: String, yearCars: Int, weightCars: Int) :
    Vehicle(makeCars, modelCars, yearCars, weightCars) {

    private var isDriving: Boolean = true

    fun cars(tripValue: Int) {

        when (tripValue) {
            0 -> {
                Log.d(TAG, "Car in repair")
                isDriving = false
                needsMaintenance = false
            }
            in 1..100 -> {
                for (i in 0 until tripValue) {
                    tripSinceMaintenance = i + 1
                    Log.d(TAG, " $tripSinceMaintenance Car is driving")
                    isDriving
                    needsMaintenance = false
                }

            }
            else -> {
                for (i in 100 until tripValue) {
                    tripSinceMaintenance = i + 1
                    Log.d(
                        TAG,
                        "Trip value since maintenance is $tripSinceMaintenance , car needs maintenance"
                    )
                    isDriving
                    needsMaintenance = true
                }
            }
        }

    }

}

