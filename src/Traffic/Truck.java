package Traffic;

public class Truck extends Traffic {
    int bodyVolume;
    int loadCapacity;
    BodyType bodyType;
    int freeBodyVolume;
    int freeLoadCapacity;


    public Truck(int bodyVolume, int loadCapacity){
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
    }

    public Truck(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption, int bodyVolume, int loadCapacity, BodyType bodyType){
        super(model, brand, manufactureYear, fuelType, fuelConsumption);
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
    }

    public void sealTruckBody(){

    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public int getBodyVolume(){
        return bodyVolume;
    }

    public int getFreeBodyVolume(){
        return freeBodyVolume;
    }

    public int getFreeLoadCapacity(){
        return freeLoadCapacity;
    }
}
