import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        System.out.println("Say anything to Bob.");
        Scanner sc = new Scanner(System.in);

        String userInput1 = "";
        while (userInput1.equalsIgnoreCase("bye")) {

            String userInput2 = sc.nextLine();
            if (userInput2.equalsIgnoreCase("bye")) {
                System.out.println("Sure");

            } else if (userInput2.endsWith("?")) {
                System.out.println("Sure");

            } else if (userInput2.endsWith("!")) {
                System.out.println("Whoa, chill out!");

            } else if (userInput2.length() < 1) {
                System.out.println("Fine. Be that way!");

            } else {
                System.out.println("Whatever");
            }
        }

    }
}


