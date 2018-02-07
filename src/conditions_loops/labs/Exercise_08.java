package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 8: do-while loop
 *
 *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
 *
 */

public class Exercise_08 {
    public static void main (String[]args){
        int a=1001;
        do {
            a=a-3;
            System.out.println(a);
        } while (a<=1000 && a>2);
    }
}
