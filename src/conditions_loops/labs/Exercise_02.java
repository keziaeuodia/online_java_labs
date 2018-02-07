package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type a number between 1 to 7: ");

        byte input = scanner.nextByte();


        if (input <= 7){
            if (input==1){
                System.out.println("Monday");
            }
            if (input==2){
                System.out.println("Tuesday");
            }
            if (input==3){
                System.out.println("Wednesday");
            }
            if (input==4){
                System.out.println("Thursday");
            }
            if (input==5){
                System.out.println("Friday");
            }
            if (input==6){
                System.out.println("Saturday");
            }
            if (input==7){
                System.out.println("Sunday");
            }
        }
        else {
            System.out.println("Other");
        }

    }
}
