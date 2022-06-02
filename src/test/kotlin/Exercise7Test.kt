import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Exercise7Test{
    val obj= arrayListOf<Exercise7>(Exercise7(15000,5.5f,5),Exercise7(25000,5.5f,5),Exercise7(35000,5.5f,5))

    @Test
    fun test(){
        for(ex7 in obj){
            with(ex7){
                assertEquals((p*r*t)/100,getSimpleInterest())
            }
        }
    }
}