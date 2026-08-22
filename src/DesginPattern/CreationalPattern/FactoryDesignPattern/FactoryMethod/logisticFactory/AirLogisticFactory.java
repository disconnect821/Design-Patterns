package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.AirWays;

public class AirLogisticFactory implements Factory{
    @Override
    public AirWays createTransport() {
       return new AirWays();
    }
}
