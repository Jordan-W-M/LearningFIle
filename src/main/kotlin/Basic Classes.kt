/**
 * Basic Class file
 * This Class will be an example of a class you might use to for player information
 */

class Player(val name: String = "Jordan") {
    // The variables added to the class declaration are known as primary constructors
    // The variables added here must be assigned a value when calling this class
    // This is important because you build logic operations within classes that can later be called as methods on the
    // class and the logic won't work if you haven't supplied all the arguments needed.

    // You can set default values for the variables which would mean that they don't need to be assigned when calling
    // the class as they will already have a value. To change the value you simply input your own and the default will
    // be overwritten
    // Above I have assigned a default value to the val name

    var lives = 3
    var levels = 1
    var score = 0
    // Here I have added the default values for the player

    fun stats(){
        println("""
        Name: $name
        Lives: $lives
        Levels: $levels
        Score: $score
    """.trimIndent())
    }
    // Function for printing player class information
}

class Player2(val name: String = "Jordan", var lives: Int = 3, var levels:Int = 1 , var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist",5)
    fun stats(){
        println("""
        Name: $name
        Lives: $lives
        Levels: $levels
        Score: $score
    """.trimIndent())
    }
}

class Weapon(val name: String, var damage: Int){
    
}
