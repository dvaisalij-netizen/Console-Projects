package Foodordersystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customerinterface customer1 = new Customer();
        Customerinterface customer2 = new Customer();

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter food type for Customer1 (veg / nonveg):");
            customer1.setFoodType(sc.nextLine());
            System.out.println("Enter food type for Customer2 (veg / nonveg):");
            customer2.setFoodType(sc.nextLine());

            System.out.println("=======Customer1========");
            if (customer1.getFoodType()==("veg")) {
                Vegfoodinterface veg = new Vegfood("V101", customer1);
                veg.orderFood();
                Orderedfoodinterface[] arr = customer1.getFood();
                arr[0] = veg;
                System.out.println(arr[0].getFoodId());

            }
            else
            {
                Nonvegfoodinterface nonVeg = new Nonvegfood("N101", customer1);
                nonVeg.orderFood();
                Orderedfoodinterface[] arr = customer1.getFood();
                arr[1] = nonVeg;
                System.out.println(arr[1].getFoodId());
            }

            System.out.println("=======Customer2==========");
            if (customer2.getFoodType()==("veg")) {
                Vegfoodinterface veg = new Vegfood("V202", customer2);
                veg.orderFood();
                Orderedfoodinterface[] arr = customer2.getFood();
                arr[0] = veg;
                System.out.println(arr[0].getFoodId());
            }
            else
            {
                Nonvegfoodinterface nonVeg = new Nonvegfood("N202", customer2);
                nonVeg.orderFood();
                Orderedfoodinterface[] arr = customer2.getFood();
                arr[1] = nonVeg;
                System.out.println(arr[1].getFoodId());
            }
        }
    }







