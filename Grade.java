import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Subject 1: ");
        int sub1 = scanner.nextInt();

        System.out.print("Subject 2: ");
        int sub2 = scanner.nextInt();

        System.out.print("Subject 3: ");
        int sub3 = scanner.nextInt();

        System.out.println(average(sub1, sub2, sub3));
    }

    public static String average(int sub1, int sub2, int sub3) {
        int average = (sub1 + sub2 + sub3) / 3;

        if (average > 85) {
            return "Passed";
        } else {
            return "Failed";
        }
    }
}
