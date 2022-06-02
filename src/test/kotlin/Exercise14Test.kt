import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise14Test{
    var ex14=Exercise14()
    @Test
    fun test(){
        assertEquals("User Added...",ex14.addUserToList("bhavin"))
        assertEquals("User Removed...",ex14.removeUserFromTheList("jay"))
        assertEquals("[bhavin, meet, mihir]",ex14.displayAllUser())
    }
}