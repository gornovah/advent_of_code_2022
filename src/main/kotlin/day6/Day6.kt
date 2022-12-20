package day6

import loadString

fun main() {
    val loadedData = loadString("/day-6.txt")
    println("Solution to Day 6, Part 1 is '${solveDay6PartOne(loadedData)}'")
    println("Solution to Day 6, Part 3 is '${solveDay6PartTwo(loadedData)}'")
}

fun solveDay6PartTwo(loadedData: String): Int {
    return signalDevice(loadedData, 14)
}

fun solveDay6PartOne(loadedData: String): Int {
    return signalDevice(loadedData, 4)
}

private fun signalDevice(loadedData: String, markerSize: Int): Int {
    return (0..loadedData.length - markerSize).first { index ->
        loadedData.substring(index, index + markerSize).toSet().size == markerSize
    } + markerSize
}
