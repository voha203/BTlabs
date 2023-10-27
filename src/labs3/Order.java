package labs3;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double cost() {
        double totalCost = 0.0;
        for (OrderItem item : items) {
            totalCost += item.getQuantity() * item.getProduct().getPrice();
        }
        return totalCost;
    }

    public boolean contains(Product product) {
        for (OrderItem item : items) {
            if (item.getProduct().equals(product)) {
                return true;
            }
        }
        return false;
    }

    public List<Product> filter(String type) {
        List<Product> filteredProducts = new ArrayList<>();
        for (OrderItem item : items) {
            if (item.getProduct().getType().equals(type)) {
                filteredProducts.add(item.getProduct());
            }
        }
        return filteredProducts;
    }
}