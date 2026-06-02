package Collection_Streams_Junit_Regex.Generics_;

import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String itemName;

    public WarehouseItem(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}

class Electronics extends WarehouseItem {
    public Electronics(String itemName) {
        super(itemName);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String itemName) {
        super(itemName);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String itemName) {
        super(itemName);
    }
}

class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class SmartWarehouseManagementSystem {

    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getItemName());
        }
    }

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        displayItems(electronicsStorage.getItems());
    }
}