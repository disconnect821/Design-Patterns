package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.transportWays.Transport;

public interface Factory {
    Transport createTransport();
}
