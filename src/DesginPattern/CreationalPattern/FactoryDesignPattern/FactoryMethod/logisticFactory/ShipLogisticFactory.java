package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.ShipWay;

public class ShipLogisticFactory implements Factory{
    @Override
    public ShipWay createTransport() {
       return new ShipWay();
    }
}
