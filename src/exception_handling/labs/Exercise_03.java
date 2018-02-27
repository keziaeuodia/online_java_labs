package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class TryCatch3 {
    public static void main(String args[]) {
        int array[] = {5,3,7,2,9,6,1,9,10};

        System.out.print("Enter array index: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        try {
            System.out.println("Before exception is generated.");
            System.out.println("The index " + a + " contains " + array[a]);

        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Index out-of-bounds!");
            exc.printStackTrace();
        } finally {
            System.out.println("Thank you!");
        }
        System.out.println("After catch statement.");
    }
}