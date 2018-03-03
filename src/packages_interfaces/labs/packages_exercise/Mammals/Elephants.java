package packages_interfaces.labs.packages_exercise.Mammals;

import packages_interfaces.labs.packages_exercise.Reptiles.Crocodiles;

public class Elephants {

    protected void diet(){
        System.out.println("Elephants eat up to 150 kg of food daily.");
    }

    public double weight(double lbs){
        return lbs*0.453592;
    }

    public static void main(String[] args) {
        Crocodiles crocs = new Crocodiles();
        crocs.habitat();
//        size cannot be called from another package because it is protected
//        System.out.println("Crocodiles can be " + crocs.size() + " meters long.");
    }


}
