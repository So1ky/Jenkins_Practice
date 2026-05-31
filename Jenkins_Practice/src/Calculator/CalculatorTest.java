package Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        // Calculator 클래스의 add 메서드가 정상 작동하는지 테스트합니다.
        int expected = 5;
        int actual = Calculator.add(1, 4);
        
        // 두 값이 같은지 확인하고, 다르면 에러 메시지를 띄웁니다.
        assertEquals(expected, actual, "1 + 4의 결과는 5여야 합니다!");
    }
}
