import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ParkingLot parkingLot = new ParkingLot(10);

        while (true) {

            System.out.println("\n===== Parking Management System =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Remove Vehicle");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Display Vehicles");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.println("Select Vehicle Type");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Bus");

                    System.out.print("Enter choice : ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Vehicle Number : ");
                    String number = sc.nextLine();

                    System.out.print("Enter Owner Name : ");
                    String owner = sc.nextLine();

                    Vehicle vehicle;

                    if (type == 1) {
                        vehicle = new Car(number, owner);
                    } else if (type == 2) {
                        vehicle = new Bike(number, owner);
                    } else if (type == 3) {
                        vehicle = new Bus(number, owner);
                    } else {
                        System.out.println("Invalid Vehicle Type.");
                        break;
                    }

                    parkingLot.parkVehicle(vehicle);
                    break;

                case 2:

                    System.out.print("Enter Vehicle Number : ");
                    String removeNumber = sc.nextLine();

                    parkingLot.removeVehicle(removeNumber);
                    break;

                case 3:

                    System.out.print("Enter Vehicle Number : ");
                    String searchNumber = sc.nextLine();

                    parkingLot.searchVehicle(searchNumber);
                    break;

                case 4:

                    parkingLot.displayVehicles();
                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
