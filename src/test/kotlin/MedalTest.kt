import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MedalTest{
    val game=Olympic()
    @Test
    fun test(){
        assertEquals("GOLD",game.getMedal(1).toString())
        assertEquals("SILVER",game.getMedal(2).toString())
        assertEquals("1",game.getPosition(Medal.GOLD).toString())
    }
}