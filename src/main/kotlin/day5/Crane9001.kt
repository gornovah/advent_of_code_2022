package day5

import java.util.Stack

class Crane9001(val crateStacks: CrateStacks, private val instructions: List<Instruction>) {
    private val stackCrates = Stack<String>()
    fun rearrangeCrates() {
        instructions.forEach {
            val source = crateStacks.get(it.sourceStack)
            val target = crateStacks.get(it.targetStack)
            val crateRange = it.crateAmount.downTo(1)

            crateRange.forEach { _ -> stackCrates.push(source.pop()) }
            crateRange.forEach { _ -> target.push(stackCrates.pop()) }
        }
    }


}

