package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the area and perimeter of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        double pi = 3.14159, r = 3.14;
        int h = 5;

        double area=(2*pi*r*r) + (2*pi*r*h);
        double perimeter= 2*pi*r;

        System.out.println("Area of the cylinder is: " + area );
        System.out.println("Perimeter of the cylinder is: " + perimeter);

    }
}
