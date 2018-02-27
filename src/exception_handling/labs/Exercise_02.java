package exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class TryCatch2 {
    public static void main(String args[]) {
        int array[] = new int[120];

        for (int i=0; i < 120; ++i){
            array [i] = i*3;
        }

        System.out.print("Enter array index: ");
        Scanner input = new Scanner(System.in);
        byte a = 0;
        try {
            a = input.nextByte();
            System.out.println();
        } catch (InputMismatchException exc){
            System.out.println("Value out of bounds!");
            exc.toString();
        }

        System.out.print("Enter a number to divide content: ");
        Scanner div = new Scanner(System.in);
        int b = div.nextInt();
        System.out.println();

        try {
            System.out.println("Before catch statement.");
            System.out.println("The index " + a + " contains " + array[a]);
            System.out.println(array[a] + "divided by " + b + "= " + (array[a] / b));

        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
            exc.printStackTrace();
        } catch (ArithmeticException exc){
            System.out.println("Cannot divide by 0!");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}

