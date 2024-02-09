package com.example.examples.inheritance.users

class AdminUser(username: String, password: String, email: String) : User(username, password){
    val email: String = email;

    override fun identifyYourself() {
        println("I am an admin user");
    }

    fun showStatistics() {
        println("I am now displaying some statistics")
    }
}