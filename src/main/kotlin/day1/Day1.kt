package day1

import load

private fun determineCalories(inventory: List<String>): List<Int> {
    val caloriesByElf = mutableListOf<Int>()
    var caloriesCount = 0
    for (line in inventory) {
        when {
            line.isEmpty() -> {
                caloriesByElf.add(caloriesCount)
                caloriesCount = 0;
            }
            else -> caloriesCount += line.toInt()
        }
    }
    caloriesByElf.add(caloriesCount)

    return caloriesByElf
}

fun day1PartOne(inventory: List<String>): Int {
    return determineCalories(inventory).max()
}

fun day1PartTwo(inventory: List<String>): Int {
    return determineCalories(inventory).sortedDescending().subList(0, 3).sum()
}

fun main() {
    val loadedData = load("/day-1.txt")
    println("Solution to Day 1, Part 1 is '${day1PartOne(loadedData)}'")
    println("Solution to Day 1, Part 2 is '${day1PartTwo(loadedData)}'")
}
