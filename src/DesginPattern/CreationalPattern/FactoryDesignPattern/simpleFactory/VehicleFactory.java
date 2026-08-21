package DesginPattern.CreationalPattern.FactoryDesignPattern.simpleFactory;

public class VehicleFactory {
    public static Vehicle getInstance(String  vehicle) throws IllegalAccessException {
       if(vehicle.equals("Car")){
           return new Car();
       }else if(vehicle.equals("Bike")){
           return new Bike();
       }
       throw new IllegalAccessException("Invalid Type");
    }
}
