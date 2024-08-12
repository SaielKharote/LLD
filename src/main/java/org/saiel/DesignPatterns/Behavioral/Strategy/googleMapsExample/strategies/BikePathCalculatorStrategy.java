package org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.strategies;

import org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.PathCalculatorStrategy;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path by Bike");
    }
}
