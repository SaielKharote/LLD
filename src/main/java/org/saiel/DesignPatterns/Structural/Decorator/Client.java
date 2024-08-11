package org.saiel.DesignPatterns.Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCream ic = new ChocoChips(
                new ChocoScoop(
                        new ChocoChips(
                                new VanillaCone(
                                        new OrangeCone()))));

        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());


        ic = new Caramel(ic);
        System.out.println(ic.getCost());
        System.out.println(ic.getDescription());
    }
}
