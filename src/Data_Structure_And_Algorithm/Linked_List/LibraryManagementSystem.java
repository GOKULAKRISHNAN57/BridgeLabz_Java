package Data_Structure_And_Algorithm.Linked_List;

class BookNode {
    int bookId;
    String title;
    String author;
    String genre;
    boolean available;
    BookNode next;
    BookNode prev;

    BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

class LibraryList {

    BookNode head = null;
    BookNode tail = null;

    // Add at beginning
    void addAtBeginning(BookNode newNode) {
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add at end
    void addAtEnd(BookNode newNode) {
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Add at position
    void addAtPosition(BookNode newNode, int pos) {
        if (pos == 1) {
            addAtBeginning(newNode);
            return;
        }

        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        } else {
            tail = newNode;
        }

        temp.next = newNode;
    }

    // Remove by ID
    void removeById(int id) {
        BookNode temp = head;

        while (temp != null && temp.bookId != id) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Book not found");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }

    // Search by Title
    void searchByTitle(String title) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                displayBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by Author
    void searchByAuthor(String author) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                displayBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Update availability
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    void countBooks() {
        int count = 0;
        BookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books: " + count);
    }

    // Display single book
    void displayBook(BookNode b) {
        System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre + ", Available: " + b.available);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryList list = new LibraryList();

        list.addAtEnd(new BookNode(1, "Java Basics", "James Gosling", "Programming", true));
        list.addAtEnd(new BookNode(2, "Python Guide", "Guido van Rossum", "Programming", true));
        list.addAtBeginning(new BookNode(3, "Data Structures", "Mark Allen", "Education", false));
        list.addAtPosition(new BookNode(4, "Algorithms", "CLRS", "Education", true), 2);

        System.out.println("Forward Display:");
        list.displayForward();

        System.out.println("\nReverse Display:");
        list.displayReverse();

        list.searchByTitle("Java Basics");

        list.updateAvailability(3, true);

        System.out.println("\nAfter Updating Availability:");
        list.displayForward();

        list.removeById(2);

        System.out.println("\nAfter Deletion:");
        list.displayForward();

        list.countBooks();
    }
}