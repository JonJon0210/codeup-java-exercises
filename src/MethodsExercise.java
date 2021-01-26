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

    public static void main(String[] args) {
        int sum = MethodsExercise.addMe(1, 2);
        System.out.println(sum);

        int difference = MethodsExercise.subtractMe(1, 2);
        System.out.println(difference);

        int product = MethodsExercise.multiplyMe(1, 2);
        System.out.println(product);

        int quotient = MethodsExercise.divideMe(4, 2);
        System.out.println(quotient);
    }
}
