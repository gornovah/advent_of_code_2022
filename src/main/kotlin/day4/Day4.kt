package day4

import load

fun main() {
    val loadedData: List<String> = load("/day-4.txt")
    println("Solution to Day 4, Part 1 is '${day4FirstPart(loadedData)}'")
    println("Solution to Day 4, Part 2 is '${day4SecondPart(loadedData)}'")

}

fun day4SecondPart(loadedData: List<String>): Int {
    return loadedData.map { CleaningPlan(it) }
        .map { it.overlapsAtAll() }
        .count { it }
}

fun day4FirstPart(loadedData: List<String>): Int {
    return loadedData
        .map { CleaningPlan(it) }
        .map { it.firstCleaningPartContainsSecondCleaningPart() }
        .count { it }
}


