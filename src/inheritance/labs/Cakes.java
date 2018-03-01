package inheritance.labs;

public class Cakes extends Dessert{
    private double price;
    private int quantity;

    Cakes(){}

    Cakes(String flavor, String type){
        super(type, flavor);
        System.out.println("You ordered " + flavor + " " + type );
    }

    Cakes (String flavor, String type, double price, int quantity){
        super(type, flavor);
        double amount = price * quantity;
        System.out.println("Thank you for your order of " + quantity + " " + type + "\n" +
                "The amount of your order is: " + amount);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double amout(int quantity, double price){
        return quantity*price;
    }

    public double amount(int quantity){
        double price = 1;
        return quantity*price;
    }

}

