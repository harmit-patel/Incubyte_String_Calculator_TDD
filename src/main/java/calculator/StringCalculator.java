package calculator;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String delimiterPattern = ",|\n";
        String numbersPart = numbers;

        if (numbers.startsWith("//[")) {
            int end = numbers.indexOf("]");
            String delimiter = numbers.substring(3, end);
            delimiterPattern = Pattern.quote(delimiter);
            numbersPart = numbers.substring(numbers.indexOf("\n") + 1);
        }

        else if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf("\n");
            String delimiter = numbers.substring(2, newlineIndex);
            delimiterPattern = Pattern.quote(delimiter);
            numbersPart = numbers.substring(newlineIndex + 1);
        }

        String[] parts = numbersPart.split(delimiterPattern);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        for (String part : parts) {
            if (part.isEmpty()) continue;

            int value = Integer.parseInt(part.trim());
            if (value < 0) {
                negatives.add(value);
            }
            sum += value;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("negative numbers not allowed: " +
                    negatives.stream()
                            .map(String::valueOf)
                            .collect(Collectors.joining(",")));
        }

        return sum;
    }
}
