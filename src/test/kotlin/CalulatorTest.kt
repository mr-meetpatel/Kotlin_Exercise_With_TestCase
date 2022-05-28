import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test
import kotlin.test.assertEquals
class CalulatorTest{
    val cal=Calulator()
    @Test
    fun testCal(){
        assertEquals("100",cal.add(100).toString())
        assertEquals("90",cal.sub(10).toString())
        assertEquals("360",cal.mul(4).toString())
        assertEquals("180",cal.div(2).toString())
        assertEquals("0",cal.reset().toString())
    }
}