import java.util.ArrayList;
import java.util.List;

// Abstract class representing a warehouse item
abstract class WarehouseItem {
    private String name;
    private double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// Subclasses for different types of warehouse items
class Electronics extends WarehouseItem {
    public Electronics(String name, double price) {
        super(name, price);
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name, double price) {
        super(name, price);
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name, double price) {
        super(name, price);
    }
}

// Generic storage class that can hold any type of WarehouseItem
class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

// Utility class with a wildcard method to display any type of warehouse items
class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}


public class WarehouseTest {
    public static void main(String[] args) {
        // Creating storage for different item types
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.50));
        electronicsStorage.addItem(new Electronics("Smartphone", 699.99));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 1.50));
        groceriesStorage.addItem(new Groceries("Milk", 2.99));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 85.00));
        furnitureStorage.addItem(new Furniture("Table", 199.99));

        // Displaying stored items
        System.out.println("Electronics Storage:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        WarehouseUtils.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}