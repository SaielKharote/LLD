package org.saiel.DesignPatterns.Structural.Decorator;

public class ChocoChips implements IceCream {

    private IceCream iceCream;
    int cost = 10;
    public ChocoChips(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Choco Chips";
    }
}
