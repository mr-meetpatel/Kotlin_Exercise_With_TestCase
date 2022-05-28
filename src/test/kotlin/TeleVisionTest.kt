import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TeleVisionTest{
    var tv=TeleVision()
    @Test
    fun test(){
        assertEquals("This Channel in running on 1",tv.getChannelInfo(1))
        assertEquals("This Channel in running on 1 and subtitle is On",tv.getChannelInfo(1,true))
        assertEquals("This Channel in running on 2 and subtitle is Off",tv.getChannelInfo(2,false))
        assertEquals("This Channel in running on 1 and time : 11:00 am",tv.getChannelInfo(1,"11:00 am"))
    }
}