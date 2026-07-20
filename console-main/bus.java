public class Bus extends Vehicle {

    public Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    public String getVehicleType() {
        return "Bus";
    }
}
