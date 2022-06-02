import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise27Test{
    val ex27=Exercise27()
    @Test
    fun test(){
        assertEquals(15,ex27.fetchLifeSpan("cat"))
        assertEquals(20,ex27.fetchLifeSpan("camel"))
    }
}