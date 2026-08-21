package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays;

public class ShipWay implements Transport {
    @Override
    public void transportShipment() {
        System.out.println("Transporting shipment by Airways on Ship");
    }
}
