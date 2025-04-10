import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.addition(2, 3);
        int expected = 5;
        assertEquals(expected, result, "2 + 3 must be equal to " + expected);
    }

    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        int result = calc.subtraction(2, 3);
        int expected = -1;
        assertEquals(expected, result, "2 + 3 must be equal to " + expected);
    }

    @Test
    public void testDivision() {
        Calculator calc = new Calculator();
        int result = calc.division(10, 2);
        int expected = 5;
        assertEquals(expected, result, "10 / 2 must be equal to " + expected);
    }

    @Test
    public void testDivisionParZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.division(10, 0), "Division by zero is impossible");
    }

    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        int result = calc.multiplication(10, 2);
        int expected = 20;
        assertEquals(expected, result, "10 * 2 must be equal to " + expected);
    }
}
