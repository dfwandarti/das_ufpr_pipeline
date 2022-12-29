import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class CalculatorOtherTagsTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Antes de todos os testes");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Depois de todos os testes");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Antes de cada um dos os testes");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Depois de cada um dos os testes");
    }

    @Test
    public void testAdd_10_50() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    public void testAdd_30_50() {
        Calculator calculator = new Calculator();
        double result = calculator.add(30, 50);
        assertEquals(80, result, 0);
    }

}
