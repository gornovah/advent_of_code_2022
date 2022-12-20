import day6.solveDay6PartOne
import day6.solveDay6PartTwo
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Day6Test {
    companion object {
        const val TEST_DATA_FILE = "/day-6.txt"
    }

    private lateinit var input: String

    @BeforeEach
    internal fun setUp() {
        input = loadString(TEST_DATA_FILE)
        Assertions.assertThat(input).isNotEmpty
    }

    @Test
    fun solveDay6PartOneTest() {
        val result = solveDay6PartOne(input)
        Assertions.assertThat(result).isEqualTo(5)
    }

    @Test
    fun solveDay6PartTwoTest() {
        val result = solveDay6PartTwo(input)
        Assertions.assertThat(result).isEqualTo(23)
    }

}