import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise5Test{
    val ex5 =Exercise5()
    @Test
    fun test(){

        var ans=3.14*10
        assertEquals("Ans : ${ans} and Type : ${ans::class.java}",ex5.getAns(10))
        ans=3.14*15
        assertEquals("Ans : ${ans} and Type : ${ans::class.java}",ex5.getAns(15))

    }
}