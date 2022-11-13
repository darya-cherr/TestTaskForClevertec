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
            case CAR -> new Car("model", "brand", 2001, "бензин", 23.5, 5);
            case TRUCK -> new Truck("model", "brand", 2012, "дизель", 19.9, 124, 45, TENT);
            case CARGO_PASSENGER_TRAFFIC ->
                    new CargoPassengerTraffic("model", "brand", 2004, "бензин", 16.8, 12, 23, 4);
            default -> throw new IllegalArgumentException("Wrong traffic type:" + trafficType);
        };

        traffics.add(traffic);
        return traffic;
    }

    public ArrayList<Traffic> getAllTraffics(){
        return traffics;
    }


}
