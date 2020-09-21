package hashiwokakero;

import hashiwokakero.exception.BadIslandDataException;
import hashiwokakero.exception.EmptyPuzzleException;
import hashiwokakero.exception.NotExistingPuzzleException;
import hashiwokakero.exception.PuzzleShapeException;

public class HashiwokakeroSolverChecker {

    public static final int EMPTY_ISLAND = 0;
    public static final int MAX_CONNECTION_BETWEEN_TWO_ISLANDS = 2;
    public static final int MAX_REACHABLE_ISLANDS = 4;


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
        if (puzzle.length < 2 || puzzle[0].length < 2) {
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
                checkIslandDataValues(puzzle[i][j], calculateCannotReachableIslandsNumber(i, j, puzzle));
            }
        }
    }

    private int calculateCannotReachableIslandsNumber(int i, int j, int[][] puzzle) {
        int cannotReachableIslandsNumber = 0;
        if (isTopOrBottomIsland(i, puzzle.length - 1)) {
            cannotReachableIslandsNumber++;
        }
        if (isLeftOrRightIsland(j, puzzle[i].length - 1)) {
            cannotReachableIslandsNumber++;
        }
        return cannotReachableIslandsNumber;
    }

    private boolean isTopOrBottomIsland(int currentRow, int maxRow) {
        return currentRow == 0 || currentRow == maxRow;
    }

    private boolean isLeftOrRightIsland(int currentColumn, int maxColumn) {
        return currentColumn == 0 || currentColumn == maxColumn;
    }

    private void checkIslandDataValues(int islandConnections, int cannotReachableIslandsNumber) {
        if (islandConnections < EMPTY_ISLAND
                || islandConnections > (MAX_REACHABLE_ISLANDS - cannotReachableIslandsNumber) * MAX_CONNECTION_BETWEEN_TWO_ISLANDS) {
            throw new BadIslandDataException();
        }
    }
}
