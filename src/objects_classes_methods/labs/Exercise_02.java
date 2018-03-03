package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

public class Exercise_02{

    static double a, b, height;

    static double area(){
        return a*b;
    }

    static double vol(){
        return area()*height;
    }

    int perimeter(int a, int b){
        return (a + b)*2;
    }

    void print(){
        a = 10;
        b = 15;
        height = 5;
        System.out.println("Perimeter is: " + perimeter(12, 20));
        System.out.println("Volume is: " + vol());
    }

    public static void main(String[] args) {
        Exercise_02 print1 = new Exercise_02();
        print1.print();
        Exercise_02 print2 = new Exercise_02();
        int x = print2.perimeter(12, 3);
        System.out.println("Perimeter in print2 is " + x);
    }





}

