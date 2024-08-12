package org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.paymentStrategies;

import org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.PaymentStrategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {  //singleton class

    private static CreditCardPaymentStrategy instance;

    private CreditCardPaymentStrategy() {
    }

    public static CreditCardPaymentStrategy getInstance() {     //Singleton double check locking
        if (instance == null) {
            synchronized (CreditCardPaymentStrategy.class) {
                if (instance == null) {
                    synchronized (CreditCardPaymentStrategy.class) {
                        if (instance == null) {
                            instance = new CreditCardPaymentStrategy();
                        }
                    }
                }
            }
        }
        return instance;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Paying via Credit Card : " + amount);
    }
}
