import java.util.Scanner;

public class PlayerInteraction {
    private Scanner scanner;

    public PlayerInteraction() {
        scanner = new Scanner(System.in);
    }

    public char captureGuess() {
        System.out.print("Enter a letter: ");
        return scanner.next().toUpperCase().charAt(0);
    }
}