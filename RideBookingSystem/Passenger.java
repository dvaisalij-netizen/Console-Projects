package RideBookingSystem;

public class Passenger {
    private String destination;
        private String rideType;
        private CabRide cabRide;
        private AutoRide autoRide;
        public Passenger(String destination, String rideType)
        {
            this.destination = destination;
            this.rideType = rideType;
        }
        public Passenger()
        {
        }
        public String getDestination()
        {
            return destination;
        }
        public void setDestination(String destination)
        {
            this.destination = destination;
        }
        public String getRideType()
        {
            return rideType;
        }
        public void setRideType(String rideType)
        {
            this.rideType = rideType;
        }
        public CabRide getCabRide()
        {
            return cabRide;
        }
        public void setCabRide(CabRide cabRide)
        {
            this.cabRide = cabRide;
        }
        public AutoRide getAutoRide()
        {
            return autoRide;
        }
        public void setAutoRide(AutoRide autoRide)
        {
            this.autoRide = autoRide;
        }
    }

