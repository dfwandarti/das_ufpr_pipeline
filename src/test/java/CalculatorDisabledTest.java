import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorDisabledTest {
    @Test
    public void testAdd_10_50() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    @Disabled("Desabilitado o teste 30+50")
    public void testAdd_30_50() {
        Calculator calculator = new Calculator();
        double result = calculator.add(30, 50);
        assertEquals(80, result, 0);
    }
}
