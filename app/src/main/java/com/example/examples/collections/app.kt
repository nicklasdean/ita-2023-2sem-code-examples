package com.example.examples.collections

fun main() {
    //Working with indices
    val numbers: IntArray = intArrayOf(10,20,30,40,50,60);
    for(number in numbers.indices){
        //println(number);
    }

    //A list of strings that can be sorted

    //A HashMap example with country & number of citizens
    val phonebook: HashMap<String, Int> = HashMap<String, Int>();
    phonebook.put("Nicklas", 20436262);
    phonebook.put("Jakob", 12345678);
    phonebook.put("Behu", 87654321);
    phonebook.put("Kasper", 12121234);


    val pulpFictionCast: HashSet<String> = hashSetOf(
        "John Travolta", "Uma Thurman", "Samuel L. Jackson","Quentin Tarantino",
        "Bruce Willis", "Harvey Keitel", "Tim Roth", "Amanda Plummer"
    )

    // "Kill Bill: Volume 1" cast
    val killBillVolume1Cast: HashSet<String> = hashSetOf(
        "Uma Thurman", "Lucy Liu", "Vivica A. Fox",
        "Daryl Hannah", "Michael Madsen", "David Carradine", "Quentin Tarantino"
    )

    //Intersection
    val intersect: Set<String> = pulpFictionCast.intersect(killBillVolume1Cast);
    println(intersect);

    //Difference (subtract)

    //Getting an element
}