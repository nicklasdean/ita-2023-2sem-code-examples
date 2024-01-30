package interfaceAbstract

abstract class Animal {
    abstract val name: String;
    abstract val size: Double;
    abstract fun makeSound();
}

class Elephant(
    override val name: String,
    override val size: Double
) : Animal() {

    override fun makeSound() {
        println("asd");
    }
}


interface Computer{
    val name: String;
    val price: Int;
    val location: Map<String, Double>;

    fun printLocation() {
        println("${this.name} is an amazing television");
    };
}

class Mobile(
    override val name: String,
    override val price: Int,
    override val location: Map<String, Double>
) : Computer {
    override fun toString(): String {
        return "Mobile(name='$name', price=$price, location=$location)"
    }
}

fun main() {
    val samsungS23 = Mobile("Samsung S23", 2333, mapOf("asd" to 23.2))
    //println(samsungS23)
    samsungS23.printLocation()
    val Elephant: Elephant = Elephant("Perter the elephant", 1000.0);

    // val Dog: Animal = Animal("Perter the elephant", 1000.0);
}