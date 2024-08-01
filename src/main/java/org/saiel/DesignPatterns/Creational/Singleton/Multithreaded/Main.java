package org.saiel.DesignPatterns.Singleton.Multithreaded;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new ThreadFoo());
        Thread thread2 = new Thread(new ThreadBar());

        thread1.start();
        thread2.start();

    }
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Foo");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Bar");
            System.out.println(singleton.value);
        }
    }
}
