package generics.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an array and prints out the value at a certain index.
 *      when you have a normal class with a lot of class but there's one method that needs to be generic.
 */
public class Exercise_02 {

    public static < E > void printArray( E[] inputArray, int i ) {

        System.out.println(inputArray[i]);
    }

    public static void main(String args[]) {

        String[] stArray = { "Let ", "them ", "eat ", "cake!" };
        Integer[] intArray = { 500, 400, 300, 200, 100 };


        System.out.println("String Array: ");
        printArray(stArray, 2);

        System.out.println("Integer Array: ");
        printArray(intArray, 4);

    }

}