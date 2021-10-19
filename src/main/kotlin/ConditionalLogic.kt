/**
 * Conditional Logic
 * Allows your program to make decisions based on conditions being met
 *
 * if, else and else if statements
 *
 * If is used to declare that you want something to happen if a condition is met
 * else if is used to declare extra conditions after the if statement
 * The else if statement will only be triggered if its conditions are met
 * else is used as the final condition if all others arent met
 * else statements can have if and else if statements nested allowing for further conditions
 *
 *
 *
 * == Is used to check for equality between the declared variables
 * If both values are the same you will get the boolean result of true and if they are not you will get false
 *
 * != Is used to check for inequality between the declared variables
 * If both values are different you will get the boolean result of true and if they are the same you will get false
 *
 * || Two pipes is used for "or"
 *
 * && Is used to say and
 *
 * Greater > Lesser
 * Lesser < Greater
 * Greater or Equal >= Lesser or Equal
 * Lesser or Equal <= Greater or Equal
 */

fun main(args: Array<String>) {

    val a = 2
    val b = 2
    val c = 4

    println(a == b) // Will print the boolean true as they are equal
    println(a == c) // Will print the boolean false as they aren't equal
    println(a != c) // Will print the boolean true as they aren't equal

    if (a == b) { // I am telling Kotlin that if A and B are equal I want it to do something
        println("\nA is equal to B")// If A and B are equal this will be printed
        // They are equal so the string will be printed
    }

    if (a != b) { // I am telling Kotlin that if A and B are not equal I want it to do something
        println("\nA and B are not Equal") // If A and B are not equal this will be printed
        // They are equal so nothing will be printed
    }

    if (a != c) { // I am telling Kotlin that if A and C are not equal I want it to do something
        println("\nA and C are not Equal") // If A and C are not equal this will be printed
        // They aren't equal so the string will print
    }

    val accountBalance = 100
    val price = 50
    val newPrice = 100

    if (accountBalance > price) { // If accountBalance is greater than price do something
        println("\nYou can Afford it") // If accountBalance is greater than price this will be printed
    } else { // If the condition isn't met do this
        println("\nYour Broke")

    }

    if (accountBalance < price) { // If price is greater than accountBalancer do something
        println("\nYou can Afford it") // if price is greater than accountBalance this will be printed
    } else { // If the condition isn't met do this
        println("\nYour Broke") // This will print out because the if condition was not met
    }

    if (accountBalance >= newPrice) { // >= Means greater than or equal to
        println("\nBuy it") // Both are equal to another so the string will be printed
    }

    val degrees = 70

    if (degrees == 60) {
        println("\ndegrees is equal to 60")
    }else if (degrees < 30) {
        println("\nThe temperature is below 30 degrees")
    }else if (degrees >= 80) {
        println("\nThe temperature could be 80 or more")
    }else if (degrees > 60 && degrees <= 75) { // && means and
        println("\nThe temperature is between 60 and 75")
    }else {
        println("\nI don't know the temperature")
    }

    if (degrees == 60) {
        println("\nDegrees is equal to 60")
    }else if (degrees in 80 until 90) { // I am using in and until to give a range of numbers
        println("\nDegrees is between 80 and 90")
    }else if (degrees in 70 until 80) { // val degrees is 70 so this is the correct range
        println("\nDegrees is between 70 and 80")
    }else if (degrees in 60 until 70) { // This is also the correct range but it won't print because its below
        //  the other correct answer
        println("\nDegrees is between 60 and 70")
    }else if (degrees in 50..60){ // Here I am doing the same as above just written differently
        println("\nDegrees is between 50 and 60")
    }else{
        println("\nFail")
    }

    /**
     * Boolean Conditional Logic
     *
     * Can be very helpful for triggering events based on the current state of a given variable
     */

    val fatty = true
    val hungry = false

    if (fatty == false || hungry == true) { // Using || to say if one condition OR the other is true do something
        println("\nGet some food")
    }else if (fatty == true || hungry == true) {
        println("\nIts time for a diet")
    }else {
        println("\nYou aren't hungry")
    }

    val redPaint = true
    val bluePaint = false
    val greenPaint = true

    if (!redPaint || bluePaint) {
        println("\nWe have blue paint but no red")
    }else if (!redPaint || !greenPaint) {
        println("\nWe dont have any red or green paint")
    }else if (redPaint || !bluePaint || greenPaint) {
        println("\nWe have red and green paint but no blue")
    }else {
        println("\nThis isn't a paint shop")
    }
    // Above I have written two different boolean logic statement using two different methods but asking the same thing
    // For the first one I wrote out the full line of is val == boolean value
    // for the second one I wrote the same thing but used ! at the start of the val to indicate false
    // and nothing at the start of the val to indicate true
    // The second method is faster but I do find the first method slightly more readable

    /**
     * When Statements
     *
     * When statements work similar to if statements and are often used to replace longer if statements
     * When statements are a good way to check threw multiple options for 1 variables
     *
     * -> is used at the end of each condition in a when statement
     */

    val x = 1

    when (x) { // X is the variable that will be checked threw with the statements below
        1 -> println("\nX has the value of 1") // I am asking if x == 1
        2 -> println("\nX has the value of 2")
        3 -> println("\nX has the value of 3")
        else -> {
            println("\nX value is unknown")

        }        }

    val gameInput = 60
    val playerInput = 100

    when (gameInput) { // GameInput will be checked against playerInput
        playerInput - 20 -> println("\nPlayer input is 20 ahead of game input")
        playerInput - 30 -> println("\nPlayer input is 30 ahead of game input")
        playerInput - 40 -> println("\nPlayer input is 40 ahead of game input")
        playerInput - 50 -> println("\nPlayer input is 50 ahead of game input")
        else -> println("\nFail")
        // Kotlin doesn't need to be told that im checking if they are equal as long as both values are the same
        // Kotlin will deem that line has met the condition to run
    }

    fun vaderFeeling (Mood: String = "Angry") { // fun for Vader's mood
        if (Mood == "Angry") { // Angry set as base value
            println("\nRun as fast as you can, Lord Vader is $Mood")
        }else if (Mood == "Happy" || Mood == "happy" ) { // Used or here so that both cases of happy are accepted
            println("\nWe are safe Lord Vader seems Happy")
        }else {
            println("\nAll hale Lord Vader")
        }
    }

    vaderFeeling() // Runs first statement as base value is == Angry
    vaderFeeling("happy") // Runs second statement as value has been changed to happy
    vaderFeeling("Sexy") // Runs else as there is no condition for the input sexy 


}