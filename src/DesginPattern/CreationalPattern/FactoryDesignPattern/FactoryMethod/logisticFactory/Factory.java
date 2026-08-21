package DesginPattern.CreationalPattern.FactoryDesignPattern.FactoryMethod.logisticFactory;

public interface Factory<T> {
    T createTransport(String transportType);
}
