package PizzaSystem;

public class Customer implements CustomerInterface {

    private String pizzaType;
    private int size;

    // Parameterized constructor
    public Customer(String pizzaType, int size) {
        this.pizzaType = pizzaType;
        this.size = size;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public int getSize() {
        return size;
    }
}
