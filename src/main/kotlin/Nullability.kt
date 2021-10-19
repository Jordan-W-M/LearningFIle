/**
 * Nullability
 *
 * If you are sure a variable isn't in the null state you can run !! instead of doing the other checks mentioned below
 * You need to be 100% sure it's not set to null as that will crash your application
 *
 * A variable can only be null if its explicitly stated that it can be
 * If it is not explicitly stated then the variable can never be null
 *
 * To state something can be null you declare the object type followed by a question mark
 * Example: var test: String? = "This can now be null"
 *
 * In computer programming, null is both a value and a pointer. Null is a built-in constant that has a value of zero.
 *
 * Variables that accept null won't allow for methods unless a check is done to make sure the variables isn't currently
 * set to null
 * You can check using an if statement (variable != null)
 * You can also check using a safe call operation variable?.method
 * You can also check using the Elvis Operator variable.method? ?:
 *
 * The Elvis Operator works like an if else statement so in the example above if the variable was set to null
 * you input what you want to be returns after the ?:
 */

fun main (args: Array<String>) {

    var name:String = "Jordan"
    //name = null // This variable is non-nullable as I never stated it could be

    var pain: String? = "Life is pain" // String Variable that accepts null
    println(pain)

    //println("\n${pain.length}")// this won't work because I haven't checked if it's set to null

    var nullBoi: String? = "This is a good null boi"
    var badNullBoi: String? = null

    //Null Checker
    if (nullBoi != null) {
        println("\n${nullBoi.length}")
    }else{
        println("This var is set to null")
    } // Now that I have checked using an if statement that the variables is not set to null I can use methods

    //Null Checker
    if (badNullBoi != null) {
        println("\n${badNullBoi.length}")
    }else {
        println("\nThis variable is set to null")
    } // This check will return the else statement as the variables is set to null

    var nullTest: String? = null
    //Null Checker
    if (nullTest != null) {
        println("\n${nullTest.length}")
    }else {
        nullTest = "This is now a string"
        println("\n${nullTest.length}")
    }// Here I have Checked if the variable is set to null and as it is I have given an else statement that
    // changes the variables into a string

    var nullSimp: String? = "This is a simplified null checker"
    var nullSimp2: String? = null
    if(nullSimp != null) println(nullSimp.length) else println("This var is null")
    // Here I have written a null checker in its simplest form
    // It's also a lot clearer to read like this

    println("\n${nullSimp?.length}")// This is a safe call operation it will return the method or the word null
    // depending on the state of the variable

    println("\n${nullSimp2?.length ?: "This is set to null"}")
    // This is the Elvis Operator it works like the if statement

    var crashBoi: String? = "I ain't gonna crash"
    println("\n${crashBoi!!.length}")
    crashBoi = null
    //println("\n${crashBoi!!.length}") This will crash as it is set to null









}