package com.example.examples.polymorphism

class Book(isbn: Int, title: String, author: String) : MediaProduct(){
    val isbn: Int = isbn;
    val title: String = title;
    val author: String = author;

    fun verifyISBN() : Boolean{
        //Code that will verify the ISBN number of the book
        return false;
    }
}