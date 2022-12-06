package day2

enum class Result(val score: Int, val encrypted: String) {
    LOSE(0, "X"),
    DRAW(3, "Y"),
    WIN(6, "Z");
}