package Traffic;

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

}
