/**
 * Numbers
 */

fun main() {
    //                                               Numbers

    // Min_VAlUE and MAX_VALUE return the highest and lowest values

    println("\nNumber Max and Min Values")
    println(Byte.MAX_VALUE)
    println(Byte.MIN_VALUE)
    // A Byte is an Integer that is only 8-bit
    // The larges number a Byte can hold is 127

    println(Short.MAX_VALUE)
    println(Short.MIN_VALUE)
    // A Short is an Integer that is only 16-bit
    // The larges number a Short can hold is 32767

    println(Int.MAX_VALUE)
    println(Int.MIN_VALUE)
    // An Integer is 32-bit
    // The highest number an Integer can hold is 2147483647

    println(Long.MAX_VALUE)
    println(Long.MIN_VALUE)
    // A Long is a 64-bit Integer
    // The highest number a Long can hold is 9223372036854775807

    // These are all the representation of Integers inside of Kotlin

    // Numbers with decimal places are known as Doubles inside of Kotlin

    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)
    // A Float is a 32- bit decimal number
    // The largest number a float can hold is 3.4028235E38

    println(Double.MAX_VALUE)
    println(Double.MIN_VALUE)
    // A Double is a 64-bit decimal number
    // The largest number a Double can hold is 1.7976931348623157E308

    // Kotlin will automatically assign numbers as either ints or doubles depending on how they are typed
    // You can avoid this by explicitly stating the type when creating the variable
    // val example: Double = 1.3
    // You can also convert the type at a later date using methods
    // example.toInt
    // Kotlin also lets you call some types after the number by using a letter
    // 1L This will make the Int a long
    // 1F This will make the Double a float

    println("\nAutomatic Assignment")
    println(1)
    // This will automatically be assigned as an Int

    println(1.0)
    // This will automatically be assigned as a Double

    println(101 / 10)
    // Here the automatic assignment was Int so the answer will be 10 even tho it should be 10.1
    // This is because the Int type does not support Decimal places

    println((101).toDouble() / 10)
    println(101.0 / 10)
    // If one of the numbers is a double then Kotlin will always return the answer as a double
    // I have used two methods to achieve this the first is to take the first Int and tell Kotlin to make it a Double
    // The second is to write the first Int with a decimal place so Kotlin automatically makes it a Double
    // The first method is useful when you are doing math with variables that have already been assigned as you can't
    // just add a decimal place


    // Different Ways to Represent 1
    println("\nDifferent Ways to Represent 1")
    println(1L) // Long
    println(1) // Int
    println(1.0) // Double
    println(1F) // Float
    println(0x01) // Hexadecimal (or hex) is a base 16 system used to simplify how binary is represented.
    println(0b01) // Binary Number

    // Numeric Conversions
    println("\nNumeric Conversions")
    println(1.toByte())
    println(1.toShort())
    println(1)
    println(1.toLong())
    println(1.toDouble())
    println(1.toFloat())

    // Math
    println("\nMath")
    println(5 + 5) // Addition
    println(15 - 5) // Subtraction
    println(2 * 5) // Multiplication
    println(20 / 2) // Division
    println(21 / 9) // This will return 10 as the result is an Integer
    println(21 / 9.toFloat()) // This is a float now, so it will return decimal making the answer 2.3333333
    println(21 / 9.toDouble()) // If you wanted more decimals using the 64-Bit Double would do that 2.3333333333333335

    // Binary Operators
    println("\nBinary Operators")
    println(4 shr 2) // 0b100 -> 0b001
    println(1 shl 1) // 0b01 -> 0b10
    // shr and shl move the binary left or right a specified amount of times
    // when the numbers move the last number is dropped and the first number is added as a zero
    // You can see this with the first example of 0b100 it is specified to move right twice dropping both zeros and
    // adding new ones at the start leaving you with 0b001
    println(8 and 2)
    println(8 or 2)
    println(8 xor 2)

    // Underscores to make numbers more readable
    println("\nUnderscores")
    // You can use underscores to make larger numbers more readable in Kotlin by using them the same way you would
    // use commas when writing a larger number
    // Example 100000 = 10,000 much more readable and in Kotlin it would be like 10_000
    println(10_000) // The _ will not be printed so the result will just be 10000
    // println(077_182_40053L)
    println(177_182_40053L) // It doesn't allow the first number to be zero
    println(0xFF_EC_DE_5E) // The first number can be zero if it's a Hexadecimal number
    println(0b11010010_10010100_1001001010)

}