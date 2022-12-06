package day2

enum class Shape(val score: Int, vararg val encryptedAs: String) {
    ROCK(1, "A", "X") {
        override val beats: Shape
            get() = SCISSORS
    },
    PAPER(2, "B", "Y") {
        override val beats: Shape
            get() = ROCK
    },
    SCISSORS(3, "C", "Z") {
        override val beats: Shape
            get() = PAPER
    };

    abstract val beats: Shape
    companion object {
        fun byEncrypted(encrypted: String): Shape {
            return Shape.values().find { it.encryptedAs.contains(encrypted) } ?: throw IllegalArgumentException("No shape found for $encrypted")
        }
    }

    fun versus(shape: Shape): Result {
        return when {
            this == shape -> Result.DRAW
            this.beats == shape -> Result.WIN
            else -> Result.LOSE
        }
    }

}