package PizzaSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== CUSTOMER 1:REGULAR =====");
        CustomerInterface customer1 = new Customer("REGULAR", 2);
        if (customer1.getPizzaType() == "REGULAR") {
            RegularPizzaInterface regularPizza = new RegularPizza(101);
            ((RegularPizza) regularPizza).orderPizza(customer1.getSize());
            regularPizza.addExtraToppings();
        }
        System.out.println("===== CUSTOMER 2:PREMIUM =====");
        CustomerInterface customer2 = new Customer("PREMIUM", 2);
        if (customer2.getPizzaType() == "PREMIUM") {
            PremiumPizzaInterface premiumPizza = new PremiumPizza(102);
            ((PremiumPizza) premiumPizza).orderPizza(customer2.getSize());
            premiumPizza.addGourmetCrust();
        }
    }
}



