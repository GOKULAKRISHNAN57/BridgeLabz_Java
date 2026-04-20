package object_oriented_programming.java_constructor_instances.Access_Modifiers;

class Problem2_BookLibrarySystem {

    static class Book {

        public String ISBN;
        protected String title;
        private String author;

        // Setter
        public void setAuthor(String author) {
            this.author = author;
        }

        // Getter
        public String getAuthor() {
            return author;
        }
    }

    // Subclass
    static class EBook extends Book {

        void display() {
            System.out.println("ISBN: " + ISBN);   // public
            System.out.println("Title: " + title); // protected
        }
    }

    public static void main(String[] args) {
        EBook b = new EBook();
        b.ISBN = "12345";
        b.title = "Java Basics";
        b.setAuthor("James");

        b.display();
        System.out.println("Author: " + b.getAuthor());
    }
}