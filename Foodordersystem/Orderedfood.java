package Foodordersystem;

public abstract class Orderedfood implements Orderedfoodinterface {

    private String foodId;
    private Customerinterface customer;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public Customerinterface getCustomer() {
        return customer;
    }

    public void setCustomer(Customerinterface customer) {
        this.customer = customer;
    }

    public void orderFood() {
        System.out.println("Food ordered successfully");
    }
}
