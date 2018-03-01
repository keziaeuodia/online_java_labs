package inheritance.labs;

public class IceCream extends Cakes {
    private boolean cone;
    private int scoops;

    IceCream(int scoops, boolean cone) {
        if (cone){
            System.out.println(scoops + " scoops of ice cream with cone");
        }else{
            System.out.println(scoops + " scoops of ice cream for you");
        }
        int qty = scoops;
        double total = amout(qty, 1.5);
        System.out.println("The total amount is $" + total);
    }

    IceCream(int scoops, String flavor, String type) {
        super(flavor, type);
        double cakeAmout = amout(1, 2.5);
        System.out.println("with " + scoops + " scoops of ice cream");
        int qty = scoops;
        double iceCreamAmount = amout(qty, 1.5);
        System.out.println("The total amount is $" + (cakeAmout + iceCreamAmount));
    }

    public boolean isCone() {
        return cone;
    }

    public void setCone(boolean cone) {
        this.cone = cone;
    }

    public int getScoops() {
        return scoops;
    }

    public void setScoops(int scoops) {
        this.scoops = scoops;
    }

}
