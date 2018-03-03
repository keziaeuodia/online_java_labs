package packages_interfaces.labs;

import java.util.Scanner;

public class Magazines implements EBooks{

    String magTitle;
    String magType;
    int magPages = 0;
    String magPublish;

    public Magazines(String magTitle, String magType, String magPublish){
        this.magTitle = magTitle;
        this.magPages = magPages;
        this.magType = magType;
        this.magPublish = magPublish;
    }

    @Override
    public void title() {
        System.out.print(magTitle + " ");
    }

    @Override
    public void type() {
        System.out.println("Books - " + magType + " magazines");
    }

    @Override
    public int pages() {
        return magPages;
    }

    @Override
    public void sections() {
//        cover
//        advertisement page1
//        table of content
//        impressum
//        editor's letter
//        short article
//        advertisement page 2
//        main article
//        ...
    }

    @Override
    public void publisher() {
        System.out.println("Published by " + magPublish);
    }
}
