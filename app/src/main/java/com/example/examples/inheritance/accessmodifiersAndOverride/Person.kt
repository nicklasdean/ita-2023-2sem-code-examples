package com.example.examples.inheritance.accessmodifiersAndOverride

class Person(cpr: String, name: String, age : Int) {
    private val cpr: String = cpr
    val name: String = name
    // Age cannot be less than zero
    val age: Int = age;
}