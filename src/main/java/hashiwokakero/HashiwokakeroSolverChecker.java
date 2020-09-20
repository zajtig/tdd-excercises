package hashiwokakero;

import hashiwokakero.exception.EmptyPuzzleException;
import hashiwokakero.exception.NotExistingPuzzleException;
import hashiwokakero.exception.PuzzleShapeException;

public class HashiwokakeroSolverChecker {
    public void check(int[][] puzzle) {
        checkPuzzleExists(puzzle);
        checkPuzzleEmpty(puzzle);
        checkPuzzleShape(puzzle);
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
}
