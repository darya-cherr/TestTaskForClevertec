package Traffic;

public abstract class Traffic {

    int manufactureYear;
    String brand;
    String model;
    String fuelType;
    double fuelConsumption;

    public Traffic(){}

    public Traffic(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption){
        this.model = model;
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
    }

    public void refuelTraffic(){

    }

    public void repairTraffic(){

    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
