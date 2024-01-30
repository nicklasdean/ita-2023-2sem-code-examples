package com.example.kotlin_intro



fun main() {
    // Exercise 1
    val age: Int = 30;
    val height: Int = 178;

    val rectHeight: Double = 8.5;
    val rectWidth: Double = 5.5;

    // Exercise 2
    createArea(rectHeight, rectWidth);
    
    // Exercise 3
    val name: String = "benjamin";
    println(name.uppercase())
    println(name.get(3))
    println(name.indexOf("j"))
    println(name + "asd");
    println("hello" == "ollhe")
    println("name" == "name")

    // Exercise 5
    val cars:MutableMap<String, String> = mutableMapOf("asd" to "23");
    cars["hej"] = "asd";
    cars.get("hej")

    // Exercise 4
    val prices: MutableList<Int> = mutableListOf(2,3,4,5);
    println(prices[1])

    prices.add(67);
    println(prices)

    println(secondLargest(prices))

    // Exercise 7
    print("Enter text: ")
    // val stringInput = readLine()!!
    // val halfOfNumber: Int = stringInput.toInt()/2
    // println("Half of your number is: $halfOfNumber")

    // Exercise 8
    computeStuff(8, 12);

    val isExpensive: Boolean = true;
    val height1: Double = 1.78;

    val array: Array<String> = arrayOf("asd", "hej");

    val max = {a:Int -> a + 1}
    println(max(8))
    val max2 = {a:Int, b:Int -> 100 }

    println(max2(33,4))
    val hundredLarger = {a:Int -> a + 100 }
    println(hundredLarger(10))

    // The code breaker
    val encodedArray = numberCypherEncoder("ben")
    println(encodedArray);

    println(numberCypherDecoder(encodedArray))
}

// Exercise 2
fun createArea(height: Double, width: Double) {
    val area = height * width;
    val perimeter = 2 * (height + width);
    println(area);
    println(perimeter);
}

//Exercise 4
fun secondLargest(list: MutableList<Int>): Int {
    list.sort();

    return list.get(list.size - 2);
}

fun computeStuff(a: Int, b:Int) {
    val sum = a + b;
    val diff = a - b;
    val product = a * b;
    val average = (a + b) / 2;
    val distance = Math.abs(a - b);
    val max = getMax(a, b);
    val min = getMin(a, b);
    println("sum: $sum, diff: $diff, product: $product, average: $average, distance: $distance, max: $max, min: $min")
}

fun getMax(a: Int, b:Int): Int {
    if (a > b) {
        return a;
    } else {
        return b
    }
}

fun getMin(a: Int, b:Int): Int {
    if (a < b) {
        return a;
    } else {
        return b
    }
}
val alphabeat = "abcdefghijklmnopqrstuvxyzæøå";
fun numberCypherEncoder(stringToDecode: String):MutableList<Int>  {
    var decodeList: MutableList<Int> = mutableListOf();
    for (character in stringToDecode) {
        val indexInAlphabeat = alphabeat.indexOf(character);
        decodeList.add(indexInAlphabeat + 1);
    }
    return decodeList;
}

fun numberCypherDecoder(codeList: MutableList<Int>): String {
    var decodedString = "";
    for (code in codeList) {
        decodedString += alphabeat[code - 1];
    }

    return decodedString;
}


