package org.saiel.DesignPatterns.Creational.Factory;


public class Flutter {
    public SupportedPlatforms platform;

    public Flutter (SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme() {
        System.out.println("Setting theme..");
    }

    public void setRefreshRate() {
        System.out.println("Setting refresh rate..");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.createUIFactory(platform);
    }
}
