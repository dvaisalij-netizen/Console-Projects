package Foodordersystem;

public interface Customerinterface
{
    String getFoodType();
    void setFoodType(String foodType);
    Orderedfoodinterface[] getFood();
    void setFood(Orderedfoodinterface[] food);
}
