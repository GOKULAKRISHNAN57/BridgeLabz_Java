package object_oriented_programming.java_constructor_instances.Instance_vs_Class;

import java.util.ArrayList;
import java.util.List;

class Problem1_ProductInventory {

    // Inner class
    static class Product {

        // Instance variables (unique for each object)
        static List<String> list = new ArrayList<>();
        String productName;
        double price;

        // Class variable (shared among all objects)
        static int totalProducts = 0;

        // Constructor
        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            list.add(productName);
            totalProducts++; // increment whenever object is created
        }

        // Instance method
        void displayProductDetails() {
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
        }

        // Class method
        static void displayTotalProducts() {
            System.out.println("Products : ");
            System.out.println(list);
            System.out.println("Total Products : " + totalProducts);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts(); // class method call
    }
}
