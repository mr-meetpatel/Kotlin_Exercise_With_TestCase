import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class WebBrowserTest{
    val wb=WebBrowser()
    @Test
    fun test(){
        kotlin.test.assertEquals("https://www.google.com",wb.url)
    }
}