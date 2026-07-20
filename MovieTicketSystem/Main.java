package MovieTicketSystem;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Viewerinterface viewer1=new Viewer();
        Viewerinterface viewer2=new Viewer();
        //Scanner method
        Scanner scanner=new Scanner(System.in);
        //value for viewer 1
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

        if (viewer1.getScreenType().equals("Gold")){
            System.out.println("==========VIEWER1============");
            int [] [] goldScreen=new int[6][5];
            goldScreen[0]=new int [] {1,2,3,4,5};
            for(int i=0;i<goldScreen.length;i++){//out side loop in is no of row (ie) A,B,C
                if (i !=0) {
                    System.out.print((char) (65 + i-1));
                    System.out.print(" ");
                }
                for (int j=0;j<goldScreen[i].length;j++){//inside loop/element
                    if (i==0 && j==0) {
                        System.out.print("  ");
                    }
                    System.out.print(goldScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<viewer1.getNumberOfSeats();i++){
                boolean isValidSeat=false;
                boolean isAlreadyBookedSeat=false;
                while (!isValidSeat||!isAlreadyBookedSeat) {
                    try {
                        System.out.println("Enter the seat:");
                        String row = scanner.nextLine();
                        char[] chVar = row.toCharArray();
                        int finalRow = chVar[0] - 65;
                        BigInteger seatNum = new BigInteger(String.valueOf(chVar[1]));
                        int finalSeat=seatNum.intValue()-1;
                        if (goldScreen[finalRow+1][finalSeat]==1) {
                            isAlreadyBookedSeat=true;
                            System.out.println("This is already booked ,try for another seats");
                        }
                        goldScreen[finalRow+1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat=true;
                    } catch (Exception e) {
                        System.out.println("This is invalid seat,please enter a valid seat");
                        isValidSeat=false;
                    }
                }
            }
            Screeninterface gold=new GoldScreen("MG123",500,150,100,viewer1);
            Screeninterface [] arr=viewer1.getScreen();
            arr[0]=gold;
            System.out.println("+BookingID:");
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
            int [] [] silverScreen=new int[6][5];
            silverScreen[0]=new int [] {1,2,3,4,5};
            for(int i=0;i<silverScreen.length;i++){//out side loop in is no of row (ie) A,B,C
                if (i !=0) {
                    System.out.print((char) (65 + i-1));
                    System.out.print(" ");
                }
                for (int j=0;j<silverScreen[i].length;j++){//inside loop/element
                    if (i==0 && j==0) {
                        System.out.print("  ");
                    }
                    System.out.print(silverScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<viewer1.getNumberOfSeats();i++){
                boolean isValidSeat=false;
                boolean isAlreadyBookedSeat=false;
                while (!isValidSeat||!isAlreadyBookedSeat) {
                    try {
                        System.out.println("Enter the seat:");
                        String row = scanner.nextLine();
                        char[] chVar = row.toCharArray();
                        int finalRow = chVar[0] - 65;
                        BigInteger seatNum = new BigInteger(String.valueOf(chVar[1]));
                        int finalSeat=seatNum.intValue()-1;
                        if (silverScreen[finalRow+1][finalSeat]==1) {
                            isAlreadyBookedSeat=true;
                            System.out.println("This is already booked ,try for another seats");
                        }
                        silverScreen[finalRow+1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat=true;
                    } catch (Exception e) {
                        System.out.println("This is invalid seat,please enter a valid seat");
                        isValidSeat=false;
                    }

                }
            }
            Screeninterface silver=new SilverScreen("MS123",200,80,50,viewer1);
            Screeninterface [] arr=viewer1.getScreen();
            arr[1]=silver;
            //method 1
            System.out.println("BookingID:");
            System.out.println(arr[1].getBookingId());
            silver.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            //method 2
            silver.calculateSnackPrice();
            //method 3
            silver.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            //method 3
            silver.applyDiscount();
        }
        else {
            System.out.println("==========VIEWER1============");
            System.out.println("Screen type is not valid");
        }
        //value for viewer 2
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
        if (viewer2.getScreenType().equals("Gold")){
            System.out.println("==========VIEWER2============");
            int [] [] goldScreen=new int[6][5];
            goldScreen[0]=new int [] {1,2,3,4,5};
            for(int i=0;i<goldScreen.length;i++){//out side loop in is no of row (ie) A,B,C
                if (i !=0) {
                    System.out.print((char) (65 + i-1));
                    System.out.print(" ");
                }
                for (int j=0;j<goldScreen[i].length;j++){//inside loop/element
                    if (i==0 && j==0) {
                        System.out.print("  ");
                    }
                    System.out.print(goldScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<viewer2.getNumberOfSeats();i++){
                boolean isValidSeat=false;
                boolean isAlreadyBookedSeat=false;
                while (!isValidSeat||!isAlreadyBookedSeat) {
                    try {
                        System.out.println("Enter the seat:");
                        String row = scanner.nextLine();
                        char[] chVar = row.toCharArray();
                        int finalRow = chVar[0] - 65;
                        BigInteger seatNum = new BigInteger(String.valueOf(chVar[1]));
                        int finalSeat=seatNum.intValue()-1;
                        if (goldScreen[finalRow+1][finalSeat]==1) {
                            isAlreadyBookedSeat=true;
                            System.out.println("This is already booked ,try for another seats");
                        }
                        goldScreen[finalRow+1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat=true;
                    } catch (Exception e) {
                        System.out.println("This is invalid seat,please enter a valid seat");
                        isValidSeat=false;
                    }

                }
            }
            Screeninterface gold=new GoldScreen("MG123",500,150,100,viewer2);

            Screeninterface [] arr=viewer2.getScreen();
            arr[0]=gold;
            System.out.println("BookingID:");
            System.out.println(arr[1].getBookingId());
            //method 1
            gold.calculateTicketPrice();
            System.out.println("Ticket Price:");
            System.out.println(arr[1].getTicketPrice());
            //method 2
            gold.calculateSnackPrice();
            //method 3
            gold.generateBill();
            System.out.println("Total Bill");
            System.out.println(arr[1].getTotalBill());
            //method 3
            gold.applyDiscount();
        }
        else if (viewer2.getScreenType().equals("Silver")){
            System.out.println("==========VIEWER2============");
            int [] [] silverScreen=new int[6][5];
            silverScreen[0]=new int [] {1,2,3,4,5};
            for(int i=0;i<silverScreen.length;i++){//out side loop in is no of row (ie) A,B,C
                if (i !=0) {
                    System.out.print((char) (65 + i-1));
                    System.out.print(" ");
                }
                for (int j=0;j<silverScreen[i].length;j++){//inside loop/element
                    if (i==0 && j==0) {
                        System.out.print("  ");
                    }
                    System.out.print(silverScreen[i][j]);
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<viewer2.getNumberOfSeats();i++){
                boolean isValidSeat=false;
                boolean isAlreadyBookedSeat=false;
                while (!isValidSeat||!isAlreadyBookedSeat) {
                    try {
                        System.out.println("Enter the seat:");
                        String row = scanner.nextLine();
                        char[] chVar = row.toCharArray();
                        int finalRow = chVar[0] - 65;
                        BigInteger seatNum = new BigInteger(String.valueOf(chVar[1]));
                        int finalSeat=seatNum.intValue()-1;
                        if (silverScreen[finalRow+1][finalSeat]==1) {
                            isAlreadyBookedSeat=true;
                            System.out.println("This is already booked ,try for another seats");
                        }
                        silverScreen[finalRow+1][finalSeat] = 1;
                        isValidSeat = true;
                        isAlreadyBookedSeat=true;
                    } catch (Exception e) {
                        System.out.println("This is invalid seat,please enter a valid seat");
                        isValidSeat=false;
                    }

                }
            }
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