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

    //    public static int modulusMe(int value1, int value2) {
//        return (value1 % 0, value2 % 0);
//    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("You're age is " + userInput);
        } else {
            System.out.println("Please enter a valid number again.");
            getInteger(min, max);
        }
        return 1;
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

        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);


    }
}
