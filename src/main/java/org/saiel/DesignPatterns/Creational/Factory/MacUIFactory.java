package org.saiel.DesignPatterns.Creational.Factory;

import org.saiel.DesignPatterns.Creational.Factory.components.button.Button;
import org.saiel.DesignPatterns.Creational.Factory.components.button.MacButton;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.DropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.MacDropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.MacMenu;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.Menu;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public DropDown createDropDown() {
        return new MacDropDown();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
