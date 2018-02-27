package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];

        int a;

        for (int i=0; i < 5; ++i){
            for (a = 0; a <5; a++){
                twoDArray [i][a] = (i*15)+((a+1)*3);
                System.out.print(twoDArray[i][a] + " ");
            }
            System.out.println();
        }
    }
}
