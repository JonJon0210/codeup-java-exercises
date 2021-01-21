package syntaxLec;

public class syntaxLecture {

    //psvm + tab - IntelliJ shortcut for the following method
    public static void main(String[] args) {

        // ================== STATEMENTS (s-3)

        // Statements may be...
        // Declarations
        int number;

        //keyboard shortcut for formatting code is CMD option l


        // Assignment expressions

        number = 7; // = is just assignment in Java


        // Any use of ++ or --
        //pre-decrement
        --number; // this will be decremented BEFORE it's evaluated
        System.out.println("The numbers value after Pre-decrementing is" + number);
        number++; // this will be incremented AFTER it's evaluated on this line
        System.out.println("The numbers value after post-incrementing is" + number);

        System.out.println("Pre-decrementing " + number + "=" + --number);
        System.out.println("Post-incrementing " + number + "=" + number++);
        // NOW the number is incremented from what it was before to 1 larger
        System.out.println("Now, the number = " + number);


        // Method invocations
        Math.random();  //call the "random()" method, from the Math class.
                        // HOLD CMD and click on class will take to source
        // number = Math.random();  // this doesn't work because "number" is of type "int" and Math.random() returns a
                                    // "double"
        double randomNumber = Math.random();

        // Object creation expressions

        // ================== COMMENTS (s-4)


        // see JavaDocTest in docs package


        // ================== DATA TYPES (s-5, 6, 7)


        // use the smallest type needed for the job

        // primitive types...

        byte age = 125;
        System.out.println("Adding one to the byte(125) : " + ++age);
        System.out.println("Adding one to the byte(126) : " + ++age);
        System.out.println("Adding one to the byte(127) : " + ++age);
        // age = 200;
        // System.out.println(age);
        short minimumAnnualSalary = 15080;
//            int distanceToSaturn = 1200000000;
//            long numberOfHumanCells = 3000000000L; // L needed for compiler
//            System.out.println(numberOfHumanCells);
//            float lengthOfBacteriaInInches = 0.00004F; // F needed for compiler
//            System.out.println(lengthOfBacteriaInInches);
//            double widthOfAtomInMeters = .00000000001;
//            char seatingSection = 'M'; // must wrap in single quotes
//            boolean everythingIsAwesome = false;

        // strings (not a primitive type)

//                 String thisIsAString = "Hello";


//              like in JS, strings must escape certain characters like quotes and use it to inject newline
//              characters and other formatting


        // ================== VARIABLES (s-8)

        // declaration separate from initialization


        // declaration and initialization


        // ================== IDENTIFIERS AND KEYWORDS (s-9)

        // see curriculum


        // ================== CONSTANTS (s-10)

        // see curriculum


        // ================== EXPRESSIONS (s-11)

        // basically the same as JS


        // ================== OPERATORS (s-12)

        // basically the same as JS


        // ================== ASSIGNMENT STATEMENTS (s-13)

        // basically the same as JS


        // ================== CASTING (s-14)

        // Link on casting... http://www.javainterviewpoint.com/type-casting-java-implicit-explicit-casting/


        // IMPLICIT


        // EXPLICIT

        // implicit casting - less to more precise (widening)

//                 float num1 = 2.22F;
//                 double num2 = num1;


        // explicit casting - more to less explicit casting (narrowing)

//                 double num3 = 3.1;
//                 float num4 = (float) num3;
//
//                System.out.println(num4);

    }

}

