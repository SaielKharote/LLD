package org.saiel.DesignPatterns.Creational.Factory;


public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatforms platform) {
        return switch (platform) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            case WINDOWS -> new WindowsUIFactory();
            case Mac -> new MacUIFactory();
        };
    }
}
