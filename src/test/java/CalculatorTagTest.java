import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTagTest {
    @Test
    @Tag("Adicionando")
    public void testAdd_10_50() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    @Tag("Multiplicando")
    public void testMultiply_30_50() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(30, 50);
        assertEquals(1500, result, 0);
    }
}
