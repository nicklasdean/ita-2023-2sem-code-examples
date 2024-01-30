package com.example.examples.lambdaexpressions

fun main() {

}

//Filtering a list of numbers with a function reference

//Filtering a list of numbers with an anonymous lambda function


// Higher order function example: Calculator
// This is the higher order function that takes a function as parameter (2 ints and returns an Int)
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
fun add(x: Int, y: Int): Int {
    return x + y
}
fun subtract(x: Int, y: Int): Int {
    return x - y
}
fun multiply(x: Int, y: Int): Int {
    return x * y
}