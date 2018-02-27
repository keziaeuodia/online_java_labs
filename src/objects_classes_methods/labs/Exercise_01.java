package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */


//class 1 controller main
//two objects
public class Safari {

    private String ungulates;
    private String bigCats;
    private String reptiles;
    private static int animalCount = 0;



    public String getUngulates() {
        return ungulates;
    }

    public void setUngulates(String ungulates) {
        this.ungulates = ungulates;
    }

    public String getBigCats() {
        return bigCats;
    }

    public void setBigCats(String bigCats) {
        this.bigCats = bigCats;
    }

    public String getReptiles() {
        return reptiles;
    }

    public void setReptiles(String reptiles) {
        this.reptiles = reptiles;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

public class Operation {

    public static void main(String[] args) {

        Safari animal1 = new Safari();
        animal1.setBigCats("tiger");

        Safari animal2 = new Safari();
        animal2.setReptiles("crocodile");

        



    }


}


//class 2
//three instance variable with constructors

//class 3
//three instance variable with constructors



