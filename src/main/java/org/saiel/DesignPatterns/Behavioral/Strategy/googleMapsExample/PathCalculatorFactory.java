package org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample;

import org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.strategies.BikePathCalculatorStrategy;
import org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.strategies.CarPathCalculatorStrategy;
import org.saiel.DesignPatterns.Behavioral.Strategy.googleMapsExample.strategies.WalkPathCalculatorStrategy;


public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(ModeType modeType) {
        switch (modeType) {
            case ModeType.BIKE : return new BikePathCalculatorStrategy();   //bike is not singleton
            case ModeType.WALK : return WalkPathCalculatorStrategy.getInstance();  //walk is singleton
            case ModeType.CAR : return CarPathCalculatorStrategy.getInstance();    //car is singleton
        }
        return null;
    }
}
