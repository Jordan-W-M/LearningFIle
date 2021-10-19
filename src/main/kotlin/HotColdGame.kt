import kotlin.random.Random

/**
 * Hot Cold Game
 *
 * Requirements
 *
 * Create a number generator
 *
 *
 * Create function to interact with game input
 * Build function logic using number ranges
 */

fun main(args: Array<String>) {

    //val numsG = 1 until 101

    //for (nums in numsG) {
    //println(nums)
    //}

    //fun IntRange.random() = (Math.random() * ((endInclusive + 1) - start) + start).toInt()

    //val numsG = Random.nextInt(101)

//    fun gameNums() {
//        var numsG = Int
//        if (numsG in 0..101) {
//            println(numsG)
//        } else {
//            var numsG = Random.nextInt(101)
//        }
//        gameNums()
//    }

    //val numsG = Random.nextInt(101)





//        val testNums = listOf<Int>(Random.nextInt(10))
//        var testNum = testNums.iterator()
//
//        for (nums in testNum) {
//            if (nums == 5) {
//                break
//            }else {
//                println(nums)
//
//
//            }
//            println(nums)
//
//        }



    /**
     * Button
     */
    fun numGen() {
        return println(Random.nextInt(101))
    }
    numGen() // Can Be used to generate Number for Game

    val gameInput = 22 // The number the game uses

    fun game(player: Int){
        val vW = "Very Warm"
        val vC = "Very Cold"
        val wW = "Warm"
        val cC = "Cold"
        val gW = "Congrats"
        when {
            gameInput + 20 <= player -> {
                println("\n$vC")
            }
            gameInput - 20 >= player -> {
                println("\n$vC")
            }
            gameInput + 10 <= player -> {
                println("\n$cC")
            }
            gameInput - 10 >= player -> {
                println("\n$cC")
            }
            gameInput + 5 <= player -> {
                println("\n$wW")
            }
            gameInput - 5 >= player -> {
                println("\n$wW")
            }
            gameInput +1 <= player -> {
                println("\n$vW")
            }
            gameInput -1 >= player -> {
                println("\n$vW")
            }
            gameInput == player -> {
                println("\n$gW $gameInput was the correct number")
            }
            else -> {
                println("Fail")
            }
        }
    }
    game(24)
}

