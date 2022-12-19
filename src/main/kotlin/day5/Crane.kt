package day5

class Crane(val crateStacks: CrateStacks, private val instructions: List<Instruction>) {
    fun rearrangeCrates() {
        instructions.forEach {
            val source = crateStacks.get(it.sourceStack)
            val target = crateStacks.get(it.targetStack)
            repeat(it.crateAmount.downTo(1).count()) { target.push(source.pop()) }
        }
    }

}