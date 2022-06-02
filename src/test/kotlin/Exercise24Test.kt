import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise24Test{
    val ex24=Exercise24()
    @Test
    fun test(){
        var name="meet"
        assertEquals("$name Already Added...",ex24.execute(name))
        name="jay patel"
        assertEquals("$name Added...",ex24.execute(name))
    }
}