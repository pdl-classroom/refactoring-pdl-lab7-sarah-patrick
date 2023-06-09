package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{\"id\": ");
        stringBuilder.append(id);
        stringBuilder.append(", \"products\": [");
        for (Product product : products) {
            stringBuilder.append(product);
            stringBuilder.append(", ");
        }
        if (products.size() > 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return stringBuilder.toString();
    }
}
