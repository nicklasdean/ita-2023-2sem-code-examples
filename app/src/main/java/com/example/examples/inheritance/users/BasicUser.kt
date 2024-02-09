package com.example.examples.inheritance.users

class BasicUser (username: String, password: String) : User(username, password){

    override fun identifyYourself(){
        println("I am a basic user");
    }
}