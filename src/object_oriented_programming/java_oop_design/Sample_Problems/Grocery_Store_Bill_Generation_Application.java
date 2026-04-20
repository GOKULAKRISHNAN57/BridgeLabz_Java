package object_oriented_programming.java_oop_design.Sample_Problems;

import java.util.ArrayList;
import java.util.List;

class Customer{

    final private String name;
    List<Product> products = new ArrayList<>();

    Customer(String name){
        this.name = name;
    }

    public void addProducts(String product_Name, int price){
        products.add(new Product(product_Name,price));
    }

    public int getBilling(){
        return BillGenerator.totalBill(products);
    }

}

class Product{

    private String product_Name;
    public int price;

    Product(String product_Name, int price){
        this.product_Name = product_Name;
        this.price = price;
    }

}

class BillGenerator{

    static int totalBill(List<Product> products){
        int total = 0;
        for(Product product : products){
            total += product.price;
        }

        return total;
    }
}

public class Grocery_Store_Bill_Generation_Application {
    public static void main(String[] args) {
        Customer customer = new Customer("Gokul");
        customer.addProducts("Kinder Joy",45);
    }
}
