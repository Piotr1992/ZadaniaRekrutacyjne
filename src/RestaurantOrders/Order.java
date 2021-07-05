package RestaurantOrders;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int numberOrder;
    private double price;
    private List<String> listProducts;

    public Order(int numberOrder, double price, List<String> listProducts) {
        this.numberOrder = numberOrder;
        this.price = price;
        this.listProducts = listProducts;
    }

    public int getNumberOrder() { return numberOrder; }

    public double getPrice() {
        return price;
    }

    public List<String> getListProducts() {
        return listProducts;
    }
}
