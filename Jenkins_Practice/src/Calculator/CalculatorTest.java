package Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void testAdd() {
        int expected = 5;
        int actual = Calculator.add(1, 4);
        assertEquals(expected, actual, "1 + 4의 결과는 5여야 합니다!");
    }

    @Test
    void testSubtract() {
        int expected = 7;
        int actual = Calculator.subtract(10, 3);
        assertEquals(expected, actual, "10 - 3의 결과는 7이어야 합니다!");
    }

    @Test
    void testMultiply() {
        int expected = 12;
        int actual = Calculator.multiply(2, 6);
        assertEquals(expected, actual, "2 * 6의 결과는 12여야 합니다!");
    }

    @Test
    void testDivide() {
        int expected = 4;
        int actual = Calculator.divide(8, 2);
        assertEquals(expected, actual, "8 / 2의 결과는 4여야 합니다!");
    }

    @Test
    void testDivideByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(8, 0),
                "0으로 나누면 IllegalArgumentException이 발생해야 합니다!"
        );
    }
}
