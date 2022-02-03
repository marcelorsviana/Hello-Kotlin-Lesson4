package example.myapp

fun buildAquarium() {

    /*
    The commented lines  right below were used with the regular constructor.
     */

//    val myAquarium = Aquarium()
//    myAquarium.printSize()
//    myAquarium.height = 60
//    myAquarium.printSize()

    val aquarium1 = Aquarium()
    aquarium1.printSize()    // default length, width and height

    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()    // default length and height

    val aquarium3 = Aquarium(height = 35, length = 110, width = 25)
    aquarium3.printSize()   // everything custom

    println()
    println("With new constructor:")

    val aquarium6 = Aquarium(numberOfFish = 29)
    aquarium6.printSize()
   // println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} l")
    aquarium6.volume = 70
    aquarium6.printSize()
}

fun main() {
    buildAquarium()
}