fun main (args: Array<String>) {

//    fun evenOrOdd(number: Int): String {
//        return when {
//            number % 2 == 0 -> {
//                "Even"
//            }
//            else -> {
//                "Odd"
//            }
//        }
//    }
//
//    fun opposite(number: Int): Int {
//        val doubler = number * 2
//        return number - doubler
//    }
//
//
//    fun numberToString(num: Int): String {
//        return num.toString()
//    }

    fun sum(numbers: IntArray): Int {
        var sums = 0
        for (numbs in numbers) {
            if (numbs >= 0) {
                sums += numbs
            }
        }
        return sums
    }


}















