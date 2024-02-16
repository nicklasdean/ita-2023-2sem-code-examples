package com.example.examples.twosum

class App {

}

fun main() {
    val twoSum: IntArray = twoSum(7, intArrayOf(1, 2, 3, 4, 5, 7));
    for (value in twoSum) {
        println(value)
    }
}

fun twoSum(target: Int, numbers: IntArray): IntArray {
    var first: Int = 0;
    var second: Int = 0;

    for (index in numbers.indices) {
        for (anotherIndex in numbers.indices) {
            if (index + anotherIndex == target) {
                first = index;
                second = anotherIndex;
            }
        }
    }
    return intArrayOf(first, second);
}

fun twoSumHashMap(target: Int, numbers: IntArray): IntArray {
    val map : HashMap<Int,Int> = HashMap<Int,Int>();
    var first: Int? = 0;
    var second: Int = 0;

    for (idx in numbers.indices){
        val secondOperator = 7 - numbers[idx];

        if(map.containsKey(secondOperator)){
            first = map[secondOperator];
            second = idx;
        }
    }

    return intArrayOf(1,2);
}