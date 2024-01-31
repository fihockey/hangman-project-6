
public class DisplayResult {
    public static void displayWord(char[] displayArray) {
        for (char letter : displayArray) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void displayGuessedLetters(String guessedLetters) {
        System.out.println("Letters guessed: " + guessedLetters);
    }

    public static void displayLives(int lives) {
        System.out.println("Lives: " + lives);
    }
}
