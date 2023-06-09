package ch.heigvd.pdl.refactoring;

public class OrdersWriter {

    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuilder sb = new StringBuilder("{\"orders\": [");

        for (int i = 0; i < orders.getOrdersCount(); i++) {
            Order order = orders.getOrder(i);
            sb.append(order);
            sb.append("]");
            sb.append("}, ");
        }

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

}
