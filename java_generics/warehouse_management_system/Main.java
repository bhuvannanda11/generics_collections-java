package java_collections_streams.java_generics.warehouse_management_system;

 
public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        electronicsStorage.addItem(new Electronics("Television", 55000));
        electronicsStorage.addItem(new Electronics("Fridge", 35000));
        electronicsStorage.addItem(new Electronics("Air Conditioner", 52000));

        Warehouse.displayItem(electronicsStorage.getAllItems());
    }
}
