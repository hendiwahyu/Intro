package com.pinteraktif.intro

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var tittle: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tittle = findViewById(R.id.tittle_tv)
        button = findViewById(R.id.main_btn)


        button.setOnClickListener {
            tittle.visibility = View.VISIBLE
        }
        songAttributes()
        collections()
        fizzBuzz()

        //functions Homework
        val genre = genreSong("Pop Rock")
        val artist = artistSong("Michael Jackson")
        val year = yearSong(1991)
        Log.d(TAG, "Genre = $genre")
        Log.d(TAG, "Artist name = $artist")
        Log.d(TAG, "Year release = $year")

        //Primary Constructor
        val person = Person("Joe", 21)

        val t_shirt = Clothing("t-shirt", 10)
        t_shirt.washClothing()
        val isClean = t_shirt.isClean

        //Secondary Constructor
        val clothSecCons = Clothing("Pajama", 10, isClean= true )

        //SubClassing and SuperClassing
        val sneakers = ShoesWithLaces("sneakers", 10)
        val sneakerName = sneakers.laceShoes("adidas")

        if(sneakers.areLacesClean){
            Log.d(TAG, "$sneakerName is clean")
        }

        //Homework Classes and Objects

        val camryCar = Cars("Toyota", "Camry Sedan ", 2013, 1500 )
        camryCar.cars(0)

        val jeepWrangler = Cars("FCA US LLC", "Jeep Wrangler", 2020, 2034 )
        jeepWrangler.cars(70)

        val coupeMercedes = Cars("Mercedes Benz", "Coupe Mercedes", 2019, 2045)
        coupeMercedes.cars(120)

    }




}