package Foodordersystem;

public class Vegfood extends Orderedfood implements Vegfoodinterface
{
    public Vegfood(String foodId, Customerinterface customer) {
        this.setFoodId(foodId);
        this.setCustomer(customer);
    }
    public Vegfood() {
    }
}
