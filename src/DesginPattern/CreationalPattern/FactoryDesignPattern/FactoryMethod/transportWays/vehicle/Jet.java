package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.AirWays;

public class Jet extends AirWays {
    @Override
    public void transportShipment() {
        System.out.println("Transporting shipment by Airways on Jet");

    }
}
