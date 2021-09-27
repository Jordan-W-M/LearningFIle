/**
 * Characters
 */

fun main() {

    // Characters
    println("Characters")
    println('c')
    println("c")
    // ' ' is used for a single character however if you want multiple characters then you can use " "
    // which represents a string of characters but can also be used for a single character


    // Character functions
    // When using character functions Kotlin doesn't recognize them as part of the string
    // \n example this would put example on a new line but one space forward, so you actually need to write it like
    // this \nexample
    println("\nCharacter functions")
    println('\t' + "Hello") // \t tabs which adds four spaces to the line
    println("hi \bhi") // \b is a backspace
    println('\n') // \n moves down a line


    // Strings
    println("\nStrings")
    println("abiding") // "" is used to call a String
    println("123456778") // String of Numbers
    println("(){}]|>.,,,,<<<<<") // String of Symbols
    println("ss234243{}{}';'") // String with a mixture of all three
    // strings can hold numbers characters and symbols
    println("words \ttab ") // Adding 4 spaces in the middle of my String
    println("Hello \nGoodbye") // added a  new line to split Hello and Goodbye
    // you can use the \ anywhere inside the string
    println("""
        This is another way to write strings 
        It will print out as its 
        written
    """.trimIndent()) // some people find this a lot more readable
    // When writing strings like this you can't use things like \n as they will be seen as normal characters


    /**
     * Booleans
     */

    // Booleans
    println("\nBoolean")
    println(true)
    println(false)
    // Booleans come in two states either true or false
    // Booleans are used for a lot of the logic in programming
    println(!true) // Here ! is used to assert not so true will be false
    println(!false) // and false will be true
    println(true || false) // || is used to say or
    println(true && false) // && used to say and. This is often used when you need something to conform to multiple
    // conditions
    if (1 == 1 && 5 == 5){ println(true) } // Example of using &&
    if (1 == 7 || 5 == 5){ println(true) } // Here the answer is still true as I used || only one of the conditions
    // had to be met


    // Math with Booleans
    println("\nMath with Booleans")
    println(1 + 1 == 2) // This will return true
    println(4 + 5 == 10) // This will return false
    // == is used to check if one thing is equal to another. The opposite would be !=


    /**
     * Arrays
     */

    // Arrays
    println("\nArrays")
    Array(5) {it * it}.forEach { println(it) } // it is used to refer back to the array itself
    // so here you are saying multiply each element in the array by itself
    // You then use .forEach to tell Kotlin what to do with each multiplication which in the case was printing them out
    intArrayOf(0,1,2,3,4,5).forEach { println(it) }
    // Kotlin arrays for ints
    // Here again I am using it to refer back to the array itself and print out the elements in the array
    longArrayOf(1,2,3,4,5,6,7,8,9) // Kotlin arrays for Longs
    doubleArrayOf(1.0,2.0,3.0) // Kotlin arrays for Doubles
    floatArrayOf(1.0F, 2.0F,3.0F) // Kotlin arrays for floats
    










}