package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> getFizzBuzzSequence(int endInclusive) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= endInclusive; i++) {
            result.add(generateNumberOrFizzOrBuzz(i));
        }
        return result;
    }

    private String generateNumberOrFizzOrBuzz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(number);
    }
}
