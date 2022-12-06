package day2

class GameExplained(input: String) {
    private val otherMove: Shape
    private val expectedResult: Result

    init {
        input.split(" ").let {
            otherMove = Shape.byEncrypted(it.first())
            expectedResult = Result.byEncrypted(it.last())
        }
    }

    fun evaluate(): Int {
        val ownMove = otherMove.findOtherPart(expectedResult)
        return expectedResult.score + ownMove.score
    }
}