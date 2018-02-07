package datatypes_operators.labs;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String input = scanner.next();

        int count=1;

        int namelength=input.length();

        //take first letter
        String character = String.valueOf(input.charAt(0));
        //take the rest
        String remains = input.substring(1);


        System.out.println(remains + character + "ay");



    }
}


