package Foodordersystem;

public class Nonvegfood extends Orderedfood implements Nonvegfoodinterface {
    public Nonvegfood(String foodId, Customerinterface customer) {
        this.setFoodId(foodId);
        this.setCustomer(customer);
    }
    public Nonvegfood() {
    }
}

