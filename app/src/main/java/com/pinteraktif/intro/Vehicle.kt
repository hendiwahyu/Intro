package com.pinteraktif.intro

open class Vehicle(var make : String, var model: String, var year: Int, var weight: Int ) {

    var needsMaintenance: Boolean = false
    var tripSinceMaintenance: Int = 0

    constructor(make:String, model: String, year: Int, weight: Int, drive: Boolean, stop: Boolean ) : this(make, model, year, weight){

    }



}