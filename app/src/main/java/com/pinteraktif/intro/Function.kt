package com.pinteraktif.intro

fun genreSong(byGenre: String): String {
    var genreAttribute = " "
    if (byGenre.isNotEmpty()) {
        genreAttribute = byGenre
    }
    return genreAttribute
}

fun artistSong(byArtist: String?): String {
    var artistName = " "
    if (byArtist != null) {
        artistName = byArtist
    }
    return artistName
}

fun yearSong(byYear: Int?): Int? {
    return byYear
}



