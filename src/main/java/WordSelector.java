import java.util.Random;

public class WordSelector {
    private String[] words;
    private String selectedWord;

    public WordSelector(String[] words) {
        this.words = words;
        selectRandomWord();
    }

    private void selectRandomWord() {
        Random random = new Random();
        selectedWord = words[random.nextInt(words.length)];
    }

    public String getSelectedWord() {
        return selectedWord;
    }
}
