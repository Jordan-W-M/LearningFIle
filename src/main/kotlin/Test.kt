import kotlin.random.Random
import kotlin.random.nextInt

fun main (args: Array<String>) {
//    fun game(pInput: Int) {
//        val gInput = 50
//        val rangeL = 60
//        val rangeC = 55
//        val rangeCC = 52
//        val rangeS = 40
//        val rangeSS = 45
//        val vC = "Very Cold"
//        val cC = "Cold"
//        val vW = "Very Warm"
//        val wW = "Warm"
//        val win = "Winner"
//        val ohNo = "Oooooooof"
//
//        return if (pInput in (gInput + 20) until 90) {
//            println(vC)
//        }else if (pInput in 30 downTo 10) {
//                println(vC)
//        }else if (pInput in (gInput + 10) until 70) {
//            println(cC)
//        }else if (pInput in 40 downTo 30) {
//            println(cC)
//        }else if (pInput in (gInput + 1) until 55) {
//            println(vW)
//        }else if (pInput in (gInput + 5 ) until 60) {
//            println(wW)
//        }else if (pInput in 45 downTo 30) {
//            println(wW)
//        }else if (pInput in 49 downTo 45) {
//            println(vW)
//        }else if (pInput == gInput) {
//            println(win)
//        } else {
//            println(ohNo)
//        }
//
//    }
//    game(50)

//        val testNums = listOf<Int>(Random.nextInt(100))
//        var testNum = testNums.iterator()
//
//        for (nums in testNum) {
//            if (nums == nums) {
//                println(nums)
//                break
//            }else
//            println("fail")

    val gameLogicLst = 1..3
    val test = Random.nextInt(gameLogicLst)
    println(test)
}