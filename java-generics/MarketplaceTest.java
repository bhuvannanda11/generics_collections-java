import java.util.ArrayList;
import java.util.List;

// Abstract class representing a product category
abstract class ProductCategory {
    private String name;

    public ProductCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Specific product categories
class BookCategory extends ProductCategory {
    public BookCategory() {
        super("Books");
    }
}

class ClothingCategory extends ProductCategory {
    public ClothingCategory() {
        super("Clothing");
    }
}

class GadgetCategory extends ProductCategory {
    public GadgetCategory() {
        super("Gadgets");
    }
}

// Generic Product class with type parameter restricted to ProductCategory
class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            price -= price * (percentage / 100);
        }
    }

    @Override
    public String toString() {
        return name + " (" + category.getName() + ") - $" + price;
    }
}

// Generic Marketplace Catalog
class Marketplace {
    private List<Product<? extends ProductCategory>> catalog = new ArrayList<>();

    public void addProduct(Product<? extends ProductCategory> product) {
        catalog.add(product);
    }

    public void showCatalog() {
        for (Product<? extends ProductCategory> product : catalog) {
            System.out.println(product);
        }
    }

    // Generic method to apply discount
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
}

// Main class to test the Marketplace System
public class MarketplaceTest {
    public static void main(String[] args) {
        Marketplace marketplace = new Marketplace();

        // Creating products
        Product<BookCategory> book = new Product<>("The Great Gatsby", 15.99, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("Casual Shirt", 29.99, new ClothingCategory());
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 499.99, new GadgetCategory());

        // Adding products to marketplace
        marketplace.addProduct(book);
        marketplace.addProduct(shirt);
        marketplace.addProduct(smartphone);

        // Displaying catalog before discount
        System.out.println("Product Catalog (Before Discount):");
        marketplace.showCatalog();

        // Applying discount dynamically
        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(shirt, 20);
        Marketplace.applyDiscount(smartphone, 15);

        // Displaying catalog after discount
        System.out.println("\nProduct Catalog (After Discount):");
        marketplace.showCatalog();
    }
}