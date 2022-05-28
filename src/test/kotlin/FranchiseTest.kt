import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FranchiseTest : Restaurant(){
    var f1=Franchise()
    @Test
    fun test(){
        assertEquals("Preparing your Burger please wait...\nyour dish is ready",f1.preparingYourBurger())
    }
}