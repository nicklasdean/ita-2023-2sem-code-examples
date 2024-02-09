package com.example.examples.accessmodifiers

fun main() {
    val nicklas : Person = Person("1506777777","Nicklas Frederiksen",33)
    nicklas.age = -34;

    println(nicklas.age);
}