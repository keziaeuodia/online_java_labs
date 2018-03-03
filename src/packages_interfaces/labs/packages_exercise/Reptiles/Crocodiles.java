package packages_interfaces.labs.packages_exercise.Reptiles;

import packages_interfaces.labs.packages_exercise.Mammals.Elephants;

public class Crocodiles {

    public void habitat(){
        System.out.println("Crocodiles are commonly found in the sea, freshwater rivers and swamps");
    }

    protected double size (){
        return 6.5;
    }

    public static void main(String[] args) {
        Elephants sumatran = new Elephants();
        sumatran.weight(300);
//        diet can't be called here because its access modifier is protected
//        sumatran.diet();
    }


}
