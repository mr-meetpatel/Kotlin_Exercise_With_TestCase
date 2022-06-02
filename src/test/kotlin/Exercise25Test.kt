import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise25Test{
    val ex25=Exercise25()
    @Test
    fun test(){
        assertEquals("Welcome to our club",ex25.checkEntryToClub(18))
        assertEquals("Welcome to our club",ex25.checkEntryToClub(25))
        assertEquals("Sorry you are not allow",ex25.checkEntryToClub(5))
    }
}