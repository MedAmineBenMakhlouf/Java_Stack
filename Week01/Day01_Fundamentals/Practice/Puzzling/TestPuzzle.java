public class TestPuzzle {
    public static void main(String[] args) {
    PuzzleJava puzz = new PuzzleJava();
    int[] array = {1,5,7,65,654,4,55};
    puzz.getTenRolls();
    puzz.getRandomLetter();
    puzz.generatePassword();
    puzz.generatePassword(20);
    puzz.shuffleArray(array);
    }
}
