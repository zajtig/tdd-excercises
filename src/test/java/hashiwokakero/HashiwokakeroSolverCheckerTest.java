package hashiwokakero;

import hashiwokakero.exception.NotExistingPuzzleException;
import org.junit.Test;

public class HashiwokakeroSolverCheckerTest {

    @Test(expected = NotExistingPuzzleException.class)
    public void nullPuzzleTest() {
        new HashiwokakeroSolverChecker().check(null);
    }
}
