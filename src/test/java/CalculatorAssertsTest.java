import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAssertsTest {
    @Test
    @DisplayName("Teste com assertAll")
    public void testAddMult_10_50() {
        // Testar dois métodos desta forma não é recomendável!
        // Considere isto apenas como um exemplo simples.
        Calculator calculator = new Calculator();
        double result_add = calculator.add(10, 50);
        double result_mult = calculator.multiply(10, 50);
        assertAll("Todos testes do testAdd_10_50",
                () -> assertEquals(60, result_add, 0),
                () -> assertEquals(500, result_mult, 0));
    }

    @Test
    @DisplayName("Teste com assertTrue")
    public void testAddMult_00_50() {
        Calculator calculator = new Calculator();
        double result_add = calculator.add(10, 50);
        assertEquals(60, result_add, "O resultado nao e o valor esperado.");
    }
}
