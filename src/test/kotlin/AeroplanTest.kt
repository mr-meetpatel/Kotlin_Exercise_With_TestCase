import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class AeroplanTest{
    val aero=Aeroplan()
    @Test
    fun test(){
        assertEquals("Engine Engine1 Started...\n" +
                "Engine Engine2 Started...\n" +
                "Engine Engine3 Started...\n" +
                "takingOff Plane...",aero.takeOffPlane())

        assertEquals("landing plane...\n" +
                "Engine Engine1 Stop...\n" +
                "Engine Engine2 Stop...\n" +
                "Engine Engine3 Stop...",aero.landPlane())
    }
}