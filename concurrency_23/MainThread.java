package concurrency_23;

/**
 * Created by User on 13-03-2017.
 */
public class MainThread {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        System.out.println("Hello from the main thread,again !!");
     
    }
}
