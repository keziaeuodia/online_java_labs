package multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      Create an application that creates a Thread using the Runnable interface
 */

public class Exercise_01 implements Runnable{
    Thread thrd;

    public Exercise_01(String name){
        thrd = new Thread(this,name);
        thrd.start();
    }

    public void run() {
        int b;
        int a = 5;

        for (int i = 0; i <= 10; i++){
            b = a + i;
            System.out.println(thrd.getName() + "-" + i + "- contains b: " + b);
        }
    }
}
