package DesginPattern.CreationalPattern.FactoryDesignPattern.simpleFactory;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        Vehicle vehicle = VehicleFactory.getInstance("Car");
        vehicle.transport();

        Vehicle rideVehicle = VehicleFactory.getInstance("Bike");
        rideVehicle.transport();
    }
}
