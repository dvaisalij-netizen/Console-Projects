package RideBookingSystem;

public class CabRide
{
    private int rideId;
    private int fare;
    private Passenger passenger;
    public CabRide(int rideId, int fare)
    {
        this.rideId = rideId;
        this.fare = fare;
    }
    public CabRide() {
    }
    public void startRide(String destination)
    {
        fare = 100;
        System.out.println("Ride Started");
    }
    public int getRideId()
    {
        return rideId;
    }
    public int getFare()
    {
        return fare;
    }
    public void setPassenger(Passenger passenger)
    {
        this.passenger = passenger;
    }
}
