import java.util.*
import kotlin.random.Random
/**
 * Rock Paper Scissors Game
 *
 * Create a random function that will spit out a string from a list
 *
 * Capture the string to be used in a logic function
 *
 * Create a logic function that will hold the game input and compare to player input
 *
 * Declare a winner
 */

fun main (args: Array<String>) {

    val gameInput = listOf<String>("Rock","Paper","Scissors")
    val gameNumber = gameInput.random() // Random game input

//    val rockCheck = gameChecker.contentEquals("Rock",ignoreCase = true)
//    val rockOut = rockCheck.toString()
    //println(gameNumber)
    println("\n")
    val rockVal = "rock"
    val paperVal = "paper"
    val scissorsVal = "scissors"
//    fun game (playerInput: String){
//        when (playerInput) {
//            gameChecker -> println("$gameChecker\nWe both Picked $gameChecker")
//            gameChecker.lowercase() -> println("$gameChecker\nWe both Picked $gameChecker")
//            gameStr == rockVal -> println("test")
//            else -> {
//                println("Logic Failed")
//            }
//        }
//    }

//    fun game (PlayerInput: String) {
//         if (PlayerInput == gameChecker || PlayerInput == gameChecker.lowercase()) {
//             println("Player: $PlayerInput \nGame: $gameChecker \nWe both picked $gameChecker")
//         }else if (PlayerInput == rockVal || PlayerInput == rockVal.lowercase()  && gameChecker == paperVal) {
//             println("Player: $PlayerInput \nGame: $gameChecker \nPaper beats Rock you LOSE!!!")
//         }else if (PlayerInput == rockVal || PlayerInput == rockVal.lowercase() && gameChecker == scissorsVal) {
//             println("Player: $PlayerInput \nGame: $gameChecker \nRock beats Scissors you WIN!!!")
//         }else {
//             println("LogicFailed")
//         }
//    }

    fun game (PlayerInput: String) {
        val pInput = PlayerInput.lowercase()
        val gInput = gameNumber.lowercase()
        val pReturn = PlayerInput.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

        if (pInput == gInput) { // Same Answer Logic
            println("Player: $pReturn \nGame: $gameNumber \nWe both picked $gameNumber")
        }else if (pInput == rockVal && gInput == paperVal) {
            println("Player: $pReturn \nGame: $gameNumber \nPaper beats Rock you LOSE!!!")
        }else if (pInput == rockVal && gInput == scissorsVal) { // Player Rock logic
            println("Player: $pReturn \nGame: $gameNumber \nRock beats Scissors you WIN!!!")
        }else if (pInput == paperVal && gInput == rockVal) {
            println("Player: $pReturn \nGame: $gameNumber \nPaper beats Rock you WIN!!!")
        }else if (pInput == paperVal && gInput == scissorsVal) { // Player Paper logic
            println("Player: $pReturn \nGame: $gameNumber \nScissors beats Paper you LOSE!!!")
        }else if (pInput == scissorsVal && gInput == paperVal) {
            println("Player: $pReturn \nGame: $gameNumber \nScissors beats Paper you WIN!!!")
        }else if (pInput == scissorsVal && gInput == rockVal) { // Scissors logic
            println("Player: $pReturn \nGame: $gameNumber \nRock beats Scissors you LOSE!!!")
        }else { // Error
            println("LogicFailed")
        }
    }




    game("Scissors")
}
