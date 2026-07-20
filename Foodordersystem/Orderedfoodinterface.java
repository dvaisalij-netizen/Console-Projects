package Foodordersystem;

public interface Orderedfoodinterface
{
    String getFoodId();
    void setFoodId(String foodId);
    Customerinterface getCustomer();
    void setCustomer(Customerinterface customer);
    void orderFood();
}
