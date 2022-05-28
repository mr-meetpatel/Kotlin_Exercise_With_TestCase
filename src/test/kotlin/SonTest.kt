import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SonTest : Father(){
 val son = Son()

    @Test
    fun test(){

        assertEquals("Patel Meet Mitesh",son.printFullName())
    }
}