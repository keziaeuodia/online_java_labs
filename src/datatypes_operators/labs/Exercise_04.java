package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_04{

    public static void main(String[] args) {

        int arr[] = new int[10];
        int i, sum;

        for (i = 0; i < 10; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter number " + (i + 1) + ": ");
            int input = scanner.nextInt();
            arr[i] = input;

        }
        sum = 0;
        for(i = 0 ; i < 10; i++) {
//            System.out.print(" " + arr[i]);
            sum += arr[i];
        }
        System.out.println(sum);
//


    }

}