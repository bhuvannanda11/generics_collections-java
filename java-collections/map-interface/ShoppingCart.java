import java.util.*;
public class ShoppingCart {
    private Map<String, Double> productPrices = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>();
    private NavigableMap<Double, String> sortedCart = new TreeMap<>();

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
    }

    public void addToCart(String product, int quantity) {
        if (productPrices.containsKey(product)) {
            cart.put(product, cart.getOrDefault(product, 0) + quantity);
            sortedCart.put(productPrices.get(product), product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayCart() {
        System.out.println("\nItems in Cart (Order of Addition):");
        cart.forEach((product, quantity) -> System.out.println(product + " x " + quantity));

        System.out.println("\nItems in Cart (Sorted by Price):");
        sortedCart.forEach((price, product) -> System.out.println(product + " - $" + price));

        System.out.println("\nProduct Prices:");
        productPrices.forEach((product, price) -> System.out.println(product + " - $" + price));
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Apple", 1.2);
        cart.addProduct("Banana", 0.8);
        cart.addProduct("Orange", 1.0);

        cart.addToCart("Apple", 3);
        cart.addToCart("Banana", 2);
        cart.addToCart("Orange", 5);

        cart.displayCart();
    }
}