/**
 * Functions
 *
 * Functions are self contained pieces of code that accomplish specific tasks.
 * Functions can be used to take in data, process it and return a result
 * Functions can be used as many times as you like
 * functions can be used inside other functions
 */

fun main(args: Array<String>) {

    val vader = "Darth Vader"

    fun forceChoke() { // Creating the function force choke
        println("You have failed me for the last time...")// this function will print this when called
    }

    forceChoke()// calling of function

    /**
     * Arguments
     * Arguments are used to provide extra information to the function
     * Arguments are variables that are used only within the function
     */

    fun makeAnEntrance(line: String) { // line is an argument and string is a declaration of data type
        println(line) // Here I am stating what the function does when called which is printing a string
    }
    makeAnEntrance("\nI find your lack of faith disturbing")
    // Calling the function makeAnEntrance then added the string parameter that i allowed for in the function


    //  makeAnEntrance(8) running this would result in an error as i have stated that the type must be a string

    //  fun makeAnEntrance(line: Int) {
    //      println(line)

    //  If I wanted to run the function use 8 I would need to change the data type to Int as I have done above


    fun calNumGG(rebels: Int, ewoks: Int): Int{
        // : Int at the end of my function means I want the function to return an integer back to me
        val goodGuy = rebels + ewoks
        // This val is made within a function so it only exists within the function
        // I could use the same val name in another function and it wouldn't have any relation to this one
        return goodGuy
    }
    println("\n" +calNumGG(8,9)) // Printing Function calNumGG
    val rebelCount = calNumGG(8,9) // Assigning function to Variable
    println("\n$vader faced of against $rebelCount rebel scum") // Calling function using val
    println("\n$vader faced of against ${calNumGG(8,9)} rebel scum") // Calling function directly
    // Vader is a variable made in the main function so it is usable in other sections of code and is immutable

    fun vadersF(mood: String = "Angry") { // Here I have set Angry as the default value for Mood
        println("\n"+mood)
    }
    vadersF() //Return Angry as that is the default I set
    vadersF("Good")// Returns good as the default is mutable so can be changed
}