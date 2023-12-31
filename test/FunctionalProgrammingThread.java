import org.junit.jupiter.api.Test;

public class FunctionalProgrammingThread {
    @Test
    public void classicThread() throws Exception {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello!");
            }
        });
        t1.start();
    }
    /*
    has no arguments, returns nothing
    public interface Runnable {
        void run();
    }
     */
    @Test
    public void functionalThread() throws Exception {
        Thread t1 = new Thread(() -> System.out.println("Hello!"));
        t1.start();
    }
}
