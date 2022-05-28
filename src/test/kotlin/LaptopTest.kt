import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LaptopTest{
    @Test
    fun test(){
        Laptop().run {
            assertEquals("Laptop is Turing On",turnOn())
            assertEquals("Laptop is Turing Off",turnOff())
        }
    }
}