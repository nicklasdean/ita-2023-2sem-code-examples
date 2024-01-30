package classesAndObjects

class Dog (var stamina: Int, isHappy: Boolean,home: String, val energy: Int) {

    init {
        println("First initializer block that prints $stamina")
    }

    fun bark() {
        if(this.energy > 10) {
            println("WOOF WOOF");
        } else {
            println("woof");
        }
    }
}

class Cat () {
    var age: Int = 10;
}

class Rectangle (val height: Double, val width: Double ) {
    val area: Double
        get() {
            val area: Double = this.width * this.height;
            return area
        }

    var test = 0
        set(value) { field = 30};
}

class Recipe(title: String) {
    val ingredients: MutableList<String> = mutableListOf();
    private var steps: MutableList<String> = mutableListOf();

    fun addIngredient(ingredient: String) {
        ingredients.add(ingredient);
    }
}

class Lamp (isOn: Boolean = true) {
    var isOn: Boolean = isOn
        private set
    fun toggleLight() {
        if (this.isOn) {
            this.isOn = false
        }
    }
}

fun main() {
    val ski: Cat = Cat();

    // Exercise 1
    val skippy: Dog = Dog(1, true, "ballerup", 9);
    println(skippy.stamina);
    skippy.stamina = 10;
    println(skippy.stamina);
    val skippy2: Dog = Dog(1, true, "ballerup", 100);
    skippy.bark();

    val rectangle = Rectangle(4.3, 7.0);
    println(rectangle.area);
    rectangle.test = 10;
    println(rectangle.test); // 30
    rectangle.test = 10;
    println(rectangle.test);

    // Exercise 2
    val pancakeRecepy = Recipe("Pancake recepy")
    pancakeRecepy.addIngredient("asd");
    pancakeRecepy.addIngredient("asdasds");
    println(pancakeRecepy.ingredients);

    // Exercise 3
    val nightLamp = Lamp(true);
    println(nightLamp.isOn)
    nightLamp.toggleLight()
    println(nightLamp.isOn)
    val kitchenLamp = Lamp();
    val bathroomLamp = Lamp(false);

    var a:String = "";
    println(a)



}