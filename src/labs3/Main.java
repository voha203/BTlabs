package labs3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("P1", "Product 1", 10.99, "Type A");
        Product product2 = new Product("P2", "Product 2", 5.99, "Type B");
        Product product3 = new Product("P3", "Product 3", 7.49, "Type A");

        // Create order items
        OrderItem item1 = new OrderItem(product1, 2);
        OrderItem item2 = new OrderItem(product2, 4);
        OrderItem item3 = new OrderItem(product3, 3);

        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        double totalCost = order.cost();
        System.out.println("Total cost of the order: $" + totalCost);

        // Test contains() method
        boolean containsProduct1 = order.contains(product1);
        boolean containsProduct2 = order.contains(product2);
        boolean containsProduct3 = order.contains(product3);
        System.out.println("Order contains Product 1: " + containsProduct1);
        System.out.println("Order contains Product 2: " + containsProduct2);
        System.out.println("Order contains Product 3: " + containsProduct3);

        List<Product> filteredProducts = order.filter("Type A");
        System.out.println("Products with Type A:");
        for (Product product : filteredProducts) {
            System.out.println(product.getName());
        }
    }
}