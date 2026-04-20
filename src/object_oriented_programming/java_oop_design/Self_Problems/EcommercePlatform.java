package object_oriented_programming.java_oop_design.Self_Problems;

import java.util.ArrayList;

// Product class
class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// Order class (Aggregates Products)
class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }

    double getTotal() {
        double sum = 0;
        for (Product p : products) {
            sum += p.price;
        }
        return sum;
    }
}

// Customer class
class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void placeOrder(Order order) {
        System.out.println(name + " placed order. Total: " + order.getTotal());
    }
}

// Main class
class EcommercePlatform {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mouse", 500);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        Customer c = new Customer("Ravi");
        c.placeOrder(order);
    }
}
