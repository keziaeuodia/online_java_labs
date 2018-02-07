package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main (String[]args){
        int a=0;

        while (a<=100){
            a++;
            System.out.println(a);
            if (a*a>=100) break;
        }
    }
}
