package PizzaSystem;

public abstract class BaseFunctionality implements BaseFunctionalityInterface {

    protected int orderId;
    protected int price;

    // Parameterized constructor
    public BaseFunctionality(int orderId) {
        this.orderId = orderId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getPrice() {
        return price;
    }
}
