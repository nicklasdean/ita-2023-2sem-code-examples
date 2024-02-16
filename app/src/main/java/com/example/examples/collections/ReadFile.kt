package com.example.examples.collections

import java.io.File

fun main() {
    val countriesFile: File = File("app/src/main/java/com/example/examples/collections/countries");
    val countriesAsList: List<String> = countriesFile.readLines();
    for(line in countriesAsList){
        val lineAsList: List<String> = line.split(";");
        println(lineAsList.get(1));
    }
}