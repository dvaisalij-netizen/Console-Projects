
package MovieTicketSystem;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Viewerinterface viewer1=new Viewer();
        Viewerinterface viewer2=new Viewer();

        Scanner scanner=new Scanner(System.in);
        System.out.println("==========VIEWER1============");
        System.out.println("Enter the no.of Seats:");
        BigInteger inputNoFoSeats1=new BigInteger(scanner.nextLine());
        viewer1.setNumberOfSeats(inputNoFoSeats1.intValue());
        System.out.println("Enter the Screen type:");
        String inputScreenTyp1=scanner.nextLine();
        viewer1.setScreenType(inputScreenTyp1);
        System.out.println("Enter the Snacks want or not:");
        String inputWantSnacks1=scanner.nextLine();
        viewer1.setWantSnacks(inputWantSnacks1);
        System.out.println("Enter the Count of snacks");
        BigInteger inputSnackQuantity1=new BigInteger(scanner.nextLine());
        viewer1.setSnackQuantity(inputSnackQuantity1.intValue());

        System.out.println("==========VIEWER2============");
        System.out.println("Enter the no.of Seats:");
        BigInteger inputNoFoSeats2=new BigInteger(scanner.nextLine());
        viewer2.setNumberOfSeats(inputNoFoSeats2.intValue());
        System.out.println("Enter the Screen type:");
        String inputScreenTyp2=scanner.nextLine();
        viewer2.setScreenType(inputScreenTyp2);
        System.out.println("Enter the Snacks want or not:");
        String inputWantSnacks2=scanner.nextLine();
        viewer2.setWantSnacks(inputWantSnacks2);
        System.out.println("Enter the Count of snacks");
        BigInteger inputSnackQuantity2=new BigInteger(scanner.nextLine());
        viewer2.setSnackQuantity(inputSnackQuantity2.intValue());

        if (viewer1.getScreenType().equals("Gold")){
            System.out.println("==========VIEWER1============");
            Screeninterface gold=new GoldScreen("MG123",500,150,100,viewer1);
            Screeninterface [] arr=viewer1.getScreen();
            arr[0]=gold;
            System.out.println("BookingID:");
            System.out.println(arr[0].getBookingId());
            gold.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[0].getTicketPrice());
            gold.calculateSnackPrice();
            gold.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[0].getTotalBill());
            gold.applyDiscount();
        }
        else if (viewer1.getScreenType().equals("Silver")){
            System.out.println("==========VIEWER1============");
            Screeninterface silver=new SilverScreen("MS123",200,80,50,viewer1);
            Screeninterface [] arr=viewer1.getScreen();
            arr[1]=silver;
            System.out.println("BookingID:");
            System.out.println(arr[1].getBookingId());
            silver.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            silver.calculateSnackPrice();
            silver.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            silver.applyDiscount();
        }
        else {
            System.out.println("==========VIEWER1============");
            System.out.println("Screen type is not valid");
        }
        if (viewer2.getScreenType().equals("Gold")){
            System.out.println("==========VIEWER2============");
            Screeninterface gold=new GoldScreen("MG123",500,150,100,viewer2);
            Screeninterface [] arr=viewer2.getScreen();
            arr[0]=gold;
            System.out.println("BookingID:");
            System.out.println(arr[1].getBookingId());
            gold.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            gold.calculateSnackPrice();
            gold.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            gold.applyDiscount();
        }
        else if (viewer2.getScreenType().equals("Silver")){
            System.out.println("==========VIEWER2============");
            Screeninterface silver=new SilverScreen("MS123",200,80,50,viewer2);
            Screeninterface []arr=viewer2.getScreen();
            arr[1]=silver;
            System.out.println("BookingID:");
            System.out.println(arr[1].getBookingId());
            silver.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            silver.calculateSnackPrice();
            silver.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            silver.applyDiscount();
        }
        else {
            System.out.println("==========VIEWER2============");
            System.out.println("Screen type is not valid");
        }

    }
}
