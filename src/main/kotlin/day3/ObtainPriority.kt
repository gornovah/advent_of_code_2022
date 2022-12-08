package day3

fun Char.obtainPriority(): Int {
    when {
        this.isUpperCase() -> {
            when(this) {
                'A' -> return 27
                'B' -> return 28
                'C' -> return 29
                'D' -> return 30
                'E' -> return 31
                'F' -> return 32
                'G' -> return 33
                'H' -> return 34
                'I' -> return 35
                'J' -> return 36
                'K' -> return 37
                'L' -> return 38
                'M' -> return 39
                'N' -> return 40
                'O' -> return 41
                'P' -> return 42
                'Q' -> return 43
                'R' -> return 44
                'S' -> return 45
                'T' -> return 46
                'U' -> return 47
                'V' -> return 48
                'W' -> return 49
                'X' -> return 50
                'Y' -> return 51
                'Z' -> return 52
            }
        }
        else -> {
            when(this){
                'a' -> return 1
                'b' -> return 2
                'c' -> return 3
                'd' -> return 4
                'e' -> return 5
                'f' -> return 6
                'g' -> return 7
                'h' -> return 8
                'i' -> return 9
                'j' -> return 10
                'k' -> return 11
                'l' -> return 12
                'm' -> return 13
                'n' -> return 14
                'o' -> return 15
                'p' -> return 16
                'q' -> return 17
                'r' -> return 18
                's' -> return 19
                't' -> return 20
                'u' -> return 21
                'v' -> return 22
                'w' -> return 23
                'x' -> return 24
                'y' -> return 25
                'z' -> return 26
            }
        }
    }
    return 0
}