import org.junit.Test

internal class EnhancedCoffeeMachineTest {

    @Test
    fun Decorator() {
        val normalMachine = NormalCoffeeMachine()
        val enhancedMachine = EnhancedCoffeeMachine(normalMachine)

        // non-overridden behaviour
        enhancedMachine.makeSmallCoffee()
        // overridden behaviour
        enhancedMachine.makeLargeCoffee()
        // extended behaviour
        enhancedMachine.makeCoffeeWithMilk()
    }
}