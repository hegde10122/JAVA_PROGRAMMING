package concurrency_23;

/**
 * Created by User on 13-03-2017.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from another thread");
    }
}
