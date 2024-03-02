import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        final String COLOR_RED = "Red";
        final String COLOR_GREEN = "Green";
        final String COLOR_BLUE = "Blue";
        final String COLOR_ORANGE = "Orange";
        final String COLOR_YELLOW = "Yellow";
        final int MAX_ROUNDS = 11;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Describe yourself: ");
        String description = scanner.nextLine();

        System.out.print("Due Date: ");
        String dueDate = scanner.nextLine();

        System.out.println(name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);

        System.out.println("CMSC203 Assignment1: Test your ESP skills!");

        int correctGuesses = 0;
        for (int i = 1; i <= MAX_ROUNDS; i++) {
            System.out.println("\nRound " + i);
            String chosenColor = chooseRandomColor();
            System.out.println("\nI am thinking of a color.");
            System.out.print("Is it Red, Green, Blue, Orange, or Yellow?\nEnter your guess: ");
            String userGuess = scanner.nextLine();

            if (userGuess.equalsIgnoreCase(chosenColor)) {
                System.out.println("\nYou guessed it right!");
                correctGuesses++;
            } else {
                System.out.println("\nYou guessed incorrectly. The correct answer was: " + chosenColor);
            }
        }

        System.out.println("\nGame Over\n");
        System.out.println("You guessed " + correctGuesses + " out of " + MAX_ROUNDS + " colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("User Description: " + description);
        System.out.println("Due Date: " + dueDate);
    }

    private static String chooseRandomColor() {
        int randomNumber = (int) (Math.random() * 5);
        switch (randomNumber) {
            case 0:
                return "Red";
            case 1:
                return "Green";
            case 2:
                return "Blue";
            case 3:
                return "Orange";
            case 4:
                return "Yellow";
            default:
                return "Black"; // This should never happen
        }
    }
}
