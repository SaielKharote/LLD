package org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample;

public class ClientMaps {
    public static void main(String[] args) {
        PathCalculatorStrategy p = PathCalculatorFactory.getPathCalculator(ModeType.CAR);
        p.findPath("Mumbai", "Dubai");
    }
}
