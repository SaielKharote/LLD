package org.saiel.DesignPatterns.Creational.Factory;

import org.saiel.DesignPatterns.Creational.Factory.components.button.AndroidButton;
import org.saiel.DesignPatterns.Creational.Factory.components.button.Button;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.AndroidDropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.DropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.AndroidMenu;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
