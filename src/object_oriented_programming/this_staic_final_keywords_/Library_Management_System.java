package object_oriented_programming.this_staic_final_keywords_;

class Book{

    static String libraryName = "World Class Library";
    final int isbn;
    String title;
    String author;

    Book(int isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName(){
        System.out.println(libraryName);
    }

    public void displayDetails(){
        System.out.println("Library Name : "+libraryName);
        System.out.println("ISBN : "+isbn);
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);

    }


}

public class Library_Management_System {
    public static void main(String[] args) {

        Book book1 = new Book(3542,"One Piece","Oda");
        Book book2 = new Book(3542,"Bleach","Kubo");


        if(book1 instanceof Book){
            book1.displayDetails();
        }
    }
}
