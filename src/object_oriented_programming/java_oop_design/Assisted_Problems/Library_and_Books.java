package object_oriented_programming.java_oop_design.Assisted_Problems;

import java.util.ArrayList;
//book class
class Book {

    String title;
    String author;

    //constructor
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

}

//libary class
class Library {

    ArrayList<Book> list = new ArrayList<>();

    //add method
    public void addBook(Book book){
        list.add(book);
    }

    //print method
    public void printAllBooksInLibrary(){
        for(Book book : list){
            System.out.println(book.author+" "+book.title);
        }
    }

}

public class Library_and_Books {

    public static void main(String[] args) {

        Book book1 = new Book("one piece", "oda");
        Book book2 = new Book("bleach", "kubo");

        Library library1 = new Library();

        library1.addBook(book1);
        library1.addBook(book2);

        library1.printAllBooksInLibrary();

    }

}


