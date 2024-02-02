package com.example.examples.lambdaexpressions

//Filtering a list of numbers with function reference
fun filterWithFunction(): Unit {
    val list: List<Int> = listOf(1,2,3,4,5,6,7,8,9);
    val filteredList: List<Int> = list.filter(::howToFilter);
    println(filteredList);
}

fun howToFilter(number: Int) : Boolean{
    if(number > 5){
        return true;
    }
    else{
        return false;
    }
}


//Filtering a list of numbers with an anonymous lambda function
fun filterWithLambda() {
    val list: List<Int> = listOf(1,2,3,4,5,6,7,8,9);
    list.filter { it >= 6 }
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

fun product(x: Int, y:Int): Int{
    return x * y;
}

fun main() {
    println(calculate(6, 2) { x, y -> x / y });
}