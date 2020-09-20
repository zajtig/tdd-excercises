package hashiwokakero;

import hashiwokakero.exception.NotExistingPuzzleException;

public class HashiwokakeroSolverChecker {
    public void check(Object puzzle) {
        if (puzzle == null) {
            throw new NotExistingPuzzleException();
        }
    }
}
