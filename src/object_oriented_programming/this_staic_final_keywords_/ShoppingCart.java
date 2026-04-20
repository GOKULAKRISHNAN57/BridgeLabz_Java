package object_oriented_programming.this_staic_final_keywords_;

class Product {

    static double discount = 10; // shared by all products
    static int count = 0;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity) {
        this.productName = productName;   // using this
        this.price = price;
        this.quantity = quantity;
        this.productID = ++count;         // unique final ID
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct() {
        double finalPrice = price - (price * discount / 100);
        System.out.println(productID + " " + productName + " " + finalPrice + " " + quantity);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Object obj = new Product("Laptop", 50000, 1);

        if (obj instanceof Product) {
            Product p = (Product) obj;
            p.displayProduct();
        }

        Product.updateDiscount(15);
    }
}