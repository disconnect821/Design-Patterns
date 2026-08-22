package DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.factory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Button;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Scroll;

public interface UIFactory {
    Button createButton();
    Scroll createScroll();
}
