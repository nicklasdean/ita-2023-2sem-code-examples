package com.example.examples.inheritance.inheritance

class AdminUser(username: String, password: String, email: String) {
    val username: String = username;
    val password: String = password;
    val email: String = email;

    fun generateRandomPassword(length: Int): String {
        //It is not important to understand this code in depth - it serves as an example
        val allowedChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        return (1..length)
            .map { allowedChars.random() }
            .joinToString("")
    }
    fun showStatistics() {
        println("I am now displaying some statistics")
    }
}