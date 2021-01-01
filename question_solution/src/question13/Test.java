package question13;
class MyResource implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Closing");
    }
}

public class Test {
    public static void main(String[] args) {
       /* try(AutoCloseable resource = new MyResource()) {

        }*/
    }
}