package PizzaSystem;

public class RegularPizza extends Pizza implements RegularPizzaInterface {
    public RegularPizza(int orderId) {
        super(orderId);
    }
    public void orderPizza(int size) {
        price = size * 100;
        System.out.println("Pizza Ordered");
        System.out.println("Price: " + price);
    }
    public void orderPizza(int size, boolean cheeseBurst) {
        price = size * 100;
        if (cheeseBurst) {
            price += 50;
        }
        System.out.println("Pizza Ordered");
        System.out.println("Price: " + price);
    }
    public void addExtraToppings() {
        System.out.println("Extra Toppings Added");
    }
}
