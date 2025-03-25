import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void displayCatalog() {
        System.out.println("\n--- Product Catalog ---");
        for (Product<?> product : products) {
            product.display();
        }
    }

    // Generic method to apply a discount dynamically
    public static <T extends ProductCategory> void applyDiscount(Product<T> product, double percentage) {
        double discountAmount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discountAmount);
        System.out.println("Discount Applied! New price of " + product.getName() + ": $" + product.getPrice());
    }
}