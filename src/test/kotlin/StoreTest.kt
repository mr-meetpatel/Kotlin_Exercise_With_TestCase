import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StoreTest{
    @Test
    fun test(){
        with(Store()){
            shirts=10
            jackets=10
            shoes=10
            assertEquals("Shoes : 10\n" +
                    "Shirts : 10\n" +
                    "Jackets : 10",printAll())
        }
    }
}