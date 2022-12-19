package day5

import loadString

fun main() {
    val loadedData = loadString("/day-5.txt")
    println("Solution to Day 5, Part 1 is '${solveDay5PartOne(loadedData)}'")
    println("Solution to Day 5, Part 2 is '${solveDay5PartTwo(loadedData)}'")
}

fun solveDay5PartTwo(loadedData: String): String {
    val split = loadedData.split("\n\n")
    val crane9001 = Crane9001(
        crateStacks = CrateStacks.of(drawing = split.first()),
        instructions = Instruction.createFrom(rawInstructions = split.last())
    )
    crane9001.rearrangeCrates()
    return crane9001.crateStacks.getTopCrates()
}

fun solveDay5PartOne(loadedData: String): String {
    val splitData = loadedData.split("\n\n")
    val crane9000 = Crane9000(
        crateStacks = CrateStacks.of(drawing = splitData.first()),
        instructions = Instruction.createFrom(rawInstructions = splitData.last())
    )
    crane9000.rearrangeCrates()
    return crane9000.crateStacks.getTopCrates()
}





