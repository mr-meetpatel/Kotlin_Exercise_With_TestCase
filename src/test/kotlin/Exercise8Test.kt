import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise8Test{
    val ex8 = Exercise8()
    @Test
    fun test(){
        assertEquals(true,ex8.isFundingApprove(3,1,2))
        assertEquals(false,ex8.isFundingApprove(7,7,2))
        assertEquals(false,ex8.isFundingApprove(3,0,2))
        assertEquals(false,ex8.isFundingApprove(3,1,1))
    }
}