package calculator;

public class StringCalculator {
    public static int add(String numbers) {

        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        if (!numbers.contains(",")) {
            return Integer.parseInt(numbers); // single number
        }

        String[] parts = numbers.split(",|\n");
        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }
        return sum;
    }
}
