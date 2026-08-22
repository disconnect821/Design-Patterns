package DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.factory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Button;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Scroll;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.WindowsButton;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.WindowsScroll;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Scroll createScroll() {
        return new WindowsScroll();
    }
}
