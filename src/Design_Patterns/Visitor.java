package Design_Patterns;

interface Visitor {
    void visit(Book b);
}

interface Item {
    void accept(Visitor v);
}

class Book implements Item {

    int price = 100;

    public void accept(Visitor v) {
        v.visit(this);   // accept visitor
    }
}

class PriceVisitor implements Visitor {
    public void visit(Book b) {
        System.out.println("Price: " + b.price);
    }
}

class VisitorDemo {
    public static void main(String[] args) {
        Item item = new Book();
        item.accept(new PriceVisitor());
    }
}