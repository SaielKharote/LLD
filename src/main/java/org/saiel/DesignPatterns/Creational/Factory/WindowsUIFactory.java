package org.saiel.DesignPatterns.Creational.Factory;

import org.saiel.DesignPatterns.Creational.Factory.components.button.Button;
import org.saiel.DesignPatterns.Creational.Factory.components.button.WindowsButton;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.DropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.WindowsDropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.Menu;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new WindowsDropDown();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
