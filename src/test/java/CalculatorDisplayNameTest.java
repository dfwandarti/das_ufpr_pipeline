import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@DisplayName("Test class showing the @DisplayName annotation.")
public class CalculatorDisplayNameTest {
    @Test
    public void testAdd_10_50() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    @DisplayName("30+50")
    public void testAdd_30_50() {
        Calculator calculator = new Calculator();
        double result = calculator.add(30, 50);
        assertEquals(80, result, 0);
    }
}
