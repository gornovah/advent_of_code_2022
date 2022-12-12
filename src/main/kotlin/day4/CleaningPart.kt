package day4

class CleaningPart(first: String) {

    val start: Int
    val end: Int

    init {
        first.split("-").let {
            start = it.first().toInt()
            end = it.last().toInt()
        }
    }

    fun startsBeforeOrOnSameSection(other: CleaningPart): Boolean {
        return start <= other.start
    }

    fun endsAfterOrOnSameSection(other: CleaningPart): Boolean {
        return end >= other.end
    }

    fun overlaps(other: CleaningPart): Boolean {
        return start <= other.end && end >= other.start
    }

}
