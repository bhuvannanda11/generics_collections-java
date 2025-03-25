package java_collections_streams.java_generics.warehouse_management_system;

abstract public class WarehouseItem {
    public String name;
    public double price;

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
}
class Electronics extends WarehouseItem{
    public Electronics(String name, double price) {
        super(name, price);
    }
}
class Furniture extends WarehouseItem{
    public Furniture(String name, double price) {
        super(name, price);
    }
}
class Groceries extends WarehouseItem{
    public Groceries(String name, double price) {
        super(name, price);
    }
}
