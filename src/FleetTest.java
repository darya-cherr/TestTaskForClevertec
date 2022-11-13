import Traffic.*;
import org.junit.Assert;
import org.junit.Test;


import static Traffic.TrafficType.*;
import static org.junit.Assert.*;

public class FleetTest {

    @Test
    public void createTraffics() {
//        Car car = new Car("model", "brand", 2001, "бензин", 23.5, 5);
//        Car car1 = new Car("model1", "brand1", 2021, "электро", 19.4, 2);
//        Truck truck = new Truck("model", "brand", 2012, "дизель", 19.9, 124, 45);
//        Truck truck1 = new Truck("model1", "brand1", 2002, "бензин", 16.8, 24, 67);
//        CargoPassengerTraffic cpt = new CargoPassengerTraffic("model", "brand", 2004, "бензин", 16.8, 12, 23, 4);
//        CargoPassengerTraffic cpt1 = new CargoPassengerTraffic("model1", "brand1", 2014, "дизель", 14.5, 14, 22, 2);
//
//        String expected = car.getModel();
//        String actual = "model";
//        Assert.assertEquals(expected, actual);
          TrafficFactory trafficFactory = new TrafficFactory();
          Car car =  (Car)trafficFactory.createTraffic(CAR);

          Assert.assertEquals("model", car.getModel());

    }
}