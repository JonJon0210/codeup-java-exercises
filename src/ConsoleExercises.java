import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt + "");

        System.out.println("Enter 3 words: ");
        String userString1 = scanner.next();
        String userString2 = scanner.next();
        String userString3 = scanner.next();
//        System.out.println("You entered: " + userString1 + ", " + userString2 + ", and " + userString3 + "");
        System.out.println(userString1);
        System.out.println(userString2);
        System.out.println(userString3);
        scanner.nextLine(); //clears the input for next iteration

        System.out.println("Enter a sentence: ");
        String userSentence1 = scanner.nextLine();
        System.out.println("You entered: " + userSentence1 + "");

        System.out.println("Please enter length of your classroom.");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter width of your classroom.");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.printf("The area of the classroom is: %.1f%n",length * width);
        System.out.printf("The perimeter of the classroom is: %.1f%n", 2*length + 2*width);
    }
}
