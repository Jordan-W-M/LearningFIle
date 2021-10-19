/**
 * Collections
 *
 * Kotlin has both Mutable And Immutable collection types
 *
 * Collections are used to house a collection of data types that have the same use.
 * Example the items of a shopping list
 * Example Names of people in a classroom
 *
 * Mutable and Immutable Lists
 *
 * listOf() Is Immutable
 * arrayListOf() is Mutable
 *
 * Indexing
 *
 * Indexing is used to specify what you would like to take out of a data type
 * There are a variety of functions that use indexing
 * To Index you use [] Brackets
 * When indexing Kotlin starts at zero and not one
 * When indexing a list each index refers to a block and not each character Example listof ("Hi","Bye","No",)
 * the Index [1] will return bye
 *
 * Slice
 *
 * Slicing allows you to Index multiple objects from a Collection
 * .slice(0..1) Calls for a range of objects from Index 0 to 1 to be returns
 * .slice(setOf(0,1,5)) Indexes multiple objects out of a collection and returns them in the order called
 * .slice(0..6 step 2) Indexes a range and then returns every second index in the range
 * step is used to define how many objects you jump well indexing from a range
 *
 *
 * Lists vs Arrays
 *
 * Lists can house multiple data types
 * Lists support several operations
 * Lists take up more memory which makes them slower
 *
 * Arrays are used to House one data type
 * The structure of Arrays are more memory efficient making them faster than lists
 */

fun main (args: Array<String>) {

    val imperials = listOf("Darth Vader", "Storm Troopers" , "Emperor", "Kilo The Hun","Boba","Darth Mall")
    println("\n$imperials")
    println("\n${imperials.sorted()}") // Sorts list into Alphabetical order
    println("\n" + imperials[2]) // Indexing the third String in the list
    println("\n${imperials.first()}") // Returns first String in list
    println("\n${imperials.last()}") // Returns last String in List
    println("\n${imperials.contains("Darth Vader")}") // Returns true as Darth vader is in the list
    println("\n${imperials.contains("Luke")}") // Returns false as Luke is not in the list
    println("\n${imperials.slice(1..3)}") // Slicing to return multiple Strings from the list in a range
    println("\n${imperials.slice(setOf(0,2,1))}") // Returns Strings at different index in the order called
    println("\n${imperials.slice(0..5 step 2)}")// Returns every second object in range of Indexed Strings



    val rebels = arrayListOf("Luke","Ben","Yoda","Han Solo","Skywalkers")
    println("\n${rebels.size}") // Tells me how big my list is
    rebels.add("Jordan") // This list is Mutable so I can make changes to it. Here I am adding a String
    rebels.add(0,"Anakin") // Adding a String to a specific place in the list
    println("\n$rebels")
    println("\nLuke is at this Index ${rebels.indexOf("Luke")}") // Returns the Index position of Luke
    rebels.remove("Luke") // Removing an Object from list using a String
    rebels.add(1,"Luke")
    rebels.removeAt(1) // Removing an Object from list with Index position
    println("\n$rebels")


    /**
     * Maps (Dictionary)
     *
     * Maps can be Mutable or Immutable
     *
     * Maps are used to Assign Objects to a key value pair that can be called to retrieve the object
     * Each Key is individual and cant have the same name as another Key
     *
     * Maps are very useful when holding large sets of data as you can call specific objects out of the data set using
     * the key as apposed to having to find the index position if it was to be stored in a list
     *
     * Maps are unordered unlike lists
     */

    val myCars = mapOf("Jordan" to "Astra", "Terry" to "Subaru", "Natalie" to "Land Rover", "Amber" to "AstonMartin") //Immutable Map
    println("\n${myCars["Jordan"]}") // Using map Key to Print value pair
    println("\n${myCars.get("Jordan")}") // Does the same as above
    println("\n${myCars.getOrDefault("Lewis","Lewis doesn't have a car")}")
    // Searching for an Object in the Map using a key but giving a default value to use if the key doesn't exist
    // This can avoid the code throwing out errors similar to an else statement
    println("\n${myCars.keys}") ; println("\n${myCars.values}") // Returns the Keys and Values of the map
    println("\n${myCars.toSortedMap()}") // Sorts the Keys Alphabetically but is also case sensitive so if you
    // Have upper and lower case letters it will sort the upper case letters first then the lower


    val carList = hashMapOf("Jordan" to "Astra", "Natalie" to "Land Rover", "Terry" to "Subaru",
        "Murry" to "Grey Subaru", "Mark" to "Porsche") // Mutable Map
    println("\n${carList["Jordan"]}")
    carList["Jordan"] = "Lambo" // Changing the value of the "Jordan" key in carList hashMap
    println("\n${carList["Jordan"]}")
    carList.put("Lewis" , "Mercedes") // Adding a new Key Value Pair to hashMap
    carList["Jamie"] = "Astra" // Adding a new Key Value Pair to hashMap
    println("\n${carList["Lewis"]} \n\n${carList["Jamie"]} ") // Print Added key value pairs
    carList.remove("Jamie") // Removing Key Value pair from hashMap
    println("\n$carList")
    println("\n${carList.isEmpty()}") // Checks if hashmap is empty and returns Boolean
    println("\n${carList.isNotEmpty()}") // Checks if hashmap is empty and returns Boolean
    carList.clear() // Clears all Key Value Pairs in hashmap making it empty
    println("\n$carList")
    carList["Jordan"] = "Astra" ; carList["Lewis"] = "Nothing"
    println("\n$carList")














}