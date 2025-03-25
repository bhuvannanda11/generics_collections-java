package java_collections_streams.java_generics.dynamic_online_marketplace;

public class Main {
    public static void main(String[] args) {
        Product<ProductCategory> book1 = new Product<>("Java Programming", 45.99, ProductCategory.BOOK);
        Product<ProductCategory> clothing1 = new Product<>("Denim Jacket", 79.99, ProductCategory.CLOTHING);
        Product<ProductCategory> gadget1 = new Product<>("Wireless Headphones", 199.99, ProductCategory.GADGET);

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book1);
        catalog.addProduct(clothing1);
        catalog.addProduct(gadget1);

        catalog.displayCatalog();

        ProductCatalog.applyDiscount(book1, 10);
        ProductCatalog.applyDiscount(clothing1, 15);
        ProductCatalog.applyDiscount(gadget1, 20);

        catalog.displayCatalog();
    }
}
