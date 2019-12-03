package aoc.one

import util.listFromTextFile
import kotlin.math.floor


fun getFuel(mass: Double): Double{
    println(mass)
    var newMass = floor(mass/3.0) - 2.0
    return if(newMass>0.0) mass + getFuel(newMass) else mass
}

fun main(args: Array<String>) {
    val input = listFromTextFile("txt/in.txt")

    var fuel: Double = 0.0
    var dMass: Double

    for (strMass in input) {

        dMass = java.lang.Double.parseDouble(strMass)
        fuel += getFuel(floor(dMass / 3.0) - 2.0)

    }
    print(fuel)
}
