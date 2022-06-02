import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise4Test{
    val ex4=Exercise4()
    @Test
    fun test(){
        assertEquals(22,ex4.getAge(2000))
        assertEquals(14,ex4.getAge(2008))
    }
}