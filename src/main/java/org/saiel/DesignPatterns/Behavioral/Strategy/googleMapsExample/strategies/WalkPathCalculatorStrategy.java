package org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.strategies;

import org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.PathCalculatorStrategy;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy {   //making class Singleton
    private static WalkPathCalculatorStrategy instance;

    private WalkPathCalculatorStrategy() {
    }

    public static WalkPathCalculatorStrategy getInstance() {
        if (instance == null) {
            instance = new WalkPathCalculatorStrategy();
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path by Walking");
    }
}
