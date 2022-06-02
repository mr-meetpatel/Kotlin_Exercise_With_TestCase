import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise18Test{
    val ex18=Exercise18()
    @Test
    fun test(){
        assertEquals("A",ex18.getGradeOnBaseOfMark(98))
        assertEquals("B",ex18.getGradeOnBaseOfMark(86))
        assertEquals("Marks cannot be greater than 100",ex18.getGradeOnBaseOfMark(105))
    }
}