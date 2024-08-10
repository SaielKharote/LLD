package org.saiel.DesignPatterns.Creational.Factory;

import org.saiel.DesignPatterns.Creational.Factory.components.button.Button;
import org.saiel.DesignPatterns.Creational.Factory.components.button.IosButton;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.DropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.IosDropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.IosMenu;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Menu createMenu() {
        return new IosMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IosDropDown();
    }

    @Override
    public Button createButton() {
        return new IosButton();
    }
}
