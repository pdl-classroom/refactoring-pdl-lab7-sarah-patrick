package ch.heigvd.pdl.refactoring;

public class OrdersWriter {

    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        return orders.toString();
    }

}
