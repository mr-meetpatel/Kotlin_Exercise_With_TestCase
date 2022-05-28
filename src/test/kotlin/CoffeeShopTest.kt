import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CoffeeShopTest{
    val cs=CoffeeShop()
    @Test
    fun test(){
        var name="Meet"
        assertEquals("Your coffee is ready $name...",cs.sellCoffee(name))
        name="Mitesh"
        assertEquals("Your coffee is ready $name...",cs.sellCoffee(name))
        name="Jack"
        assertEquals("Your coffee is ready $name...",cs.sellCoffee(name))
    }
}