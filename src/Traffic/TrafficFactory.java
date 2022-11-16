package Traffic;

import java.util.ArrayList;

import static Traffic.BodyType.*;

public class TrafficFactory {

    ArrayList<Traffic> traffics;
    public TrafficFactory(){
        traffics = new ArrayList<>();
    }

    public Traffic createTraffic(TrafficType trafficType) {
        Traffic traffic = switch (trafficType) {
            case CAR -> new Car("modelCar", "brand", 2001, "gasoline", 23.5, 5);
            case TRUCK -> new Truck("modelTruck", "brand", 2012, "diesel", 19.9, 124, 45, TENT);
            case CARGO_PASSENGER_TRAFFIC ->
                    new CargoPassengerTraffic("modelCPT", "brand", 2004, "gasoline", 16.8, 12, 23, 4);
            default -> throw new IllegalArgumentException("Wrong traffic type:" + trafficType);
        };

        traffics.add(traffic);
        return traffic;
    }

    public ArrayList<Traffic> getAllTraffics(){
        return traffics;
    }


}
