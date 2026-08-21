package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.RoadWays;

public class Truck extends RoadWays {
    @Override
    public void transportShipment() {
        System.out.println("Transporting shipment by RoadWays on Truck");
    }
}
