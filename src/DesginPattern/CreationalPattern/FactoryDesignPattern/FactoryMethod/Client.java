package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory.AirLogisticFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory.ShipLogisticFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.Transport;

public class Client {
    public static void main(String[] args) throws IllegalAccessException {
        AirLogisticFactory airLogisticFactory = new AirLogisticFactory();
        Transport airplane = airLogisticFactory.createTransport();
        airplane.transportShipment();

        ShipLogisticFactory shipLogisticFactory = new ShipLogisticFactory();
        Transport ship = shipLogisticFactory.createTransport();
        ship.transportShipment();

    }
}
