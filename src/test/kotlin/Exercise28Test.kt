import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise28Test{
    val ex28=Exercise28()
    @Test
    fun test(){
        var product="tea"
        var price=20.0
        assertEquals("$product : ${price?.times(1.2)}",ex28.cost(product,price))
    }
}