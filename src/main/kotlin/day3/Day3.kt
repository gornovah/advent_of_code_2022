package day3

import load

fun main() {
    val loadedData: List<String> = load("/day-3.txt")
    println("Solution to Day 3, Part 1 is '${day3FirstPart(loadedData)}'")
    println("Solution to Day 3, Part 2 is '${day3SecondPart(loadedData)}'")

}

fun day3SecondPart(loadedData: List<String>): String {
    return loadedData.asSequence()
        .map { Rucksack(it) }
        .chunked(3)
        .map { it.first().findCommonElement(it.subList(1, it.size)) }
        .sumOf { it.obtainPriority() }
        .toString()
}

fun day3FirstPart(loadedData: List<String>): Int {
    return loadedData.asSequence()
        .map { Rucksack (it) }
        .map { it.findSimilarItem() }
        .sumOf { it.obtainPriority() }
}

