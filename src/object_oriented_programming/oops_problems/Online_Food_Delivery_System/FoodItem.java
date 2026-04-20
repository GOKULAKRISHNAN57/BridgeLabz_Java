package object_oriented_programming.oops_problems.Online_Food_Delivery_System;

import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println(itemName + " x " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 50; // extra charge
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
}

class FoodDemo {
    public static void main(String[] args) {
        List<FoodItem> list = new ArrayList<>();

        list.add(new VegItem("Paneer", 200, 2));
        list.add(new NonVegItem("Chicken", 300, 1));

        for (FoodItem f : list) {
            f.getItemDetails();
            double total = f.calculateTotalPrice();

            if (f instanceof Discountable d) {
                total -= d.applyDiscount();
            }

            System.out.println("Final Price: " + total);
            System.out.println("------");
        }
    }
}