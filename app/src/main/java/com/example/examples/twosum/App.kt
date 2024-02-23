package com.example.examples.twosum

class App {

}

fun main() {
    val twoSum: IntArray = twoSumHashMap(7, intArrayOf(1, 2, 3, 4, 5, 6));
    println(twoSum);
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
    val result: IntArray = IntArray(2);

    for (idx in numbers.indices){
        val secondOperator = target - numbers[idx];

        if(map.containsKey(secondOperator)){
            result[0] = idx;
            result[1] = map.getOrDefault(secondOperator,0);
        }
        else{
            map[numbers[idx]] = idx;
        }
    }
    return result;
}