package com.example.examples.collections

class Product (title: String, productNumber: Int, price: Int) : Comparable<Product>{
    val title: String = title;
    val productNumber: Int = productNumber;
    val price: Int = price;

    override fun compareTo(other: Product): Int{
        if(this.price > other.price){
            return 1;
        }
        else if(this.price < other.price){
            return -1;
        }
        else{
            return 0;
        }
    }

    override fun toString(): String {
        return title + " " + price;
    }
}

fun main() {
    val list: List<String> = arrayListOf("A","C","D","A");
    //println(list.sorted());

    val product: Product = Product("iPod Nano", 1, 500);
    val product2: Product = Product("Grim jakke", 2, 1);
    val product3: Product = Product("Grøn jakke", 3, 200);
    val product4: Product = Product("Ræv jakke", 4, 100);
    val product5: Product = Product("Rød jakke", 5, 100000000);

    val productList: List<Product> = listOf(product, product2, product3, product4, product5);

    println(productList.sorted());
}