package question5;
interface Flyable {
    void fly();
}

public class Test {
    public static void main(String[] args) {
        /*INSERT*/
        Flyable flyable=new Flyable() {
            @Override
            public void fly() {
                System.out.println("Fly hight ");
            }
        };
    }
}