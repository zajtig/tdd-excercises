package hashiwokakero;

import hashiwokakero.exception.BadIslandDataException;
import hashiwokakero.exception.EmptyPuzzleException;
import hashiwokakero.exception.NotExistingPuzzleException;
import hashiwokakero.exception.PuzzleShapeException;

public class HashiwokakeroSolverChecker {

    public static final int EMPTY_ISLAND = 0;
    public static final int ISLAND_MAX_CONNECTIONS = 8;
    public static final int CORNER_ISLAND_MAX_CONNECTIONS = 4;

    public void check(int[][] puzzle) {
        checkPuzzleExists(puzzle);
        checkPuzzleEmpty(puzzle);
        checkPuzzleShape(puzzle);
        checkIslandDataValues(puzzle);
    }


    private void checkPuzzleShape(int[][] puzzle) {
        int puzzleLength = puzzle[0].length;
        for (int i = 0; i < puzzle.length; i++) {
            if (puzzle[i].length != puzzleLength) {
                throw new PuzzleShapeException();
            }
        }
    }

    private void checkPuzzleEmpty(int[][] puzzle) {
        if (puzzle.length == 0 || puzzle[0].length == 0) {
            throw new EmptyPuzzleException();
        }
    }

    private void checkPuzzleExists(int[][] puzzle) {
        if (puzzle == null) {
            throw new NotExistingPuzzleException();
        }
    }

    private void checkIslandDataValues(int[][] puzzle) {
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                checkIslandDataValues(puzzle[i][j]);
                checkCornerIslandConnections(puzzle, i, j);
            }
        }
    }

    private void checkIslandDataValues(int islandConnections) {
        if (islandConnections < EMPTY_ISLAND || islandConnections > ISLAND_MAX_CONNECTIONS) {
            throw new BadIslandDataException();
        }
    }

    private void checkCornerIslandConnections(int[][] puzzle, int i, int j) {
        if (isCornerIsland(puzzle, i, j) && puzzle[i][j] > CORNER_ISLAND_MAX_CONNECTIONS) {
            throw new BadIslandDataException();
        }
    }

    private boolean isCornerIsland(int[][] puzzle, int i, int j) {
        return (i == 0 || i == puzzle.length - 1) && (j == 0 || j == puzzle[i].length - 1);
    }

}
