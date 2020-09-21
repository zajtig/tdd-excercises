package hashiwokakero;

import hashiwokakero.exception.BadIslandDataException;
import hashiwokakero.exception.EmptyPuzzleException;
import hashiwokakero.exception.NotExistingPuzzleException;
import hashiwokakero.exception.PuzzleShapeException;
import org.junit.Before;
import org.junit.Test;

public class HashiwokakeroSolverCheckerTest {

    private HashiwokakeroSolverChecker game;

    @Before
    public void setUp() {
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
        game.check(new int[][]{{1, 2}, {2, 3, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest3() {
        game.check(new int[][]{{5, 6, 4}, {6, 8, 6}, {4, 6, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest4() {
        game.check(new int[][]{{4, 6, 5}, {6, 8, 6}, {4, 6, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest5() {
        game.check(new int[][]{{4, 6, 4}, {6, 8, 6}, {5, 6, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest6() {
        game.check(new int[][]{{4, 6, 4}, {6, 8, 6}, {4, 6, 5}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest7() {
        game.check(new int[][]{{4, 7, 4}, {6, 8, 6}, {4, 6, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest8() {
        game.check(new int[][]{{4, 6, 4}, {7, 8, 6}, {4, 6, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest9() {
        game.check(new int[][]{{4, 6, 4}, {6, 8, 7}, {4, 6, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest10() {
        game.check(new int[][]{{4, 6, 4}, {6, 8, 6}, {4, 7, 4}});
    }

    @Test(expected = BadIslandDataException.class)
    public void islandDataTest11() {
        game.check(new int[][]{{4, 6, 4}, {6, 9, 6}, {4, 6, 4}});
    }
}
