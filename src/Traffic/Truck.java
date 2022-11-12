package Traffic;

public class Truck extends Traffic {
    int bodyVolume;
    int loadCapacity;

    public Truck(int bodyVolume, int loadCapacity){
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
    }

    public Truck(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption, int bodyVolume, int loadCapacity){
        super(model, brand, manufactureYear, fuelType, fuelConsumption);
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
    }

    public void sealTruckBody(){

    }

}
