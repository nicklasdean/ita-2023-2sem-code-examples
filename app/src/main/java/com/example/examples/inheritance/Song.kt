package com.example.examples.inheritance

class Song(title: String, artist: String, lengthInMs: Int) {
    val lengthInMS: Int = lengthInMs;
    val lengthInMinutes : Int get() {
        return lengthInMS / 1000
    }
}

fun main() {
    val hella = Song("Hella", "Ukendt Kunstner", 4000);
    val happy = Song("Happy", "Pharell", 4250);
    val night = Song("Night", "Benga", 4500);
}