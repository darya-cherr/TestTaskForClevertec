package Traffic;

import java.util.ArrayList;
import java.util.List;

public class Order {

    String startingPoint;
    String endingPoint;
    int cargoVolume;
    int cargoWeight;
    int passengerNumber;
    CargoType cargoType;

    public Order(String startingPoint, String endingPoint, int cargoVolume, int cargoWeight, CargoType cargoType){
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.cargoVolume = cargoVolume;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
    }

    public Order(String startingPoint, String endingPoint, int passengerNumber){
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.passengerNumber = passengerNumber;
    }

    public Order(String startingPoint, String endingPoint, int cargoVolume, int cargoWeight, CargoType cargoType, int passengerNumber){
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
        this.cargoVolume = cargoVolume;
        this.cargoWeight = cargoWeight;
        this.cargoType = cargoType;
        this.passengerNumber = passengerNumber;
    }

    public List<Traffic> findTrafficForOrder(ArrayList<Traffic> traffics){
        List<Traffic> selectedTrafficType = traffics.stream().filter(e -> e.getClass() == Car.class).toList();
        for (Traffic traffic : traffics) {
            if (passengerNumber == 0) {
               // findCar(order);
            } else if (cargoType != null) {

            } else {

            }
        }
        return selectedTrafficType;
    }

    private Car findCar(Order order){
        Car car = null;

        return car;
    }

    private Truck findTruck(Order order){
        Truck truck = null;

        return truck;
    }

    private CargoPassengerTraffic findCargoPassengerTraffic(Order order){
        CargoPassengerTraffic cargoPassengerTraffic = null;


        return cargoPassengerTraffic;
    }

}
