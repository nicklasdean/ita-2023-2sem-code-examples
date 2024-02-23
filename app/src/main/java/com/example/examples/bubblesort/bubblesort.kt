package com.example.examples.bubblesort

fun bubbleSort(array: IntArray) {
    val n = array.size
    for (i in 0 until n) {
        for (j in 0 until n - 1) {
            if (array[j] > array[j + 1]) {
                //Swapping elements manually
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}

fun main() {
    val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90)
    bubbleSort(arr)
    println("Sorted array:")
    for (element in arr) {
        print("$element ")
    }
}