package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

                int [][] irregArray = {
                {1,3,5,7},
                {2,4,6,8,10},
                {3,6},
                {4,8,12}
        };

        for (int [] val: irregArray) {

            for (int y : val) {

                System.out.print(y + " ");
            }
            System.out.println();


        }


    }


}
