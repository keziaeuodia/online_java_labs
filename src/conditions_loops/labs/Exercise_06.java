package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {
    public static void main (String[]args){

        int a=0, b=100, sum=0;


        while (a<b){
            a++;
            sum+=a;

        }
        System.out.println("The sum of 1 to 100 is: " + sum);

    }
}
