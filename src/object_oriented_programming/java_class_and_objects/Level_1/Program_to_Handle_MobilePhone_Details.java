package object_oriented_programming.java_class_and_objects.Level_1;

public class Program_to_Handle_MobilePhone_Details {

    // MobilePhone class
    static class MobilePhone {
        String brand;
        String model;
        double price;

        // Constructor
        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        // Method to display details
        void displayDetails() {
            System.out.println("Brand  : " + brand);
            System.out.println("Model  : " + model);
            System.out.println("Price  : " + String.format("%.2f", price));
        }
    }

    public static void main(String[] args) {

        // Creating objects
        MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S23", 74999.999);
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 15", 89999.5);

        // Display details
        System.out.println("Phone 1 Details:");
        phone1.displayDetails();

        System.out.println("\nPhone 2 Details:");
        phone2.displayDetails();
    }
}