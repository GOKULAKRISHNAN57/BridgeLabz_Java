package object_oriented_programming.java_class_and_objects.Level_1;

public class Program_to_Handle_Book_Details {

    // Book class
    public static class Book {

        String title;
        String author;
        double price;

        // Constructor
        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        // Method to display details
        public void displayDetails() {
            System.out.println("Book Title  : " + title);
            System.out.println("Author      : " + author);
            System.out.println("Price       : " + price);
        }
    }

    public static void main(String[] args) {

        // Creating object
        Book book1 = new Book("The Wind", "Clark", 499.99);

        // Display details
        book1.displayDetails();
    }
}