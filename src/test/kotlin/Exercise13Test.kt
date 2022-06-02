import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise13Test{
    var ex13 =Exercise13()

    @Test
    fun test(){
        assertEquals("Animal Added...",ex13.addAnimalToTheZoo(listOf("tiger","monkey")))
        assertEquals("Lion Removed...",ex13.SellLoinFromTheZoo())
        assertEquals(false,ex13.isAvailable(listOf("elephant","giraffe")))
    }
}