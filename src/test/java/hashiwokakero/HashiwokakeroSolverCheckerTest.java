package hashiwokakero;

import hashiwokakero.exception.EmptyPuzzleException;
import hashiwokakero.exception.NotExistingPuzzleException;
import hashiwokakero.exception.PuzzleShapeException;
import org.junit.Before;
import org.junit.Test;

public class HashiwokakeroSolverCheckerTest {

    private HashiwokakeroSolverChecker game;

    @Before
    public void setUp() throws Exception {
        game = new HashiwokakeroSolverChecker();
    }

    @Test(expected = NotExistingPuzzleException.class)
    public void nullPuzzleTest() {
        game.check(null);
    }

    @Test(expected = EmptyPuzzleException.class)
    public void emptyPuzzleTest1() {
        game.check(new int[][]{});
    }

    @Test(expected = EmptyPuzzleException.class)
    public void emptyPuzzleTest2() {
        game.check(new int[][]{{}, {}});
    }

    @Test(expected = PuzzleShapeException.class)
    public void puzzleShapeTest() {
        game.check(new int[][]{{1}, {2, 3}});
    }
}
