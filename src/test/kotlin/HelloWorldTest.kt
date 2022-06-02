import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloWorldTest{
    val hello =HelloWorld()
    @Test
    fun test(){
        var str="World"
        assertEquals("Hello $str",hello.printMsg(str))
        str="Meet"
        assertEquals("Hello $str",hello.printMsg(str))
    }
}