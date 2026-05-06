package Data_Structure_And_Algorithm.Linked_List;

class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryList {

    ItemNode head = null;

    void addAtBeginning(ItemNode newNode) {
        newNode.next = head;
        head = newNode;
    }

    void addAtEnd(ItemNode newNode) {
        if (head == null) {
            head = newNode;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void addAtPosition(ItemNode newNode, int pos) {
        if (pos == 1) {
            addAtBeginning(newNode);
            return;
        }

        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeById(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        ItemNode temp = head;
        while (temp.next != null && temp.next.itemId != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found");
        } else {
            temp.next = temp.next.next;
        }
    }

    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void searchById(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                displayItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    void totalValue() {
        double total = 0;
        ItemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value: " + total);
    }

    void sortByPrice(boolean ascending) {
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if ((ascending && i.price > j.price) ||
                    (!ascending && i.price < j.price)) {

                    swap(i, j);
                }
            }
        }
    }

    void sortByName(boolean ascending) {
        for (ItemNode i = head; i != null; i = i.next) {
            for (ItemNode j = i.next; j != null; j = j.next) {
                if ((ascending && i.itemName.compareTo(j.itemName) > 0) ||
                    (!ascending && i.itemName.compareTo(j.itemName) < 0)) {

                    swap(i, j);
                }
            }
        }
    }

    void swap(ItemNode a, ItemNode b) {
        int tempId = a.itemId;
        String tempName = a.itemName;
        int tempQty = a.quantity;
        double tempPrice = a.price;

        a.itemId = b.itemId;
        a.itemName = b.itemName;
        a.quantity = b.quantity;
        a.price = b.price;

        b.itemId = tempId;
        b.itemName = tempName;
        b.quantity = tempQty;
        b.price = tempPrice;
    }

    void display() {
        ItemNode temp = head;
        while (temp != null) {
            displayItem(temp);
            temp = temp.next;
        }
    }

    void displayItem(ItemNode node) {
        System.out.println("ID: " + node.itemId +
                ", Name: " + node.itemName +
                ", Qty: " + node.quantity +
                ", Price: " + node.price);
    }
}

public class Inventory_Management_System {
    public static void main(String[] args) {

        InventoryList list = new InventoryList();

        list.addAtEnd(new ItemNode(1, "Laptop", 5, 50000));
        list.addAtEnd(new ItemNode(2, "Mouse", 20, 500));
        list.addAtBeginning(new ItemNode(3, "Keyboard", 10, 1500));

        list.addAtPosition(new ItemNode(4, "Monitor", 7, 12000), 2);

        System.out.println("Inventory:");
        list.display();

        list.updateQuantity(2, 25);

        System.out.println("\nAfter Update:");
        list.display();

        list.searchByName("Laptop");

        list.totalValue();

        list.sortByPrice(true);

        System.out.println("\nSorted by Price (Ascending):");
        list.display();

        list.removeById(3);

        System.out.println("\nAfter Deletion:");
        list.display();
    }
}