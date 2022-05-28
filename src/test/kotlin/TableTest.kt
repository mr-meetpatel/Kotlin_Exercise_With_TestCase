import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TableTest{
    val t1=Table()
    val t2=Table()
    @Test
    fun test(){
        t1.setData(12.5,10)
        t2.setData(15.0,15)
        kotlin.test.assertEquals("Table Height : 12.5 Size : 10",t1.showData())
        kotlin.test.assertEquals("Table Height : 15.0 Size : 15",t2.showData())
    }
}