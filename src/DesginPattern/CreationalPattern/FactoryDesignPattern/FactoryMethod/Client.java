package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory.AirLogisticFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory.RoadLogisticFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory.ShipLogisticFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.AirWays;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.Transport;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        AirLogisticFactory airLogisticFactory = new AirLogisticFactory();
        Transport airplane = airLogisticFactory.createTransport("Plane");
        airplane.transportShipment();

        Transport jet = airLogisticFactory.createTransport("Jet");
        jet.transportShipment();

        ShipLogisticFactory shipLogisticFactory = new ShipLogisticFactory();
        Transport titanic = shipLogisticFactory.createTransport("titanic");
        titanic.transportShipment();

        RoadLogisticFactory roadLogisticFactory = new RoadLogisticFactory();
        Transport truck = roadLogisticFactory.createTransport("Truck");
        truck.transportShipment();
    }
}
