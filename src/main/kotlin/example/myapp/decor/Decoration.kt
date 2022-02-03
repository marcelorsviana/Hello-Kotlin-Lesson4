package example.myapp.decor

data class Decoration (val rocks: String){
}

fun makeDecorations(){
    val decoration1 = Decoration("granite")
    println(decoration1)

    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decoration1.equals(decoration2))
    println(decoration3.equals(decoration2))

    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

    // Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)

    // A way to SKIP that is:
    // val (rock,_, diver) = d5
}

// Here is a dat class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String){}

fun main() {
    makeDecorations()
}