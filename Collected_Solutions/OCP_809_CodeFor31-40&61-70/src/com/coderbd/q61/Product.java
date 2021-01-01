package com.coderbd.q61;

/**
 * Answer: B
 */
public class Product {
    public double applyDiscount(double price) {
        assert (price > 0);
        return price * 0.50;
    }

    public static void main(String[] args) {
        Product p = new Product();
        double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
        System.out.println("New price: " + newPrice);
    }
}
