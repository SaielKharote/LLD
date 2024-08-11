package org.saiel.DesignPatterns.Structural.Decorator;

// this can be used as both base and topping
public class VanillaCone implements IceCream {

    private IceCream iceCream;
    int cost = 25;

    public VanillaCone() {              // when it is a base
    }

    public VanillaCone(IceCream iceCream) {   // when it is a topping
        this.iceCream = iceCream;
    }

    @Override
    public int getCost() {
        if (iceCream == null) {   //base
            return cost;
        }
        else {                    //topping
            return iceCream.getCost() + cost;
        }
    }

    @Override
    public String getDescription() {
        if (iceCream == null) {    //base
            return "Vanilla Cone";
        }
        else {                     //topping
            return iceCream.getDescription() + " Vanilla Cone";
        }
    }
}
