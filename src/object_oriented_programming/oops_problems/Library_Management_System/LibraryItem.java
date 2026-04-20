package object_oriented_programming.oops_problems.Library_Management_System;

import java.util.*;

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(itemId + " - " + title + " by " + author);
    }
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() { return 14; }

    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved");
        }
    }

    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    int getLoanDuration() { return 5; }

    public void reserveItem() {
        available = false;
        System.out.println("DVD reserved");
    }

    public boolean checkAvailability() {
        return available;
    }
}

class LibraryDemo {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(1, "Java", "James"));
        items.add(new Magazine(2, "Tech Today", "Editor"));
        items.add(new DVD(3, "Movie", "Director"));

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Days: " + item.getLoanDuration());

            if (item instanceof Reservable r) {
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem();
            }
            System.out.println("------");
        }
    }
}