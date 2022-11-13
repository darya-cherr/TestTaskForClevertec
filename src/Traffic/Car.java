package Traffic;

public class Car extends Traffic {
     int  passengerCapacity;
     public Car(int passengerCapacity){
         this.passengerCapacity = passengerCapacity;
     }

    public Car(String model, String brand, int manufactureYear, String fuelType, double fuelConsumption, int passengerCapacity){
        super(model, brand, manufactureYear, fuelType, fuelConsumption);
        this.passengerCapacity = passengerCapacity;
    }

    public void disinfectCarInterior(){
        System.out.println("Car interior is disinfected!");
    }

}
