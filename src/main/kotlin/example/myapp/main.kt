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

    val aquarium7 = Aquarium(length = 25, width = 25, height = 40)
    aquarium7.printSize()

    println()

    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()

}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
//    buildAquarium()
    makeFish()
}