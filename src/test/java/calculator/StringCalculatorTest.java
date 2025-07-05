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

    @Test
    void twoNumbersShouldReturnSum() {
        assertEquals(9, StringCalculator.add("4,5"));
    }

    @Test
    void multipleNumbersShouldReturnSum() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }

    @Test
    void newlineDelimiterShouldWork() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }
    @Test
    void customDelimiterShouldBeHandled() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }

    @Test
    void negativeNumbersShouldThrowException() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.add("1,-2,3,-5");
        });
        assertEquals("negative numbers not allowed: -2,-5", e.getMessage());
    }

    @Test
    void customDelimiterWithSpecialCharShouldWork() {
        assertEquals(6, StringCalculator.add("//*\n1*2*3"));
    }

    @Test
    void longCustomDelimiterShouldWork() {
        assertEquals(6, StringCalculator.add("//[***]\n1***2***3"));
    }
}
