package Traffic;

public class CargoPassengerTraffic extends Traffic{
    Car car;
    Truck truck;

    public CargoPassengerTraffic(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption, int bodyVolume, int loadCapacity, int  passengerCapacity){
        super(model, brand, manufactureYear, fuelType, fuelConsumption);
        car = new Car(passengerCapacity);
        truck = new Truck(bodyVolume, loadCapacity);
    }





}
