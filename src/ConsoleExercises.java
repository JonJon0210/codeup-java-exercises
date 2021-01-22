import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt + "");

        System.out.println("Enter 3 words: ");
        String userString1 = scanner.next();
        String userString2 = scanner.next();
        String userString3 = scanner.next();
        System.out.println("You entered: " + userString1 + ", " + userString2 + ", and " + userString3 + "");

        System.out.println("Enter a sentence: ");
        String userSentence1 = scanner.nextLine();
        System.out.println("You entered: " + userSentence1 + "");

    }
}
