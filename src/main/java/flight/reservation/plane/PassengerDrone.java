package flight.reservation.plane;

public class PassengerDrone extends IdentifiedFlightObject{

    public PassengerDrone(String model) {
        this.passengerCapacity = 4;

        if (model.equals("HypaHype")) {
            this.model = model;
        } else {
            throw new IllegalArgumentException(String.format("Model type '%s' is not recognized", model));
        }
    }
}
