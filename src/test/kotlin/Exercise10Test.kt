import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise10Test{
    val ex10=Exercise10()
    @Test
    fun test(){
        assertEquals(10*29.99f,ex10.getPrice(10))
        assertEquals(15*29.99f,ex10.getPrice(15))
        assertEquals(8*29.99f,ex10.getPrice(8))
    }
}