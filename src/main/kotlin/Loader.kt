import java.io.FileNotFoundException
import java.io.InputStream
import java.util.Optional.ofNullable

private fun String.getResourceAsStream(): InputStream =
    ofNullable(Unit.javaClass.getResourceAsStream(this))
        .orElseThrow { FileNotFoundException("File for Resource at $this could not be found!") }
fun load(pathToResource: String): List<String> =
    pathToResource.getResourceAsStream().bufferedReader().readLines()

fun loadString(pathToResource: String): String = pathToResource.getResourceAsStream().bufferedReader().readText().trimEnd()
