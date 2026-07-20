package PizzaSystem;

public abstract class Pizza extends BaseFunctionality implements PizzaInterface {
    public Pizza(int orderId) {
        super(orderId);
    }
    public void cancelPizza() {
        System.out.println("Pizza Cancelled");
    }
}
