import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise17Test{
    val ex17=Exercise17()
    @Test
    fun test(){
        assertEquals(60,ex17.totalBillAmount())
    }
}