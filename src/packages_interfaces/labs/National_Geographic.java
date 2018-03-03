package packages_interfaces.labs;

public class National_Geographic extends Magazines{


    public National_Geographic(int issueNo){
        super("National Geographic", "travel", "National Geographic Society");
        title();
        System.out.println("#" + issueNo);
        type();
        publisher();
    }

    public boolean puchase(){

        System.out.println("Thank you for your purchase!");
        return true;
    }

    @Override
    public void sections() {
        super.sections();
//        cover
//        advertisement page 1
//        advertisement page 2
//        best photo of the year
//        ...
    }

    public static void main(String[] args) {
        National_Geographic natgeo157 = new National_Geographic(157);
        natgeo157.puchase();

    }
}
