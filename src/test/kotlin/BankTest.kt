import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BankTest{
    var a1=Bank()
    @Test
    fun test(){
        var list= arrayListOf(100,2000,10000)
        for(i in list){
            a1.balance=i
            if(a1.balance==100)
                kotlin.test.assertEquals(1.0,a1.getInterest())
            else if(a1.balance==2000)
                kotlin.test.assertEquals(0.5,a1.getInterest())
            else
                kotlin.test.assertEquals(0.2,a1.getInterest())

        }

    }
}