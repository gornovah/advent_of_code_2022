package day3

import load

fun main() {
    val loadedData: List<String> = load("/day-3.txt")
    println("Solution to Day 3, Part 1 is '${day3FirstPart(loadedData)}'")

}

fun day3FirstPart(loadedData: List<String>): Int {
    return loadedData.asSequence()
        .map { Rucksack (it) }
        .map { it.findSimilarItem() }
        .sumOf { it.obtainPriority() }
}

