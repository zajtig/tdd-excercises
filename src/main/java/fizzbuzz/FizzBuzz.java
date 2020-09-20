package fizzbuzz;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FizzBuzz {

    private static final int FIRST_ELEMENT = 1;
    private static final int LATEST_ELEMENT = 100;

    private static final Map<Integer, String> SPECIFIC_ELEMENTS = new LinkedHashMap<>();

    static {
        SPECIFIC_ELEMENTS.put(15, "FizzBuzz");
        SPECIFIC_ELEMENTS.put(5, "Buzz");
        SPECIFIC_ELEMENTS.put(3, "Fizz");
    }

    public List<String> getFizzBuzzSequence() {
        List<String> result = new ArrayList<>();
        for (int i = FIRST_ELEMENT; i <= LATEST_ELEMENT; i++) {
            result.add(generateNumberOrFizzOrBuzz(i));
        }
        return result;
    }

    private String generateNumberOrFizzOrBuzz(int number) {
        for (Map.Entry<Integer, String> entry : SPECIFIC_ELEMENTS.entrySet()) {
            if (isFizzBuzzSpecificElement(number, entry.getKey())) {
                return entry.getValue();
            }
        }
        return Integer.toString(number);
    }

    private boolean isFizzBuzzSpecificElement(int number, int specificElement) {
        return number % specificElement == 0;
    }
}
