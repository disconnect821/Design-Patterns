package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.ShipWay;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle.Cruse;
import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.vehicle.Titanic;

public class ShipLogisticFactory implements Factory<ShipWay> {
    @Override
    public ShipWay createTransport(String transportType) {
        return switch (transportType) {
            case "cruse" -> new Cruse();
            case "titanic" -> new Titanic();
            default -> throw new IllegalArgumentException("Invalid Type");
        };
    }
}
