package com.example.examples.lambdaexpressions

fun main() {
}


//Filtering a list of numbers with function reference
fun filterWithFunction(): Unit {
}


//Filtering a list of numbers with an anonymous lambda function
fun filterWithLambda() {

}

// Higher order function example: Calculator
// This is the higher order function that takes a function as parameter (2 ints and returns an Int)
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    val result: Int = operation(x, y);
    return result;
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun subtract(x: Int, y: Int): Int {
    return x - y
}