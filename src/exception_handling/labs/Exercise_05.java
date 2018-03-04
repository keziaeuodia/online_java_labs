package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class ThrowException {

    public static void main(String args[]) {
        int array[] = new int[100];

        for (int i = 0; i < 100; ++i) {
            array[i] = i * 2;
        }

        System.out.print("Enter array index: ");
        try {
            Scanner input = new Scanner(System.in);
            byte a = input.nextByte();

            if (a >= 100){
                throw new ArrayIndexOutOfBoundsException();
            }

            System.out.println();
            System.out.println("Before catch statement.");
            System.out.println("The index " + a + " contains " + array[a] + "\n");
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
            exc.printStackTrace();
        }
    }
}
