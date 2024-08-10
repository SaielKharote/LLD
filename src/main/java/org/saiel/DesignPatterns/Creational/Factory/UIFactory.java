package org.saiel.DesignPatterns.Creational.Factory;

import org.saiel.DesignPatterns.Creational.Factory.components.button.Button;
import org.saiel.DesignPatterns.Creational.Factory.components.dropdown.DropDown;
import org.saiel.DesignPatterns.Creational.Factory.components.menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Button createButton();
    DropDown createDropDown();
}
