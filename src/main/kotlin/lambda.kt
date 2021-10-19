/**
 * Lambda
 *
 * A Lambda works like a function that doesn't need a function name to be called you instead use a variable name
 * in its place
 *
 * Lambda can be very useful when used withing a function
 *
 * Example
 * Lambda
 * val printMessage = { message: String -> println(message) }
 * Function
 * fun printMessage2(message: String) = println(message)
 *
 * Unit is used in Kotlin to say return nothing
 */

fun main(args: Array<String>) {
    val printMessage = { message: String -> println(message) }
    fun printMessage2(message: String) = println(message)
    printMessage("Print this")
    printMessage2("Print this")

    val sumA = { x: Int, y: Int -> x + y }
    println(sumA(1, 2))

    // Creating a function that mimics a web download request
    fun downloadData(url: String, completion: () -> Unit) {
        // sent download request
        // we got back the data
        // there were no network errors
        completion()
    }
    downloadData("FakeUrl.com") { println("The code in this block will only run after the completion") }

    /**
     * What the above example shows
     * I created a function that asks for a web address
     * The body of the function would then go and retrieve data from that web address
     * Once that was done the completion would run with my lambda print message
     */

    fun darkSideDownload(url: String, completion: (DarkSide) -> Unit) {
        // sent download request
        // we got back lightSaber Data
        // there were no network errors
        val jordan = DarkSide("Jordan Mckenzie", "Dark", "Purple", "Star Destroyer")
        completion(jordan)
    }
    darkSideDownload("www.FakeUrl.com") { jordan ->
        println("\n${jordan.details()}")
    }// Here I have used a function to call a class and then used a lambda to return a method from the class as
    // a print statement
    // If this was real code for a website I could instead get the lambda to populate information boxes on the webpage
    // for example

    // When there is only one perimeter being passed into the lambda you don't need to call the varibale name assigned
    // in the lambda you can instead use it

    fun lightSideDownload(url: String, completion: (LightSide) -> Unit) {
        // sent download request
        // we got back lightSaber Data
        // there were no network errors
        val jordan = LightSide("Jordan Mckenzie", "Light", "Purple", "Millennium Falcon")
        completion(jordan)
    }
    lightSideDownload("www.FakeUrl.com") {
        println("\n${it.details()}")
    }// Example of a lambda using it in the place of the variable name

    fun carDownload(url: String, completion: (Truck?, Boolean) -> Unit){
        // Make a web request
        // we get the results back
        val webRequestSuccess = true
        if (webRequestSuccess){
            // Received Truck data
            val truck = Truck("Audi","Q3",true, 6)
            completion(truck,true)
        }else{
            completion(null,false)
        }
    }
    carDownload("www.fakeurl.com") {truck, success ->
        if (success){ truck?.truckDetails()
    }else
        println("Failed to Retrieve Truck Data")
    }
}

