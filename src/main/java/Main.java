public class Main {
    public static void main(String[] args) {
        String[] words = {"BOOPSBOOPS", "HELLBENDER", "BLOBFISH", "SPARKLEMUFFIN", "WUNDERPUS"};
        WordSelector wordSelector = new WordSelector(words);
        String selectedWord = wordSelector.getSelectedWord();

        char[] displayArray = new char[selectedWord.length()];
        for (int i = 0; i < selectedWord.length(); i++) {
            displayArray[i] = '_';
        }

        int lives = 8;
        String guessedLetters = "";
        DisplayResult.displayWord(displayArray);

        while (lives > 0) {
            PlayerInteraction playerInteraction = new PlayerInteraction();
            char guess = playerInteraction.captureGuess();

            if (selectedWord.contains(String.valueOf(guess))) {
                for (int i = 0; i < selectedWord.length(); i++) {
                    if (selectedWord.charAt(i) == guess) {
                        displayArray[i] = guess;
                    }
                }
            } else {
                lives--;
                guessedLetters += guess + " ";
            }

            DisplayResult.displayWord(displayArray);
            DisplayResult.displayGuessedLetters(guessedLetters);
            DisplayResult.displayLives(lives);

            if (String.valueOf(displayArray).equals(selectedWord)) {
                System.out.println("Congratulations! You guessed the weird animal, you ol' Steve Irwin, you!");
                break;
            }
        }

        if (lives == 0) {
            System.out.println("GAME OVER. The animal was: " + selectedWord + ". I bet you're going to google it now....");
        }
    }
}