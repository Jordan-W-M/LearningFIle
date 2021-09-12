/**
 * Algorithm practices
 */

import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.roundToInt

fun main (args: Array<String>) {

    /**
     * Create a function that turns a Int into a string
     */
    fun numberToString(num: Int): String {
        return num.toString()
    }

    fun numberToString2(num: Int) = num.toString() //This is the shorter way or writing the function

    /**
     * Create a function that removes the first and last character of a String
     */

    fun removeChar(str: String): String {
        val dString = str.drop(1)
        val reverseString = dString.reversed()
        val d2String = reverseString.drop(1)
        return d2String.reversed()
    }

    fun removeChar2(str: String) = str.drop(1).dropLast(1)// The shorter way of writing the function

    fun removeChar3(str: String): String = str.substring(1, str.lastIndex)  //Best answer for question

    val testString = "TheoVon"
    println(testString.substring(1, testString.lastIndex)) // testing method

    /**
     * Create a function that converts every character in a string to uppercase
     */

    fun makeUpperCase(str: String = "hello") = str.uppercase() //Best Answer

    println(makeUpperCase())

    /**
     * Create a function that multiples the Integers within an Array together
     */


    fun grow(arr: IntArray): Int {
        var multiplier = 1
        for (numbs in arr) {
            multiplier *= numbs
        }
        return multiplier
    }

    fun grow2(arr: IntArray): Int = arr.reduce { a, b -> a * b } //Best Answer

    val testArray = arrayListOf(1, 2, 3, 4, 5, 6)
    println(testArray.reduce { a, b -> a * b })
    //.reduce Accumulates value starting with the first element and applying operation from left to right
    // {a,b} Telling .reduce how it should view the elements
    // {a * b} Telling .reduce that I want it to multiple every element in the Array together

    /**
     * Create a function that repeats a String base on a Int input
     */

    val stringTester = "Jordan"
    println(stringTester.repeat(5))
    fun repeatStr(r: Int, str: String): String = str.repeat(r) //Best Answer

    /**
     * Create a function that counts from n to 1
     *
     * Come Back to this one
     */

    fun reverseSeq(n: Int) = (n downTo 1).toList() //Best answer


    /**
     * Create a function that checks if n is divisible by a and b
     */

    fun isDivisible(n: Int, x: Int, y: Int): Boolean = n % x == 0 && n % y == 0
    // Best answer


    /**
     * Create a function that takes an INT array and returns a range of possitive numbers starting at the end of the
     * array
     */

    fun evenNumbers(array: List<Int>, number: Int): List<Int> {
        val myList = arrayListOf<Int>()
        for (numbs in array.reversed()) {
            if (numbs % 2 == 0) {
                myList.add(numbs)
            }
        }
        val listReturn = myList.slice(0 until number)
        return listReturn.reversed()
    } // My answer

    fun evenNumbers2(array: List<Int>, number: Int) = array.filter { it % 2 == 0 }.takeLast(number)
    // The best possible answer. It's much shorter than my own and easier to read

    /**
     * Create a function that checks that Y input has the same first and last characters as x
     * Return Boolean true or false
     */

    fun feast(beast: String, dish: String): Boolean = beast.first() == dish.first() && beast.last() == dish.last()
    // Best Answer

    /**
     * Create a function that reverses a given string
     */

    fun reverseWords(str: String): String = str.split(" ").reversed().joinToString(" ")
    // Split is used to split each element in the string into its own string
    // Spaces are important when using split as "" will return every character as its own string
    // Whereas " " with one space in between the quotation marks you will return each word as its own string

    /**
     * Create a function that returns the smallest number in an array
     */


    fun findSmallestInt(nums: List<Int>) = nums.sorted().first() // My answer
    fun findSmallestInt2(nums: List<Int>) = nums.minOrNull() // Top answer on code wars but mine is fine

    /**
     * Create a function that checks if N can be divided into equal parts
     */

    fun divide(weight: Int): Boolean = weight % 2 == 0 && weight != 2 // Best answer

    /**
     * Create a function that returns a count of the positive numbers in an Array and the sum of the negative numbers
     */


//    fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> =
//        if (input != null)arrayOf(input.count { it >= 1 },input.filter {it <= -1}.sum()) else emptyArray()

    fun countPositivesSumNegatives(input: Array<Int>?): Array<Int> {
        val element = if (input != null) arrayOf(input.count { it >= 1 }, input.filter { it <= -1 }.sum())
        else emptyArray()
        return if (element.sum() == 0) emptyArray() else element
    } //Best answer

    /**
     * Create a function that returns a count of all the vowels is a string
     */

    fun getCount(str: String): Int {
        val element = str.split("")
        val returnList = arrayListOf<String>()
        for (strings in element) {
            when (strings) {
                "a" -> returnList.add(strings)
                "e" -> returnList.add(strings)
                "i" -> returnList.add(strings)
                "o" -> returnList.add(strings)
                "u" -> returnList.add(strings)
                else ->
                    arrayListOf<String>()
            }
        }
        return returnList.count()
    }// My answer

    fun getCount2(str : String) = str.count { it in "aeiou" }//Best possible answer

    /**
     * Create a function that takes n number and divides it by a given percentage until x threshold is hit
     */

    fun evaporator(content: Double, evap_per_day: Double, threshold: Double): Int {
        var remainingFoam = content
        var counter = arrayListOf<Double>()
        while (remainingFoam >= (content * (threshold / 100))){
            remainingFoam *= (1 - (evap_per_day / 100))
            counter.add(remainingFoam)
        }
        return counter.count()
    }

    /**
     * Two red beads are placed between every two blue beads. There are N blue beads.
     * Create a function that takes the blue beads and works out the amount of red ones
     */

    fun countRedBeads(nBlue: Int): Int = if (nBlue < 2) 0 else (nBlue -1) * 2 // Best answer


    /**
     * Create a function that takes n number converts it to binary then changes x number in the binary to zero and
     * returns the new number
     */

    fun killKthBit2(n: Int, k: Int): Comparable<*> {
        val string =  Integer.toBinaryString(n)
        return if (n > 0)string.substring(0, k) + 6 + string.substring(k + 1) else 0

    }

    fun killKthBit4(n: Int, k: Int): Int =  if (n.toString(2).length < k) n
    else Integer.parseInt(Integer.toBinaryString(n).substring(0,k) + 0 +
            Integer.toBinaryString(n).substring(k + 1),2)
    // My first answer im not sure why it didn't work

    fun killKthBit(n: Int, k: Int): Int =
        if (n.toString(2).length < k) n else
            (StringBuilder(n.toString(2)).also{ it[it.length - k] = '0'}).toString().toInt(2)
    // This was my second answer and it ran fine


    /**
     * Create a function that turns a positive and negative numbers into there opposite
     */

    fun makeNegative(x: Int): Int = if (x > 0) x.inv() + 1 else x // My answer

    fun makeNegative2(x: Int) = -abs(x) // The shortest answer
    // abs returns the absolute value

    /**
     * Create a function that removes all the spaces between a string
     */

    fun noSpace(x: String) = x.filter { it.isLetterOrDigit() } // My answer
    fun noSpace1(x: String) = x.replace(" ", "") // Another Method

    /**
     * Create a function that take the Int m and splits it into 2 numbers x and y
     * The number y will be the last number of m and x will be the remaining numbers divided by 10
     * Example 705 would be x = 70 and y = 5
     *
     * The function would then preform a math operation to check if the numbers are divisible by 7 and if they are
     * how many steps would it take
     *
     * Rules
     *
     * sum = x - (2xy) = a
     * a / 7 = b
     * If b is a whole number this means that it is divisible by 7
     * If b is not a whole number that means it's not divisible by 7
     *
     * For the numbers that are divisible by 7 if a is currently 3 or more digits the above process should be
     * repeated until a is only 2 digits and still divisible by 7
     *
     */

    fun seven3(n:Long): ArrayList<Long> {
        var element:Long = n
        var counter:Long = 0
        while (element >= 100){
            element = element / 10 - element % 10 * 2
            counter++
        }
        return arrayListOf<Long>(element,counter)
    } // My Answer



    fun seven2(n: Long, i: Long = 0): ArrayList<Long> =
        if (n > 99) seven2(n / 10 - n % 10 * 2, i + 1)
        else arrayListOf<Long>(n, i)

    // This is the best possible solution
    // The person uses the function itself to form a loop as apposed to using a while loop
    // The also broke the problem down into a math equation which heavily reduced the amount of code needed
    // A big takeaway is how powerful % can be and its definitely something I need to make much better use of going
    // forward




    /**
     * Create a function that takes a string of Ints and returns the highest and lowest value Int
     */

    fun highAndLow(numbers: String): String {
        val number = numbers.split(" ")
        var returnCharacters = arrayListOf<Int>()
        for (numbs in number) {
            returnCharacters.add(numbs.toInt())
        }
        returnCharacters.sort()
        return returnCharacters[returnCharacters.lastIndex].toString() +" "+ returnCharacters[0].toString()
    }// My answer

    fun highAndLow2(numbers: String) =
        numbers.split(' ').map(String::toInt).let { "${it.maxOrNull()} ${it.minOrNull()}" }
    // Best possible answer
    // .map is used to convert a collection of strings into a collection of Ints
    // .let allows you to run code associated with the object and return a value
    // In the case above .let is being used to run the code for finding the max and min values of the object numbers
    // the word "it" is used within the block to refer back to the object

    /**
     * Create a function that returns the sum of the numbers in an array
     */

    fun simpleArraySum(ar: Array<Int>): Int {
        return ar.sum()
    }// Best answer

    /**
     * Create a function that takes two arrays each holding 3 sets of Ints. Then compare each Int that has the same
     * Index and award a point to the bigger index. If both Ints are the same then no points are added
     * Return to Ints that represent the scores of each side
     */

    fun compareTriplets2(a: Array<Int>, b: Array<Int>): Array<Int> {
        val counter = arrayOf(0,0)
        var index = 0
        while (index != 3){
            if (a[index] > b[index] && a[index] != b[index]){
                counter[0]++
            }else if (a[index] < b[index] && a[index] != b[index] ){
                counter[1]++
            }else {
                index += 0
            }
            index++
        }
        return counter
    } // My answer not sure if it's the best answer as this site doesnt provide other peoples answers
    // It was still a fun test tho

    /**
     * Create a function that takes 2 arrays and checks the first against the second returning true or false
     *
     * True should be returned if the elements in the first array sqaured return the same number that can be found in
     * array two
     *
     * The order of the elements in each array don't need to be the same
     *
     * Thoughts on how to write this function
     * I will first sort both Arrays so that each element can be compared side by side
     *
     * I will then create a counter variable so will be used as an index for the elements in the array
     *
     * I will use a while loop with the counter to check if each element matches
     *
     * The logic within the while loop will be an if statement that will return true or false depending on the checks
     */


    fun comp(a: IntArray?, b: IntArray?): Int {
        var counter = 0
        val aList = a?.sorted()
        val bList = b?.sorted()
        var booleanReturn = true
        if (aList == null || bList == null)
            booleanReturn = false
        else
            while (bList.size - 1 > counter){
                if (bList.size == counter) {
                    booleanReturn = true
                }else if (aList[counter] * aList[counter] == bList[counter] || bList[counter] == aList[counter]) {
                    counter++
                }else {
                    booleanReturn = false
                    break
                }
            }
        return counter
    }
    val tester: IntArray = intArrayOf(1,2,10,20,40)
    val tester2: IntArray = intArrayOf(1,4,100,200,40)
    var tester3: IntArray? = null
    println(comp(tester,tester2))


//    println(tester2[2] / tester[2])
//
//
//    while (tester2.size - 1 > counter){
//        if (tester[counter] * tester[counter]  == tester2[counter] || tester2[counter] == tester[counter] )
//            counter++
//        else
//            println("fail")
//                break
//    }
//    println(counter)
    /**
     * Come Back to this one at a later date
     */
}