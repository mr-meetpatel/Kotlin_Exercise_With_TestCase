import Udemy.Exercise3
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise3Test{
    val ex3 =Exercise3()
    @Test
    fun test(){
        ex3.setData("Meet",3,30)
        assertEquals("Hello ${ex3.clientName} you need pay ${ex3.productQuantity * ex3.productPrice}",ex3.getData())
        ex3.setData("Meet",5,40)
        assertEquals("Hello ${ex3.clientName} you need pay ${ex3.productQuantity * ex3.productPrice}",ex3.getData())
    }
}