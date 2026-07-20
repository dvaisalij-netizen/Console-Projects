import java.util.ArrayList;

public class ParkingLot {

    private ArrayList<ParkingSlot> slots;

    public ParkingLot(int totalSlots) {

        slots = new ArrayList<>();

        for (int i = 1; i <= totalSlots; i++) {
            slots.add(new ParkingSlot(i));
        }
    }

    public void parkVehicle(Vehicle vehicle) {

        for (ParkingSlot slot : slots) {

            if (slot.isEmpty()) {

                slot.parkVehicle(vehicle);

                System.out.println("Vehicle Parked Successfully.");
                System.out.println("Slot Number : " + slot.getSlotNumber());

                return;
            }
        }

        System.out.println("Parking Full.");
    }

    public void removeVehicle(String vehicleNumber) {

        for (ParkingSlot slot : slots) {

            if (!slot.isEmpty()) {

                if (slot.getVehicle().getVehicleNumber().equalsIgnoreCase(vehicleNumber)) {

                    slot.removeVehicle();

                    System.out.println("Vehicle Removed Successfully.");
                    return;
                }
            }
        }

        System.out.println("Vehicle Not Found.");
    }

    public void searchVehicle(String vehicleNumber) {

        for (ParkingSlot slot : slots) {

            if (!slot.isEmpty()) {

                if (slot.getVehicle().getVehicleNumber().equalsIgnoreCase(vehicleNumber)) {

                    System.out.println("Vehicle Found");
                    System.out.println("Slot Number : " + slot.getSlotNumber());
                    System.out.println("Owner Name : " + slot.getVehicle().getOwnerName());
                    System.out.println("Vehicle Type : " + slot.getVehicle().getVehicleType());

                    return;
                }
            }
        }

        System.out.println("Vehicle Not Found.");
    }

    public void displayVehicles() {

        boolean found = false;

        System.out.println("\n----- Parked Vehicles -----");

        for (ParkingSlot slot : slots) {

            if (!slot.isEmpty()) {

                Vehicle v = slot.getVehicle();

                System.out.println("Slot Number : " + slot.getSlotNumber());
                System.out.println("Vehicle Number : " + v.getVehicleNumber());
                System.out.println("Owner Name : " + v.getOwnerName());
                System.out.println("Vehicle Type : " + v.getVehicleType());
                System.out.println("---------------------------");

                found = true;
            }
        }

        if (!found) {
            System.out.println("No Vehicles Parked.");
        }
    }
}
