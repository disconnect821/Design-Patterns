package DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory;

import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.factory.MacOsUIFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.factory.UIFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.factory.WindowsUIFactory;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Button;
import DesginPattern.CreationalPattern.FactoryDesignPattern.AbstractFactory.product.Scroll;

public class Client {
    public static void main(String[] args) {

        //Windows UI
        UIFactory windowsUI = new WindowsUIFactory();
        Button windowsButton = windowsUI.createButton();
        windowsButton.render();

        Scroll windowsScroll = windowsUI.createScroll();
        windowsScroll.scroll();

        //MacOS UI
        UIFactory macUIFactory = new MacOsUIFactory();
        Button macOSButton = macUIFactory.createButton();
        Scroll macOSscroll = macUIFactory.createScroll();

        macOSscroll.scroll();
        macOSButton.render();


        //In specific UI, client can get specific button or scroll of specific UI only.
        //They cannot access button and macOS of different UIs.
    }
}
