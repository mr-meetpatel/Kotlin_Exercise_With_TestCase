import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise19Test{
    val ex19=Exercise19()
    @Test
    fun test(){
        assertEquals("Child",ex19.whoAreYou(10))
        assertEquals("Teen",ex19.whoAreYou(16))
        assertEquals("Adult",ex19.whoAreYou(22))
    }
}