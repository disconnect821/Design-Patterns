package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.ShipWay;

public class Cruse extends ShipWay {
    @Override
    public void transportShipment() {
        System.out.println("Transporting shipment by Shipway on cruse");

    }
}
