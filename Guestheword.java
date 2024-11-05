import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretWord = "Angene";
        int attempts = 5;

        System.out.println("The Guessing Game!");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            String guess = scanner.nextLine();

            if (guess.equalsIgnoreCase(secretWord)) {
                System.out.println("Congratulations! You guessed the correct word!" + secretWord);
                break;
            } else {
                System.out.println("Incorrect. You have " + (attempts - 1) + " attempts left.");
                attempts--;
            }
        }

        if (attempts == 0) {
            System.out.println("Sorry your guess is wrong. The correct answer is: " + secretWord);
        }

        scanner.close();
    }
}
