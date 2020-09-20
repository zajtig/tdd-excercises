package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public List<String> generateFirstTreeNumbers() {
        List<String> result = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            result.add(generateNumberOrFizz(i));
        }
        return result;
    }

    private String generateNumberOrFizz(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return Integer.toString(number);
    }
}
