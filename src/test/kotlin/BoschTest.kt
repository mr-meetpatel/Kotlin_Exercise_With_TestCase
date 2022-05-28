import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BoschTest{
    var myBoschOven=Bosch()
    var myRoasterOven=Roaster()
    @Test
    fun test(){
        assertEquals("Bosch Oven Cooking Speed : 90 and AvgTemp : 120",myBoschOven.cooking())
        assertEquals("Roaster Oven Cooking Speed : 90 and AvgTemp : 100",myRoasterOven.cooking())
    }
}