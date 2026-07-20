package RideBookingSystem;

public class AutoRide {
    private int rideId;
    private int fare;
    private Passenger passenger;
    public AutoRide(int rideId, int fare) {
        this.rideId = rideId;
        this.fare = fare;
    }
    public AutoRide() {
    }
    public void startRide(String destination) {
        fare = 50;
        System.out.println("Ride Started");
    }
    public int getRideId() {
        return rideId;
    }
    public int getFare() {
        return fare;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
