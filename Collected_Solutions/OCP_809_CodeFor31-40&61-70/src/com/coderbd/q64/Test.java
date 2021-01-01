package com.coderbd.q64;

/**
 * Answer: A
 */
class FuelNotAvailException extends Exception {
}

class Vehicle {
    void ride() throws Exception {
        System.out.println("Happy Journey!");
    }
}

class PetrolVehicle extends Vehicle {
    public void ride() throws FuelNotAvailException, Exception {
        super.ride();
    }
}

public class Test {
    public static void main(String[] args) throws Exception {
        Vehicle v = new PetrolVehicle();
        v.ride();
    }
}
