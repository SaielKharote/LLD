package org.saiel.DesignPatterns.Creational.Singleton.Singlethreaded;

public class Main {
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance("Foo");
        Singleton object2 = Singleton.getInstance("Bar");

        System.out.println(object1.value);
        System.out.println(object2.value);
    }
}
