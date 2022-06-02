import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise26Test{
    val ex26=Exercise26()
    @Test
    fun test(){
        var name="Meet"
        var birthYear=2000
        assertEquals("Hii $name your age is ${2022-birthYear}",ex26.nameAndAge(name,birthYear))
    }
}