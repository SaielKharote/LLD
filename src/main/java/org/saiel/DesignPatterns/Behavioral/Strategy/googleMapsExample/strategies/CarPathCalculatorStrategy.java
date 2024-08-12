package org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.strategies;

import org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.PathCalculatorStrategy;

public class CarPathCalculatorStrategy implements PathCalculatorStrategy {   //Singleton Class
    private static CarPathCalculatorStrategy instance;

    private CarPathCalculatorStrategy() {
    }

    public static CarPathCalculatorStrategy getInstance() {
        if (instance == null) {
            instance = new CarPathCalculatorStrategy();
        }
        return instance;
    }

    @Override
    public void findPath(String source, String destination) {
        System.out.println("Calculating path by Car");
    }
}
