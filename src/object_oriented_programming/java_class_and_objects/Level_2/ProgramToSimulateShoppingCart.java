package object_oriented_programming.java_class_and_objects.Level_2;

class ProgramToSimulateShoppingCart {

    // Inner class
    static class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        void addItem(int qty) {
            quantity += qty;
            System.out.println(qty + " items added.");
        }

        void removeItem(int qty) {
            if (qty <= quantity) {
                quantity -= qty;
                System.out.println(qty + " items removed.");
            } else {
                System.out.println("Not enough items to remove!");
            }
        }

        void displayTotalCost() {
            double total = price * quantity;
            System.out.println("Item: " + itemName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + total);
        }
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000, 1);

        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}