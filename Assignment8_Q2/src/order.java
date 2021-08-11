import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Order {
    private int id;
    private String name;
    private int price;
    private OrderStatus status;

    public Order(int id, int price, OrderStatus status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return id + ". " + price + " " + status;
    }
}

enum OrderStatus {
    ACCEPTED, COMPLETED;
}

