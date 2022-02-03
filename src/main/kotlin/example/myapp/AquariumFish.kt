package example.myapp

// abstract class AquariumFish() {
//    abstract val color: String
//}

interface  FishAction {
    fun eat()
}

interface FishColor {
    val color: String
}

class Plecostomus (fishColor: FishColor = GoldColor):
        FishAction by PrintingFishAction("eat algae"),
        FishColor by  fishColor


class Shark: FishAction , FishColor {
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

/*
 A singleton!
 */

object GoldColor : FishColor {
    override val color = "gold"
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

sealed class Seal
class SeaLion : Seal()
class Walrus : Seal()

fun matchSeal(seal: Seal): String {
    return when(seal) {
        is Walrus -> "walrus"
        is SeaLion -> "sea lion"
    }
}