package RideBookingSystem;

public class Main {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Airport", "Cab");
        Passenger passenger2 = new Passenger();
        passenger2.setDestination("Mall");
        passenger2.setRideType("Auto");
        if (passenger1.getRideType() == "Cab") {
            CabRide cab = new CabRide(101, 0);
            cab.startRide(passenger1.getDestination());
            passenger1.setCabRide(cab);
            cab.setPassenger(passenger1);
        }
        if (passenger2.getRideType() == "Auto") {
            AutoRide auto = new AutoRide(202, 0);
            auto.startRide(passenger2.getDestination());
            passenger2.setAutoRide(auto);
            auto.setPassenger(passenger2);
        }
        System.out.println("Passenger 1 Fare: " + passenger1.getCabRide().getFare() + " | RideId: " +
                        passenger1.getCabRide().getRideId()
        );
        System.out.println("Passenger 2 Fare: " + passenger2.getAutoRide().getFare() + " | RideId: " +
                        passenger2.getAutoRide().getRideId()
        );
    }
}
