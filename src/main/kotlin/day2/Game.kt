package day2

class Game(input: String) {
    private val ownMove: Shape
    private val otherMove: Shape

    init {
        input.split(" ").let {
            otherMove = Shape.byEncrypted(it.first())
            ownMove = Shape.byEncrypted(it.last())
        }
    }

    fun evaluate(): Int {
        val scoreVersus = ownMove.versus(otherMove).score
        val moveScore = ownMove.score

        return scoreVersus + moveScore
    }
}