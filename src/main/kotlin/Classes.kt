import java.lang.management.PlatformLoggingMXBean

/**
 * Practice file for the classes created well learning
 */

    // A big advantage of using Classes is all the variables and function called within the class only exist within the
    // Class itself, so you could create multiple classes using the same variable names within without getting any errors

fun main() {
    val jordan = Player("Jordan")
    println("""
        name: ${jordan.name}
        score: ${jordan.score}
        lives: ${jordan.lives}
        levels: ${jordan.levels}
        
    """.trimIndent())
    // Classes work as templates for your code
    // The Class I called above already had defaulted values for character stats this has saved me time as I don't need
    // to add the values myself for each new player, and It greatly reduced my change of errors as I am not spending time
    // retyping the same information.
    // As classes get bigger and more well-defined the advantages become much more noticeable


    // I will now streamline this process even further by adding a function to the class that will handle printing out
    // all the information I called above.
    jordan.stats()
    // Now that the printing is handles as a function within the class I can just call the function name, and it will
    // do the rest


    // As Classes act as templates they can be called and assigned as much as you like
    // The use of classes is known as class instances
    println("\n")
    val jamie = Player("Jamie")
    jamie.levels = 80
    jamie.stats()
    // Here I have created a new player and used my class build out its information. I have also changed the level
    // which is possible because the levels are set as a var within the class making it editable

    // This can be improved further by adding the player information into the class constructor.
    println("\n")
    val rose = Player2("Rose", levels = 9)
    rose.stats()
    // Now that the vars have been added as primary constructors I can change levels when first calling the class
    // instance.
    // Levels is blue as I declared it specifically so that I could just change the levels value and leave the others
    // set to their defaults


}
