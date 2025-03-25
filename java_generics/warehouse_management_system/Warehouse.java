package java_collections_streams.java_generics.warehouse_management_system;

import java.util.List;

public class Warehouse {
    public static void displayItem(List<? extends WarehouseItem> items){
        for(WarehouseItem item : items){
            System.out.println("Name: " + item.name + " price: " + item.price);
        }
    }
}
