package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.AirWays;

public class Plane extends AirWays {
    @Override
    public void transportShipment() {
        System.out.println("Transporting shipment by Airways on Plane");

    }
}
