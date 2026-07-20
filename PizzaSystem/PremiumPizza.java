package PizzaSystem;

public class PremiumPizza extends Pizza implements PremiumPizzaInterface {
    public PremiumPizza(int orderId) {
        super(orderId);
    }
    public void orderPizza(int size) {
        price = size * 200;
        System.out.println("Pizza Ordered");
        System.out.println("Price: " + price);
    }
    public void addGourmetCrust() {
        System.out.println("Gourmet Crust Added");
    }
}
