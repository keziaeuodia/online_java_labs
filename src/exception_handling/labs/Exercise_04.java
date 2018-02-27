package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class TryCatch4 {
    public static void main(String args[]) {
        int array[] = new int[120];

        for (int i = 0; i < 120; ++i) {
            array[i] = i * 3;
        }

        System.out.print("Enter array index: ");
        Scanner input = new Scanner(System.in);
        byte a = input.nextByte();
        System.out.println();

        try {
            System.out.println("Before catch statement.");
            System.out.println("The index " + a + " contains " + array[a]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
            exc.printStackTrace();
        }

        System.out.print("Enter a number to divide content: ");
        Scanner div = new Scanner(System.in);
        int b = div.nextInt();
        System.out.println();

        try {
            System.out.println(array[a] + "divided by " + b + "= " + (array[a] / b));
        } catch (ArithmeticException exc) {
            System.out.println("Cannot divide by 0!");
            exc.printStackTrace();

            System.out.println("After catch statement.");
        }
    }
}

