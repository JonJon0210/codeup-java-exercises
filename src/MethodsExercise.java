import java.util.Scanner;


public class MethodsExercise {

    public static int addMe(int value1, int value2) {
        return value1 + value2;
    }

    public static int subtractMe(int value1, int value2) {
        return value1 - value2;
    }

    public static int multiplyMe(int value1, int value2) {
        return value1 * value2;
    }

    public static int divideMe(int value1, int value2) {
        return value1 / value2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("Your number is " + userInput);
            return 1;
        } else {
            System.out.println("Please enter a valid number again.");
        }
        return getInteger(min, max);
    }

//    public static int getFactorial () {
//        Scanner sc = new Scanner(System.in);
//        int userInput = sc.nextInt();
//
//    }

    public static int diceSides(int dice1, int dice2) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
    }


    public static void main(String[] args) {

        int sum = MethodsExercise.addMe(1, 2);
        System.out.println(sum);

        int difference = MethodsExercise.subtractMe(1, 2);
        System.out.println(difference);

        int product = MethodsExercise.multiplyMe(1, 2);
        System.out.println(product);

        int quotient = MethodsExercise.divideMe(4, 2);
        System.out.println(quotient);

//        System.out.println("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);

        System.out.println("How many sides on your pair of dice?");
        int userInput = diceSides (dice1, dice2);


    }
}
