package org.saiel.DesignPatterns.Structural.Decorator;

// this is just the base and can't be used as a topping
public class OrangeCone implements IceCream {

    int cost = 30;

    public OrangeCone() {
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
