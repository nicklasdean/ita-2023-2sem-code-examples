package com.example.examples.accessmodifiers

class Person(cpr: String, name: String, age: Int) {
    private val cpr: String = cpr
    val name: String = name
    private var _age : Int = age;

    // Age cannot be less than zero
    var age: Int
        get(){
            return _age;
        }
        set(value: Int){
            if(value > 0){
                _age = value
            }
            else{
                println("Invalid value");
            }
        }
}