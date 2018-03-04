package multi_threading.labs;

public class Controller_02 {
    public static void main(String[] args) {
        System.out.println("main starting");

        Exercise_02 thread1 = new Exercise_02("Thread 1");
        Exercise_02 thread2 = new Exercise_02("Thread 2");

        System.out.println("main finished");
    }

}
