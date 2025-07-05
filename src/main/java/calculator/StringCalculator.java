package calculator;

public class StringCalculator {
    public static int add(String numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return 0;
    }
        return Integer.parseInt(numbers);
}
}
