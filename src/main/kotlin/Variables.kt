/**
 * Variables in Kotlin
 */

fun main() {

    //                                               Variables

    // Variables allow you to store different data types with different values under a name that can be used to call
    // back the information stored
    // This helps greatly improve coding efficiency and reduces mistakes

    // Variables come in two forms val and var
    // val is immutable which means the information within can not be changed without changing it manually
    // var is mutable meaning you can change it at any point but only to the same data type

    // If you know that the information being stored will not change then it's always better to use a val
    // as you don't risk the value being accidentally changed somewhere in the code

    // Var is very useful in its own right obviously for any variable that you know will be changed as well as a
    // multitude of uses for objects within a loop. A good example of this would be a counter where you add 1 to the
    // var everytime the code loops.
    //                                               Example

    println("\nLoop Example")
    var counter = 0
    while (counter != 5){
        counter += 1
        println(counter)
    }


    //                                               Example

    println("\nExample of var and val")
    val exampleOne = 5 // I can only change this one by finding where it's declared in the code and updating it
    println(exampleOne)
    var exampleTwo = 10
    println(exampleTwo)
    exampleTwo = 6 // Unlike with val I can freely change the var at any point in the code by declaring the variable
    // name and changing what it is equal to
    println(exampleTwo)
    // Something important to take note of here is the fact that only the bottom print changed. This is because code
    // is executed top down meaning any mention of the var before your changes will still hold the old value


    //                                               Example

    println("\nWhy variables are so useful")
    // A string that give you car information
    println("Car Color: red, Car Type: Audi r8, Price: 35")
    // You could write out the information like this each time you want it, but it would be much better to do this
    val carDetails = "Car Color: red, Car Type: Audi r8, Price: 35"
    // Now that the values are stored under the variable name you can just call back the information like this
    println(carDetails)
    // This is both faster and easier to fix if there was an error. Instead of having to go threw and update every
    // mention of the car details you could just change the information within the variable
    // which would update every place the variable is called




}