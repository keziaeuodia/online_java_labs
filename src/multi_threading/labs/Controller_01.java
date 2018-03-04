package multi_threading.labs;

public class Controller_01 {
    public static void main(String[] args) {
        System.out.println("main starting");
        Exercise_01 thread1 = new Exercise_01("Thread 1");
        Exercise_01 thread2 = new Exercise_01("Thread 2");
        System.out.println("main finished");
    }
}
