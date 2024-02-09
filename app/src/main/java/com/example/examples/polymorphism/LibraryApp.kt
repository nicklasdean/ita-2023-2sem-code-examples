package com.example.examples.polymorphism

import kotlin.time.measureTimedValue

fun main() {
    val book : Book = Book(123, "Lord of the rings", "J.R.R Tolkien");
    val book2 : Book = Book(125, "Lord of the rings", "J.R.R Tolkien");
    val book3 : Book = Book(126, "Lord of the rings", "J.R.R Tolkien");

    val boardGame1 : BoardGame = BoardGame("chess","ads");
    val boardGame2 : BoardGame = BoardGame("dogchess","asdads");

    val products : List<MediaProduct> = listOf<MediaProduct>(book, book2, book3, boardGame1, boardGame2);

    for(product : MediaProduct in products){
        product.lend()
    }
}