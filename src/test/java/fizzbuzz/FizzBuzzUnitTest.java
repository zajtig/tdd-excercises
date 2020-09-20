package fizzbuzz;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FizzBuzzUnitTest {
    @Test
    public void generateFirst15ElementsTest() {
        List<String> expectedResult = List.of(
                "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz");
        assertEquals(expectedResult, new FizzBuzz().getFizzBuzzSequence());
    }
}
