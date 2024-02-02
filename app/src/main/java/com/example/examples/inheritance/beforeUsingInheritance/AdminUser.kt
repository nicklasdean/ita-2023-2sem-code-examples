package com.example.examples.inheritance.beforeUsingInheritance

class AdminUser(username: String, email: String, password: String) {
    val username:String = username;
    val email:String = email;
    private val password:String = password;
    fun generateRandomPassword(length: Int): String {
        //It is not important to understand this code in depth - it serves as an example
        val allowedChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
    fun showStatistics(){
        println("I am now displaying some statistics")
    }
}