import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise11Test{
    val ex11 =Exercise11()
    @Test
    fun test(){
        var pname="chips"
        var pquantity=""
        assertEquals("Exception Occur",ex11.genrateBill(pname,pquantity))
        pname="candy"
        pquantity="10"
        assertEquals("$pname : ${pquantity.toInt().times(9.99)}",ex11.genrateBill(pname,pquantity))
    }
}