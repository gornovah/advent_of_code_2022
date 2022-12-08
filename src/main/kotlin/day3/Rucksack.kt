package day3

class Rucksack(content: String) {
    private val firstPartOfLine = content.toCharArray(0, (content.length / 2))
    private val secondPartOfLine = content.toCharArray((content.length / 2))

    fun findSimilarItem(): Char {
        return firstPartOfLine.toSet().intersect(secondPartOfLine.toSet()).first()
    }
}
