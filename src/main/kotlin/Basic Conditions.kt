import java.lang.management.PlatformLoggingMXBean

/**
 * Condition and Logic
 */

// Conditions and logic works as the brain of your code without them, you would just have a document with a bunch of
// unusable data

fun main() {

    var lives = 3
    if (lives < 1){
        println("Game Over")
    }
    // Here I am using an if statement that checks if a condition is met before doing and action
    // To improve this code you could add an else statement that tells you how many live you have left

    if (lives < 1){
        println("Game Over")
    } else {
        println("Player still has $lives lives left")
    }
    // You could add to this more if you wanted to give the player a different warning when they only have one life left

    lives = 1
    if (lives < 1) {
        println("Game Over")
    }else if (lives == 1) {
        println("Warning Last life REMAINING")
    }else {
        println("Player still has $lives lives left")
    }
    // When coding logic you want to be exhaustive and cover all the states you wish your object to be in
    // Being lazy with you logic can result in a lot of bugs for cases you haven't check for
    // Looking at the if statement above another way this could have been written is
    // if lives == 0 print Game Over
    // At first glance this seems fine as the game would end if the player reach zero lives
    // However what would happen if the player had 1 life and triggered something in the game that cost 3 lives
    // The player now has -2 lives and as the code only checks to see if the player is at zero he would still be able
    // to play. This is why using < was better as it covers every number under 1 life and ends the game.

    // Allowing input from the output screen
    println("\nHow old are you")
    val age = readLine()!!.toInt()
    println("\nI am $age years old")
    // The first print statement will print but the second one won't
    // Once an int is typed into the output window then the second print statement will appear
    // This happens because code is executed from top down so the condition of readLine needs to be met inorder for the
    // other lines of code to run

    val message: String
    if (age < 18) {
        message = "You are to young to drink"
        println(message)
    }else if (age >= 18) {
        message = "What drink would you like"
        println(message)
    } else {
        message = "Do you have an ID"
        println(message)
        }
    // Here I Have build out an if statement that will check if someone is old enough to drink based on the age
    // they provide
    // You can also see that you don't need to assign each different outcome to a different variable you can
    // instead have the logic itself dictate what the variable will represent based on the given input
    // You need to be exhaustive when doing this, or you will get an error when trying to run your code
    // This happens when it is possible within your logic to have the variable be assigned to nothing
    // A example of this would be if the else if was written like this
    // (age > 18) it would now be possible to have message be assigned to nothing if someone input 18 as 18
    // is not greater or lesser than itself. I avoided this by adding >= which means that it can be greater or equal
    // You can also avoid errors by adding an else statement that will be your final catch all if all other logic fails

}