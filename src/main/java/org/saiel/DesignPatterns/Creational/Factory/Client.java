package org.saiel.DesignPatterns.Creational.Factory;

import org.saiel.DesignPatterns.Creational.Factory.components.button.Button;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.DropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.Mac);
        UIFactory uiFactory = flutter.createUIFactory();
        Menu menu = uiFactory.createMenu();
        DropDown dropDown = uiFactory.createDropDown();
        Button button = uiFactory.createButton();
    }
}
