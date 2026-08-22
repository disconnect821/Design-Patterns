package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.RoadWays;

public class RoadLogisticFactory implements Factory{
    @Override
    public RoadWays createTransport() {
        return new RoadWays();
    }
}
