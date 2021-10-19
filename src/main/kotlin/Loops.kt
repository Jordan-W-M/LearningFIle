/**
 * Loops
 *
 * A loop is a sequence of instruction's that is continually repeated until a certain condition is reached
 *
 * A While loop takes a condition and continues to run until its true
 *
 * Loops for Maps
 *When creating the variable name for the loop you can run 2 names and Kotlin will know that the first name is
 * for the Key and the second name is for the value
 * It will be written like this for ((Key,Value) in Map)
 */

fun main(args: Array<String>) {

    val loopNames = arrayListOf("Jordan" , "Natalie" , "Terry" , "Jamie" , "Lewis" , "Adam")

    val loopFood = hashMapOf("Chinese" to "Orange Chicken" , "Italian" to "Pizza" , "American" to "Burgers" ,
    "British" to "Fish and chips" , "Japanese" to "Sushi")

    for (names in loopNames) {
        println("My name is $names")
    } // This loop will return My name is followed by each name in the arraylist individually

    println("\n")

    for (keys in loopFood) {
        println(keys)
    }// Returns each individual Key Value Pair

    println("\n")

    for ((location, food) in loopFood) {
        println("When I was in $location I ate $food")
    }

    var numbs = 10

    while (numbs > 0 ) { // While numbs is greater than 0 this loop will run
        println("\nCount Down: ${numbs--}") // -- means take away one and as its a loop it will keep taking away one

    }

    while(numbs <= 20) { // While numbs is Lesser than or equal to 20 this loop will run
        println("Counting to 20: ${numbs++}") // ++ means add one for each loop
    }// numbs was originally 10 but the first while loop took it to zero so the next loop will start at 0 and not 10


}