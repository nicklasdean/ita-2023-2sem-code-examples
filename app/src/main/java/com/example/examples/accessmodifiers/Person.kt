package com.example.examples.accessmodifiers

class Person(cpr: String, name: String, age: Int) {
    val cpr: String = cpr
    val name: String = name

    // Age cannot be less than zero
    private var _age: Int = age;

    var age: Int = _age
        get() {
            return _age;
        }
}