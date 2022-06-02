import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise15Test{
    val ex15=Exercise15()
    @Test
    fun test(){
        assertEquals("[black]",ex15.companyAcceptedColor())
        ex15.companyAcceptedColor.add("red")
        assertEquals("[black, red]",ex15.companyAcceptedColor())
    }
}