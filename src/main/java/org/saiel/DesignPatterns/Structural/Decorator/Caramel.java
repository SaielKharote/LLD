package org.saiel.DesignPatterns.Structural.Decorator;

public class Caramel implements IceCream {
    private IceCream iceCream;
    int cost = 45;

    public Caramel(IceCream iceCream) {
        this.iceCream = iceCream;
    }


    @Override
    public int getCost() {
        return iceCream.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Caramel";
    }
}
