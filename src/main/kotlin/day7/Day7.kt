package day7

import load

fun main() {
    val loadedData = load("/day-7.txt")

    val mapOfLoadedData = createMap(loadedData)
    println("Solution to Day 7, Part 1 is '${solveDay7PartOne(mapOfLoadedData)}'")
    println("Solution to Day 7, Part 2 is '${solveDay7PartTwo(mapOfLoadedData)}'")

}

fun solveDay7PartOne(map: Map<String, Int>) = map.values.filter { it <= 100000 }.sum()
fun solveDay7PartTwo(map: Map<String, Int>) = map.values.filter { map["/"]!! - it <= (70000000 - 30000000) }.min()

fun createMap(input: List<String>): Map<String, Int> {
    val map = mutableMapOf<String, MutableList<String>>()
    val stack = ArrayDeque<String>()
    input.filter { !it.startsWith("$ ls") }.forEach {
        when {
            it == "\$ cd .." -> {
                stack.removeLast()
            }
            it.startsWith("\$ cd ") -> {
                stack.add(it.split(" ").last())
            }
            else -> {
                val path = stack.getPath()
                val toAdd = if (it.startsWith("dir")) (stack.getPath() + "/" + it.split(" ").last()) else it
                when {
                    map.containsKey(path) -> map[path]!!.add(toAdd)
                    else -> map[path] = mutableListOf(toAdd)
                }
            }
        }
    }
    return map.keys.associateWith { getTotalForKey(it, map) }
}

fun getTotalForKey(key: String, map: MutableMap<String, MutableList<String>>): Int {
    return map[key]!!.sumOf { if (it.startsWith("/")) getTotalForKey(it, map) else it.split(" ").first().toInt() }
}

fun ArrayDeque<String>.getPath() = this.joinToString("/")