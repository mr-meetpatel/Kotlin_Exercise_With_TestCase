import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise16Test{
    var ex16=Exercise16()
    @Test
    fun test(){
        assertEquals(7253,ex16.totalAttendance())
    }
}