package DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product;

public class WindowsScroll implements Scroll {
    @Override
    public void scroll() {
        System.out.println("Windows OS scroll");
    }
}
