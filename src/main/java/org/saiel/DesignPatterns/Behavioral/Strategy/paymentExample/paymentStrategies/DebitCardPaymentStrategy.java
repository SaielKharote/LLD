package org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.paymentStrategies;

import org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.PaymentStrategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    private static DebitCardPaymentStrategy instance;

    private DebitCardPaymentStrategy() {
    }

    public static DebitCardPaymentStrategy getInstance() {   //Singleton double check locking
        if (instance == null) {
            synchronized (DebitCardPaymentStrategy.class) {
                if (instance == null) {
                    instance = new DebitCardPaymentStrategy();
                }
            }
        }
        return instance;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Paying via Debit card : " + amount);
    }
}
