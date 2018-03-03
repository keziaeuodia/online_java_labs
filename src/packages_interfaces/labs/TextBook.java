package packages_interfaces.labs;

public class TextBook implements EBooks{
    @Override
    public void title() {
        System.out.println("Java A Beginner's Guide");
    }

    @Override
    public void type() {
        System.out.println("Tech Culture");
    }

    @Override
    public int pages() {
        return 728;
    }

    @Override
    public void sections() {
//        Contents
//        Introduction
//        Chapter 1
//        ...

    }

    @Override
    public void publisher() {
        System.out.println("McGraw-Hill Education");
    }
}
