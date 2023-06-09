package ch.heigvd.pdl.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Orders {

    private List<Order> orderList = new ArrayList<Order>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{\"orders\": [");
        for (Order order : orderList) {
            stringBuilder.append(order);
            stringBuilder.append("]");
            stringBuilder.append("}, ");
        }

        if (orderList.size() > 0) {
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        stringBuilder.append("]}");
        return stringBuilder.toString();
    }
}
