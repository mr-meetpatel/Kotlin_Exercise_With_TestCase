import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class EngineerTest : Job(){
    val engineer=Engineer()
    val doctor=Doctor()
    @Test
    fun test(){
        engineer.salary=80000
        doctor.salary=50000
        kotlin.test.assertEquals(100000,engineer.study(20000))
        kotlin.test.assertEquals(100000,engineer.work())
        kotlin.test.assertEquals(60000,doctor.study(10000))
        kotlin.test.assertEquals(60000,doctor.work())

    }
}