package com.example.examples.inheritance.users

open class User (username: String, password: String){
    val username: String = username;
    val password: String = password;

    open fun identifyYourself(){
        println("I am a User class");
    }
    fun generateRandomPassword(length: Int): String {
        //It is not important to understand this code in depth - it serves as an example
        val allowedChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}