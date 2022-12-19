import day5.solveDay5PartOne
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Day5Test {
    companion object {
        const val TEST_DATA_FILE = "/day-5.txt"
    }

    private lateinit var input: String

    @BeforeEach
    internal fun setUp() {
        input = loadString(TEST_DATA_FILE)
        Assertions.assertThat(input).isNotEmpty
    }

    @Test
    fun solveDay5PartOneTest() {
        val result = solveDay5PartOne(input)
        Assertions.assertThat(result).isEqualTo("CMZ")
    }

}