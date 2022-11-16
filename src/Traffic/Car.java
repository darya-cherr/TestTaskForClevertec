package Traffic;

public class Car extends Traffic implements CarInterface{
     int  passengerCapacity;
     int freePassengerCapacity;
     public Car(int passengerCapacity){
         this.passengerCapacity = passengerCapacity;
         this.freePassengerCapacity = passengerCapacity;
     }

    public Car(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption, int passengerCapacity){
        super(model, brand, manufactureYear, fuelType, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
        this.freePassengerCapacity = passengerCapacity;
    }

    public void disinfectCarInterior(){
        System.out.println("Car interior is disinfected!");
    }

    public int getFreePassengerCapacity() {
        return freePassengerCapacity;
    }
}
