package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.AirWays;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle.Jet;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle.Plane;

public class AirLogisticFactory implements Factory<AirWays> {
    @Override
    public AirWays createTransport(String transportType) {
        return switch (transportType) {
            case "Plane" -> new Plane();
            case "Jet" -> new Jet();
            default -> throw new IllegalArgumentException("Invalid Type");
        };
    }
}
