package day2

import load

fun main() {
    val loadedData: List<String> = load("/day-2.txt")
    println("Solution to Day 2, Part 1 is '${day2(loadedData)}'")
}

fun day2(loadedData: List<String>): Int {
    return loadedData.asSequence().map { Game(it) }.sumOf { it.evaluate() }
}

