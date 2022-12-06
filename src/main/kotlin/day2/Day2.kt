package day2

import load

fun main() {
    val loadedData: List<String> = load("/day-2.txt")
    println("Solution to Day 2, Part 1 is '${day2FirstPart(loadedData)}'")
    println("Solution to Day 2, Part 2 is '${day2SecondPart(loadedData)}'")
}

fun day2SecondPart(loadedData: List<String>): Int {
    return loadedData.asSequence().map { GameExplained(it) }.sumOf { it.evaluate() }
}

fun day2FirstPart(loadedData: List<String>): Int {
    return loadedData.asSequence().map { Game(it) }.sumOf { it.evaluate() }
}

