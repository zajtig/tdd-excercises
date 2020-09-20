package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FizzBuzzUnitTest {

    @Test
    public void generateFirstTreeNumberTest() {
        Assert.assertEquals(List.of("1", "2", "Fizz"), new FizzBuzz().generateFirstTreeNumbers());
    }
}
