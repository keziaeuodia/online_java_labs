package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 3:
 *
 *      Create at least three example classes (class1, class2, class3) that demonstrate comfort
 *      in creating multiple classes with multiple methods, and then call between those methods across classes.
 *      These methods can perform any task, such as getter/setter methods or simple addition/subtraction.
 *      1) Class1 should have the main method.
 *      2) The main method then needs to create an object of class1, class2, class3.
 *      3) The main method should then  call one or more non-static methods in class2 and class3.
 *
 */
class HRcontrol{
    public static void main(String[] args) {
        employeeBonus emp1 = new employeeBonus();
        emp1.setSalary(1000);
        emp1.setWorkperiod(11);
        employeeBasic Luzie = new employeeBasic();
        Luzie.name = "Luzie Bauernfeind";
        Luzie.age = 20;

        System.out.print("Name: " + Luzie.name + "\n" + "Age: " + Luzie.age + "\n");
        System.out.println("Bonus: " + employeeBonus.bonus());
        System.out.println();

        employeeBonus emp2 = new employeeBonus();
        emp2.setSalary(1500);
        emp2.setWorkperiod(13);
        employeeBasic Josue = new employeeBasic();
        Josue.name = "Josue Martinez";
        Josue.age = 27;

        System.out.print("Name: " + Josue.name + "\n" + "Age: " + Josue.age + "\n");
        System.out.println("Bonus: " + employeeBonus.bonus());
        System.out.println();


        employeeBasic print = new employeeBasic();
        print.printempnum();

    }


}

class employeeBasic{

    String name;
    byte age;
    static int empNum = 0;

    public employeeBasic(){
        empNum++;
    }

    public static int getEmpNum() {
        return empNum;
    }
    void printempnum(){
        System.out.println("Number of employee = " + ((empNum++)-1));
    }
}

class employeeBonus{
    static private int salary;
    static private int workperiod;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkperiod() {
        return workperiod;
    }

    public void setWorkperiod(int workperiod) {
        this.workperiod = workperiod;
    }

    static int bonus(){
        return salary*workperiod/12;
    }

}