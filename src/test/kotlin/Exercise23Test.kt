import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise23Test{
    val ex23 =Exercise23()

    @Test
    fun test(){
        assertEquals("7 14 21 28 ",ex23.getNumberDivisibleBy7(30))
        assertEquals("7 14 ",ex23.getNumberDivisibleBy7(15))
    }
}