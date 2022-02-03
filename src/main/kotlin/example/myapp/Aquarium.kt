package example.myapp

import jdk.swing.interop.SwingInterOpUtils

/*
A Class with a regular constructor.
 */

//class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
//    // Dimensions in cm
//    var length: Int = length
//    var width: Int = width
//    var height: Int = height
//
//    fun printSize() {
//        println("Length: $length cm " +
//                "Width: $width cm " +
//                "Height: $height cm ")
//    }
//}


/*
Below you can see the same class, but in a more compact way.
 */

class Aquarium(var length: Int = 100, var width: Int = 20, var height: Int = 40) {
    init {
        println()
        println("aquarium initializing")
    }
//    init {
//        // 1 liter = 1000 cm^3
//        println("Volume: ${width * length * height / 1000} l")
//    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    var volume: Int
        get() = width * height * length / 1000 // 1000 cm3 = 1 l
        set(value) {
            height = (value * 1000) / (width * length)
        }

    fun printSize() {
//        println()
        println("Length: $length cm " +
                "Width: $width cm " +
                "Height: $height cm "
        )
        // 1 l = 1000 cm^3
        println("Volume: $volume l")
    }
}

