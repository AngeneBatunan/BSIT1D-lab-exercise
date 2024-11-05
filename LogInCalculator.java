import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "Angene";
        String correctPassword = "12345";

        System.out.print("Enter username: ");
        String typeUsername = scanner.nextLine();
        System.out.print("Enter password: ");
        String typePassword = scanner.nextLine();

        if (typeUsername.equals(correctUsername) && typePassword.equals(correctPassword)) {
            System.out.println("Login successful!");

            boolean continueCalculating = true;
            while (continueCalculating) {
                System.out.println("Select an operation:");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");

                int choice = scanner.nextInt();

                if (choice == 5) {
                    continueCalculating = false;
                    System.out.println("Exiting calculator...");
                    break;
                }

                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.println("Result: " + (num1 / num2));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice! Please select a valid operation.");
                }
            }
        } else {
            System.out.println("Login failed! Incorrect username or password.");
        }

        scanner.close();
    }
}
