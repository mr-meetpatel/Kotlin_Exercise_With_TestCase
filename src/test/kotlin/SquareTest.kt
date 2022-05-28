import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SquareTest{
    val circle =Geometery<Shape>()
    val square=Geometery<Shape>()
    @Test
    fun test(){
        assertEquals("Area of Circle is 314.0",circle.printAnswer(Circle(),10,"Circle"))
        assertEquals("Area of Square is 144.0",circle.printAnswer(Square(),12,"Square"))
    }
}