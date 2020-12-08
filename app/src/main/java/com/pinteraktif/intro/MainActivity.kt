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

    }



}