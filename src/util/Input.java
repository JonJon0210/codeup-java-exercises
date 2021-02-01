package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input () {
        this.scanner = new Scanner(System.in);
    }

     public String getString() {
        System.out.printf("Please enter a string");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String answer = this.scanner.nextLine();
        return (answer.toLowerCase().equals(equals("y"))) ||
                answer.toLowerCase().equals("yes");
    }

    public int getInt() {

    }

    int getInt(int min, int max) {
        while (true) {
            System.out.printf("Please enter an integer between %d and %d: ", min, max);
            int answer = this.scanner.nextInt();
            if (answer >= min && answer <= min) {
                return answer;
            }
        }
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }

    public double getDouble(double min, double max) {
        while (true) {
            double answer = this.scanner.nextDouble();
            if (answer >= min && answer <= min) {
                return answer;
            }
        }
    }

    public double getDouble() {
        System.out.println("Enter a decimal number:");
        return Double.parseDouble(scanner.nextLine());
    }
}

