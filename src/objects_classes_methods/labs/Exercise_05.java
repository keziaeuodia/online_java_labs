package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

public class Exercise_05{

    private static String greetings;
    private String name;

    public static String getGreetings() {
        return greetings;
    }

    public static void setGreetings(String greetings) {
        Exercise_05.greetings = greetings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Exercise_05 hello = new Exercise_05();
        hello.name = "Yoda";
        Exercise_05.setGreetings("Good Morning ");

        Exercise_05 hello2 = new Exercise_05();
        hello2.name = "Paul";
        Exercise_05.setGreetings("Good Night ");

        Exercise_05 hello3 = new Exercise_05();
        hello3.name = "Gloria";
        Exercise_05.setGreetings("Good Day ");

        System.out.println(Exercise_05.getGreetings() + hello.name + "!"); //will print Good Day Yoda! because greetings variable is static
        System.out.println(Exercise_05.getGreetings() + hello2.name + "!"); //will print Good Day Paul! because greetings variable is static
    }
}