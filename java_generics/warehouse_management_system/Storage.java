package java_collections_streams.java_generics.warehouse_management_system;

import java.util.ArrayList;
import java.util.List;

public class Storage <T extends WarehouseItem>{
    List<T> items = new ArrayList<>();
    public void addItem(T item){
        items.add(item);
    }

    public List<T> getAllItems() {
        return items;
    }

}  
