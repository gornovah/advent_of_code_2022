import java.io.FileNotFoundException
import java.util.Optional.ofNullable

fun load(pathToResource: String): List<String> {
    val resourceAsStream =
        ofNullable(Unit.javaClass.getResourceAsStream(pathToResource))
        .orElseThrow { FileNotFoundException("File for Resource at $pathToResource could not be found!") }

    return resourceAsStream.bufferedReader().readLines()
}
