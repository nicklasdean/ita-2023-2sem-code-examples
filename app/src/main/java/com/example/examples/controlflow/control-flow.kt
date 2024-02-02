package com.example.examples.controlflow

fun main() {
    println("Hello World");
}

//A function that determines whether a person is above 18 and is a member
fun isAdultAndMember(age: Int, member: Boolean): Boolean {
    if (age >= 18 && member == true) {
        return true;
    }
    return false;
}

//A function that determines the season
fun season(): Unit {
    println("Enter season");
    val input: Int = readln().toInt();
    when (input) {
        12, 1, 2 -> {
            println("Winter");
        }
        3, 4, 5 -> {
            println("Spring");
        }
        6, 7, 8 -> {
            println("Summer");
        }
        9, 10, 11 -> {
            println("Fall");
        }
        else -> {
            println("Invalid input");
        }
    }
}

//A function that displays an iterative loop
fun loop(): Unit {
    for (i in 1..5) {
        println(i);
    }
}

//Finding the sum of a list of numbers
fun sum(): Int {
    val list: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8);

    var sum: Int = 0;
    for (number: Int in list) {
        sum += number;
    }
    return sum;
}