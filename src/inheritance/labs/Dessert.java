package inheritance.labs;

public class Dessert {
    private String type;
    private String flavor;

    Dessert(){}

    Dessert(String type){

        this.type = type;
        flavor = "random";
    }

    Dessert(String flavor, String type){
        this.type = type;
        this.flavor = flavor;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
    }

    public String getFlavor() {

        return flavor;
    }

    public void setFlavor(String flavor) {

        this.flavor = flavor;
    }
}
