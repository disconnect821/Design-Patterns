package DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.factory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Button;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.MacOsButton;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.MacOsScroll;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Scroll;

public class MacOsUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Scroll createScroll() {
        return new MacOsScroll();
    }
}
