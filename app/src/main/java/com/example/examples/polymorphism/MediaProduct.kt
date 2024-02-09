package com.example.examples.polymorphism

import kotlin.random.Random

open class MediaProduct() {
    val id = generateId();

    fun lend(): Unit{
        println("This is the lend function")
    }

    private fun generateId() : Int {
        println("This is the generateId function")
        return Random.nextInt(1, 11);
    }
}