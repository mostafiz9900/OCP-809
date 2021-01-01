package quwstion7;
import java.util.concurrent.*;

class Printer implements Callable<String> {
    public String call() {
        System.out.println("DONE");
        return null;
    }
}

public class Test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.submit(new Printer());
        System.out.println("HELLO");
        es.shutdown();
    }
}