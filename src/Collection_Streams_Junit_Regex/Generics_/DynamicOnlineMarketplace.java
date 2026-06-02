package Collection_Streams_Junit_Regex.Generics_;

import java.util.ArrayList;
import java.util.List;

abstract class Category {
    private String categoryName;

    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }
}

class BookCategory extends Category {
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends Category {
    public ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends Category {
    public GadgetCategory() {
        super("Gadgets");
    }
}

class Product<T extends Category> {

    private String productName;
    private double price;
    private T category;

    public Product(String productName, double price, T category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public T getCategory() {
        return category;
    }
}

public class DynamicOnlineMarketplace {

    public static <T extends Product<?>> void applyDiscount(
            T product,
            double percentage) {

        double discount = product.getPrice() * percentage / 100;
        product.setPrice(product.getPrice() - discount);
    }

    public static void main(String[] args) {

        List<Product<?>> catalog = new ArrayList<>();

        Product<BookCategory> book =
                new Product<>("Java Book", 1000,
                        new BookCategory());

        Product<GadgetCategory> gadget =
                new Product<>("Smart Watch", 5000,
                        new GadgetCategory());

        catalog.add(book);
        catalog.add(gadget);

        applyDiscount(book, 10);

        System.out.println(book.getProductName()
                + " : " + book.getPrice());
    }
}