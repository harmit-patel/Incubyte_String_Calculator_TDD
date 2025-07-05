package calculator;

import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiterPattern = ",|\n";
        String numbersPart = numbers;


        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            String delimiter = numbers.substring(2, newlineIndex);
            delimiterPattern = Pattern.quote(delimiter);
            numbersPart = numbers.substring(newlineIndex + 1);
        }

        String[] parts = numbersPart.split(delimiterPattern);
        int sum = 0;
        for (String part : parts) {
            if (!part.isEmpty()) {
                sum += Integer.parseInt(part.trim());
            }
        }
        return sum;
    }
}
