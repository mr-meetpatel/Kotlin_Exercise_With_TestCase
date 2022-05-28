import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
internal class CarTest{
    @Test
    fun test(){
        Car().apply {
            kotlin.test.assertEquals("Building Car...",buildingCarProcess())
        }
    }
}