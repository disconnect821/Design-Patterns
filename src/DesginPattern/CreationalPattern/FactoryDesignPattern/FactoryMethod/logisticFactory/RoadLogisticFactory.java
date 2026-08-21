package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.RoadWays;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle.Truck;

public class RoadLogisticFactory implements Factory<RoadWays>{
    @Override
    public RoadWays createTransport(String transportType) {
        return switch (transportType) {
            case "Truck" -> new Truck();
            default -> throw new IllegalArgumentException("Invalid Type");
        };
    }
}
