package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class TryCatch6 {

    public static void throwingException() {
        double array[] = new double[120];

        for (int i = 0; i < 120; ++i) {
            array[i] = i * 3;
        }

        System.out.print("Enter array index: ");
        Scanner input = new Scanner(System.in);
        byte a = input.nextByte();
        System.out.println();

        try {
            System.out.println("Before catch statement.");
            System.out.println("The index " + a + " contains " + array[a] + "\n");


            System.out.print("Enter a number to divide content: ");
            Scanner div = new Scanner(System.in);
            double b = div.nextInt();
            System.out.println();

            try {
                System.out.println(array[a] + " divided by " + b + "= " + (array[a] / b));
            } catch (ArithmeticException exc) {
                System.out.println("Cannot divide by 0!");
                exc.printStackTrace();

                System.out.println("After catch statement.");
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
            exc.printStackTrace();
            throw exc;
        }


    }

    public static void main(String[] args) {
        try{
            throwingException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Error - Program Terminated");
        }
    }
}
