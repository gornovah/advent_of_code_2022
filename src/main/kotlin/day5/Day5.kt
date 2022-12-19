package day5

import loadString

fun main() {
    val loadedData = loadString("/day-5.txt")
    println("Solution to Day 5, Part 1 is '${solveDay5PartOne(loadedData)}'")
}

fun solveDay5PartOne(loadedData: String): String {
    val splitData = loadedData.split("\n\n")
    val crane = Crane(
        crateStacks = CrateStacks.of(drawing = splitData.first()),
        instructions = Instruction.createFrom(rawInstructions = splitData.last())
    )
    crane.rearrangeCrates()
    return crane.crateStacks.getTopCrates()
}





