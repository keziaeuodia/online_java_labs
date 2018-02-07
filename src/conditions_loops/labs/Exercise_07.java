package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and usig a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
       // initialize scanner
        Scanner scanner = new Scanner (System.in);
        // prompt the user for a word
        System.out.println("Enter a word: ");
        // read in user input
        String word = scanner.nextLine();

        // used below while loop to make sure a vowel is found, and if not, alert the user
        boolean found = false;
        // used to get the character at a particular index in the string
        int count = 0;
        // used as a counter so we only loop as many times as there are characters in the word
        int numLoops = word.length();

        // while there are more characters to check
        while (numLoops > 0){
            // get the character at the index of count
            String character = String.valueOf(word.charAt(count));

            // if else ladder checking for vowels
            if (character.equalsIgnoreCase("a")){
                System.out.println("The first vowel in " + word + " is \"a\"");
                found = true;
                break;
            }
            else if (character.equalsIgnoreCase("e")){
                System.out.println("The first vowel in " + word + " is \"e\"");
                found = true;
                break;
            }
            else if (character.equalsIgnoreCase("i")){
                System.out.println("The first vowel in " + word + " is \"i\"");
                found = true;
                break;
            }
            else if (character.equalsIgnoreCase("o")){
                System.out.println("The first vowel in " + word + " is \"o\"");
                found = true;
                break;
            }
            else if (character.equalsIgnoreCase("u")){
                System.out.println("The first vowel in " + word + " is \"u\"");
                found = true;
                break;
            }
            else if (character.equalsIgnoreCase("y")){
                System.out.println("The first vowel in " + word + " is \"y\"");
                found = true;
                break;
            }
            // increment count so we get the next letter in the next loop
            count++;
            // decrement the remaining number of loops to do
            numLoops--;
        }
        // a no vowel is ever found, alert the user
        if (!found){
            System.out.println("The word you entered (" + word + ") does not contain a vowel.");
        }
    }
}


//how to ask for string input and to determine vowel
