package object_oriented_programming.java_class_and_objects.Level_1;

public class Program_to_Track_Inventory_of_Items {

    // Item class
    static class Item{

        String itemCode;
        String itemName;
        double price;

        //Constructor
        Item(String itemCode, String itemName, double price){
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        // Method to display item details
        void displayDetails(){
            System.out.println("ItemCode = " + itemCode);
            System.out.println("ItemName = " + itemName);
            System.out.println("Price = " + price);

        }

        void totalPrice (int quantity){
            double amount = quantity * this.price;
            System.out.printf("Total Amount = %.2f", amount);
        }

    }

    public static void main(String[] args) {

        //Object Creation
        Item item = new Item("#12433","Glass",7999.9);


        // Calculating the total cost
        int quantity = 7;
        System.out.println("Quantity = "+quantity);
        item.totalPrice(quantity);

    }


}
