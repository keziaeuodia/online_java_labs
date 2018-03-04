package multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
public class Exercise_02 extends Thread {

    public Exercise_02(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 15; i > 0; i--) {
            int a = i * 2;
            System.out.println(getName() + "." + i + "-" + a);

        }
    }
}