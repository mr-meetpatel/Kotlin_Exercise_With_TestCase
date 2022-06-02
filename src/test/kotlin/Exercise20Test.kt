import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise20Test{
    val ex20 =Exercise20()

    @Test
    fun test(){
        assertEquals("Have a nice day",ex20.greetMessage("Amit"))
        assertEquals("Hope you have a great day",ex20.greetMessage("Danish"))
        assertEquals("good bye",ex20.greetMessage("Meet"))
    }
}