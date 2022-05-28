import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class OnlineStoreTest{
    var user1 =OnlineStore("User1")

    val user2=OnlineStore("User2")
    val user3=OnlineStore("User3",50)
    val users= listOf<OnlineStore>(user1,user2,user3)

    @Test
    fun test(){
        
        for (user in users){
            if(user.isAffortable())

                kotlin.test.assertEquals(true,user.isAffortable())
            else
                kotlin.test.assertEquals(false,user.isAffortable())
        }
    }

}