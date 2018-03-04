package multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */

public class Exercise_03 implements Runnable{
    Thread thrd;

    public Exercise_03(String name){
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
