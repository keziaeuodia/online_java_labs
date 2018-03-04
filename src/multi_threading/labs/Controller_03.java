package multi_threading.labs;

public class Controller_03 {
    public static void main(String[] args) {
        System.out.println("main starting");

        Exercise_03 thread1 = new Exercise_03("Thread 1");
        Exercise_03 thread2 = new Exercise_03("Thread 2");
        Exercise_03 thread3 = new Exercise_03("Thread 3");

        thread1.thrd.setPriority(Thread.MAX_PRIORITY);
        thread2.thrd.setPriority(Thread.MIN_PRIORITY);
        thread3.thrd.setPriority(Thread.NORM_PRIORITY);

        System.out.println("main finished");
    }
}
