package exception_handling.labs;

import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 *      when will we need to make a custom exception
 */

//coin purchase using points
class Points{

    public static void main(String[] args) {
        int userPoints = 1578; //current user points
        System.out.print("One coin worth 2 points. How many coins do you want to purchase? ");
        Scanner scanner = new Scanner(System.in);
        int coins = scanner.nextInt();

        try{
            if (coins*2 <= userPoints){
                System.out.println("Thank you for your purchase. \n The balance of your points is: " + (userPoints - (coins*2)));
            }
            else throw new InsufficientPointsException(coins,userPoints);
        }catch (InsufficientPointsException ipe){
            System.out.println("You don't have enough points to make the purchase.");
            ipe.printStackTrace();
        }
    }

}