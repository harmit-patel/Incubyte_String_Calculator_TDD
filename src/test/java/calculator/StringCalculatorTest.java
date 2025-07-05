package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    void testEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }

    @Test
    void singleNumberShouldReturnTheSameNumber() {
        StringCalculator calc = new StringCalculator();
        assertEquals(5, calc.add("5"));
    }
}
