import java.util.*

/**
 * Strings
 * Strings are a Data Type that can be used to contain a collection of characters
 * The Characters within a string are immutable but the string itself is mutable
 * The characters can be letters,symbols and numbers in any order
 * You input strings in Kotlin By using "" or you can explicitly state the type using : String
 *
 * There are Two types of strings in Kotlin Raw and Escape
 *
 * Escape Strings allow you to edit your string with escape characters
 * Here is a list of escape characters supported in Kotlin:
 * \t - Inserts tab
 * \b - Inserts backspace
 * \n - Inserts newline
 * \r - Inserts carriage return
 * \' - Inserts single quote character
 * \" - Inserts double quote character
 * \\ - Inserts backslash
 * \$ - Inserts dollar character
 */


fun main(args: Array<String>) {
    val str = "May the force be with you"
    println(str) // Escape String
    val strT = "Insert tab test \t tab" // Tabs over 4 spaces
    val strB = "Insert backspace test\b" // Back spaces once
    val strN = "Insert new \n \bline test" // Inserts a new line when run
    val strR = "Insert carriage \rtest " // Only displays the characters after \r
    val str1Q = "Insert \'single quote" // Adds single quote
    val str2Q = "Insert \" Double quote" // Adds Double quote
    val strS = "Insert \\ Backslash" // Adds backslash
    val strM = "Insert \$ Dollar Sign" // Adds dollar sign

    println("$strT \n \b$strB \n \b$strN \n$strR \n$str1Q \n$str2Q \n$strS \n$strM " )
    // I originally used \n and \b to get the printed strings on the same line but later realized i could just remove
    // the space between \n and string

    /**
     * Raw string don't use escape characters as they print out as they are typed
     * You call a Raw string using """
     *
     * When using Raw strings the new lines won't be spaced correctly this can be corrected using the .trimMargin()
     * command and pipes at the start of each new line |
     */

    val rawStr1 = """This is a raw string without 
    trimMargin
    so the spacing is bad"""

    val rawStr = """This is a 
        |Raw string 
        |with 
        |trimMargins
    """.trimMargin()

    println("\n$rawStr1 \n\n$rawStr")

//    for (char in rawStr) {
//        println(char)  // Basic for loop
//    }

    /**
     * String Methods
     * .contentEquals() Compares strings to see if they are equal
     * .contains() Compares strings to find if specified object exists
     * .uppercase() Makes all characters uppercase
     * .lowercase() Makes all characters lowercase
     * .toString() Converts data type into string format
     * .subSequence() Used to return a specific index of characters, numbers or symbols
     */

    val compareTo = str.contentEquals("May the force be with you") // Checks if strings are the same
    println("\n$compareTo") // Returns Boolean true as both are the same

    val compareTo1 = str.contentEquals("The force is not with you") // Checks if strings are the same
    println("\n$compareTo1") // Returns Boolean false as they are not the same

    val compareTo3 = str.contains("force" , true) // Checking if force is present in str
    println("\n$compareTo3")  // Returns Boolean true as force is present in str

    val upperT = str.uppercase() // Return all characters in str as uppercase
    val lowerT = str.lowercase() // Returns all characters in str as lowercase
    println(".upper and lower test \n$str \n$upperT \n$lowerT")

    val num = 6 // Integer
    val stringNum = num.toString() // Convert integer into string
    println("\n$stringNum") // Print returns 6 as a string not an integer

    val subC = str.subSequence(4,13) // Only returns indexed characters
    println("\n$subC")

    /**
     * String Templates
     *
     * The $ sign used to add variables is a string template
     * The templates work across multiple data types allowing for quick and readable implementation
     * Templates allow the use of string methods
     */

    val luke = "Luke Skywalker"
    val jedi = "Light side of the force"
    val saber = "Blue"
    val lukeA = 24
    val lukeB = true
    println("\n" +luke+ " is on the " +jedi+ " and uses a " +saber+ " light Saber. Luke is now " +lukeA+
            " years old = " +lukeB)
    println("\n$luke is on the $jedi and uses a $saber light Saber. Luke is now $lukeA years old = $lukeB")
    // Above I have written out the same code using the old and new method to compare
    // String templates is shorter and requires less punctuation to achieve the same result
    // Templates is also friendly to write so it allows for smoother and faster coding

    println("\n$luke name contains ${luke.count()} characters")
    // Using {} I can call a method after the variable name allowing me to use methods in this print statement

    println("\n" +luke+ " name contains " +luke.count()+ " characters")
    // Using methods in the older version as well
    // The older method is how the process is still done in Java so its important to know both
    











}