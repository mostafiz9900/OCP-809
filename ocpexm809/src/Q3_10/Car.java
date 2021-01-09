package Q3_10;


interface Rideable{Car getCar(String name);}

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//       Car auto=Car("MyCar")::new;
//       Car vehicle=Rideable::new::getCar("MyCar");
//       Car vehicle =auto::getCar("MyCar");
       Rideable rider=Car::new;
       Car vehicle=rider.getCar("MyCar");



    }

}

//I:\OCP