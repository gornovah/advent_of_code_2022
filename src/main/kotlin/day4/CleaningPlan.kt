package day4

class CleaningPlan(line: String) {
    val firstCleaningPart: CleaningPart
    val secondCleaningPart: CleaningPart

    init {
        line.split(",").let {
            firstCleaningPart = CleaningPart(it.first())
            secondCleaningPart = CleaningPart(it.last())
        }
    }

    fun firstCleaningPartContainsSecondCleaningPart(): Boolean {
        val firstPartInsideSecondPart = firstCleaningPart.startsBeforeOrOnSameSection(secondCleaningPart) && firstCleaningPart.endsAfterOrOnSameSection(secondCleaningPart)
        val secondPartInsideFirstPart = secondCleaningPart.startsBeforeOrOnSameSection(firstCleaningPart) && secondCleaningPart.endsAfterOrOnSameSection(firstCleaningPart)

        return firstPartInsideSecondPart || secondPartInsideFirstPart
    }

    fun overlapsAtAll(): Boolean {
        return firstCleaningPart.overlaps(secondCleaningPart)
    }


}
