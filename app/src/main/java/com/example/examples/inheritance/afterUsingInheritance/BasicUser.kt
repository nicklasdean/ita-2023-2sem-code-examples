package com.example.examples.inheritance.afterUsingInheritance

class BasicUser (username: String, password: String){
    val username:String = username;
    private val password: String = password;
    fun generateRandomPassword(length: Int): String {
        //It is not important to understand this code in depth - it serves as an example
        val allowedChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
}