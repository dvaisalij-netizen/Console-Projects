package Foodordersystem;

public class Customer implements Customerinterface {

    private String foodType;
    private Orderedfoodinterface[] food = new Orderedfoodinterface[2];

    public Customer() {
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public Orderedfoodinterface[] getFood() {
        return food;
    }

    public void setFood(Orderedfoodinterface[] food) {
        this.food = food;
    }
}

