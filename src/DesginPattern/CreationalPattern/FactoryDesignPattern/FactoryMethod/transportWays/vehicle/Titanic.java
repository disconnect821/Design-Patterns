package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.ShipWay;

public class Titanic extends ShipWay {
    @Override
    public void transportShipment() {
        System.out.println("Transporting shipment by ShipWays on Titanic");
    }
}
