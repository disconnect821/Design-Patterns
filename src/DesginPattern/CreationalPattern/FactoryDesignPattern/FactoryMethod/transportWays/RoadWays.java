package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays;

public  class RoadWays implements Transport {
    @Override
    public void transportShipment() {
        System.out.println("Transporting shipment by Airways on Truck");
    }
}
