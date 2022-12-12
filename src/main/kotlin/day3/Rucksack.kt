package day3

class Rucksack(val content: String) {
    private val firstPartOfLine = content.toCharArray(0, (content.length / 2))
    private val secondPartOfLine = content.toCharArray((content.length / 2))

    fun findSimilarItem(): Char {
        return firstPartOfLine.toSet().intersect(secondPartOfLine.toSet()).first()
    }

    fun findCommonElement(rucksacks: List<Rucksack>): Char {
        var commonElements = this.content.toSet()

        rucksacks.forEach { rucksack ->
            commonElements = commonElements.intersect(rucksack.content.toSet())
        }

        return commonElements.first()

    }
}
