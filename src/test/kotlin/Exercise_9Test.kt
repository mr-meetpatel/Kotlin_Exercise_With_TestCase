import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise_9Test{
    val ex9 =Exercise_9()
    @Test
    fun test(){
        assertEquals(6,ex9.getLenth(1000.0))
        assertEquals(5,ex9.getLenth(100.0))
    }
}