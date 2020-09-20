package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzUnitTest {

    @Test
    public void generateFirst14ElementsTest() {
        Assert.assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14")
                , new FizzBuzz().getFizzBuzzSequence(14));
    }
}
