package DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("MacOS Button Rendered");
    }
}
