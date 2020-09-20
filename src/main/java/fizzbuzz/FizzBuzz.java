package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static final int INCLUSIVE_THRESHOLD = 15;

    public List<String> getFizzBuzzSequence() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= INCLUSIVE_THRESHOLD; i++) {
            result.add(generateNumberOrFizzOrBuzz(i));
        }
        return result;
    }

    private String generateNumberOrFizzOrBuzz(int number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
