import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DrawBunnyTest{
    val bunny =DrawBunny()
    @Test
    fun test(){
        val l1="(\\(\\"
        val l2="(-.-)"
        val l3="o_(\")(\")"
        val res=l1+"\n"+l2+"\n"+l3
        assertEquals(res,bunny.drawBunny())
    }
}