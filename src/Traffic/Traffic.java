package Traffic;

import java.util.ArrayList;

public abstract class Traffic {

    int manufactureYear;
    String brand;
    String model;
    String fuelType;
    double fuelConsumption;

    ArrayList<Order> orders;

    public Traffic(){}

    public Traffic(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption){
        this.model = model;
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        orders = new ArrayList<>();
    }

    public void refuelTraffic(){
        System.out.println("Traffic is refueled!");
    }

    public void repairTraffic(){
        System.out.println("Traffic is repaired!");
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

    public ArrayList<Order> getOrders(){
        return orders;
    }

    public void addOrder(Order order){
        orders.add(order);
    }



}
