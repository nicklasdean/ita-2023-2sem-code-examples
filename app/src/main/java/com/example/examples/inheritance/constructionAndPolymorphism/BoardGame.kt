package com.example.examples.inheritance.constructionAndPolymorphism

class BoardGame(id: Int, title: String, publisher: String) : MediaProduct(id){
    val title : String = title;
    val publisher : String = publisher;
}