package Traffic;

public class CargoPassengerTraffic extends Traffic implements CarInterface, TruckInterface{
    Car car;
    Truck truck;

    public CargoPassengerTraffic(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption, int bodyVolume, int loadCapacity, int  passengerCapacity){
        super(model, brand, manufactureYear, fuelType, fuelConsumption);
        car = new Car(passengerCapacity);
        truck = new Truck(bodyVolume, loadCapacity);
    }


    @Override
    public void disinfectCarInterior() {
        car.disinfectCarInterior();
    }

    @Override
    public int getFreePassengerCapacity() {
        return car.getFreePassengerCapacity();
    }

    @Override
    public void sealTruckBody() {
        truck.sealTruckBody();
    }

    @Override
    public BodyType getBodyType() {
       return truck.getBodyType();
    }

    @Override
    public int getFreeBodyVolume() {
        return truck.getFreeBodyVolume();
    }

    @Override
    public int getFreeLoadCapacity() {
        return truck.getFreeLoadCapacity();
    }
}
