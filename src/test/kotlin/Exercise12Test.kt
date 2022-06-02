import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise12Test{
    val ex12=Exercise12()
    @Test
    fun test(){
        assertEquals("[mouse]",ex12.removeItemFromTheList(arrayListOf("laptop", "mouse"),listOf("laptop")))
    }
}