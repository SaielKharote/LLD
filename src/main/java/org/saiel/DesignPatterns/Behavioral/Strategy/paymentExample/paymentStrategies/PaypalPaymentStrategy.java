package org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.paymentStrategies;

import org.saiel.DesignPatterns.Behavioral.Strategy.paymentExample.PaymentStrategy;

public class PaypalPaymentStrategy implements PaymentStrategy {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paying via Paypal : " + amount);
    }
}
