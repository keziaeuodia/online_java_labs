package conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main (String[]args){
        int a=1000;
        for (; a>=100; a--){
            if (a%2!=0)continue;
            System.out.println(a);
        }
    }
}
