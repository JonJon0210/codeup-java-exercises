import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Say anything to Bob.");
        Scanner sc = new Scanner(System.in);

        do {
            String userInput = sc.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");

            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");

            } else if (userInput.length() < 1) {
                System.out.println("Fine. Be that way!");

            } else {
                System.out.println("Whatever");
            }
        } while (true);


    }
}

